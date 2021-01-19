package DAO;
import java.io.*;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.JComboBox;

import DTO.AccountDTO;
import DTO.BookDTO;
public class BookDAO {
	//add
			public static int addBook(BookDTO a) {
				int result = 0;
				Connection conn;
				PreparedStatement ps;
				ResultSet r;
				try {
					String query1 = "SELECT TypeOfBook.Id AS TypeID,Author.Id AS AuthorID,Publisher.Id AS PublisherID FROM TypeOfBook,Author,Publisher WHERE TypeOfBook.TypeName=N'"+a.getTypeName()+"' AND Author.AuthorName=N'"+a.getAuthorName()+"' AND Publisher.PublisherName=N'"+a.getPublisherName()+"'";
					conn = ConnectionUtils.getConnection();
					ps = conn.prepareStatement(query1);
					r = ps.executeQuery();
					int typeID,authorID,publisherID;
					if(r.next()) {
						typeID = r.getInt("TypeID");
						authorID = r.getInt("AuthorID");
						publisherID = r.getInt("PublisherID");
						
						String date = (new SimpleDateFormat("dd-MM-yyyy")).format(a.getDateIn());
						conn = ConnectionUtils.getConnection();
						String sqlInsert = "INSERT INTO Book (TypeID, AuthorID, PublisherID, BookName, DateIn, Condition, Status) "
			                    + " VALUES ("+typeID+", "+authorID+", "+publisherID+" ,N'"+a.getBookName()+"', '"+date+"', N'"+a.getCondition()+"', N'"+a.getStatus()+"')";
						java.sql.Statement st = conn.createStatement();
						result = st.executeUpdate(sqlInsert);
						conn.close();
					}
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				return result;
			}
			//update
			public static int updateBook(int id,BookDTO a) {
				int result = 0;
				Connection conn;
				PreparedStatement ps;
				ResultSet r;
				try {
					String query1 = "SELECT TypeOfBook.Id AS TypeID,Author.Id AS AuthorID,Publisher.Id AS PublisherID FROM TypeOfBook,Author,Publisher WHERE TypeOfBook.TypeName=N'"+a.getTypeName()+"' AND Author.AuthorName=N'"+a.getAuthorName()+"' AND Publisher.PublisherName=N'"+a.getPublisherName()+"'";
					conn = ConnectionUtils.getConnection();
					ps = conn.prepareStatement(query1);
					r = ps.executeQuery();
					int typeID,authorID,publisherID;
					if(r.next()) {
						typeID = r.getInt("TypeID");
						authorID = r.getInt("AuthorID");
						publisherID = r.getInt("PublisherID");
						
						conn = ConnectionUtils.getConnection();
						ps = conn.prepareStatement("UPDATE Book SET TypeID = ?, AuthorID = ?, PublisherID = ?, BookName = ?, DateIn = ?, Condition = ?, Status = ? WHERE Id = ?");
						//turn date into String
						String date = (new SimpleDateFormat("dd-MM-yyyy")).format(a.getDateIn());
						ps.setInt(1, typeID);
						ps.setInt(2, authorID);
						ps.setInt(3, publisherID);
						ps.setString(4, a.getBookName());
						ps.setString(5, date);
						ps.setString(6, a.getCondition());
						ps.setString(7, a.getStatus());
						ps.setInt(8, id);
						result = ps.executeUpdate();
						conn.close();
					}
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				return result;
			}
			//show Book List
			public static ArrayList<BookDTO> getBookList(){
				Connection conn;
				PreparedStatement ps;
				ResultSet r;
				ArrayList<BookDTO> BookList = new ArrayList<BookDTO>();
				try {
					String query = "SELECT Book.Id AS BookID,TypeOfBook.TypeName,Author.AuthorName,Publisher.PublisherName,BookName,DateIn,Condition,Status FROM Book,TypeOfBook,Author,Publisher WHERE Book.TypeID = TypeOfBook.Id AND Book.AuthorID = Author.Id AND Book.PublisherID = Publisher.Id";
					conn = ConnectionUtils.getConnection();
					ps = conn.prepareStatement(query);
					r = ps.executeQuery();
					BookDTO p;
					while(r.next()) {
						p = new BookDTO(r.getInt("BookID"), r.getString("TypeName"), r.getString("AuthorName"),r.getString("PublisherName"), r.getString("BookName"), r.getDate("DateIn"), r.getString("Condition"), r.getString("Status"));
						BookList.add(p);
					}
					conn.close();
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				return BookList;
			}
			// Search Name Book
			public static ArrayList<BookDTO> getBookSearchList(BookDTO p) {
				Connection conn;
				PreparedStatement ps;
				ResultSet r;
				
				ArrayList<BookDTO> BookListSearch = new ArrayList<BookDTO>();
				try {
					conn = ConnectionUtils.getConnection();
					
					ps = conn.prepareStatement("SELECT Book.Id AS BookID,TypeOfBook.TypeName,Author.AuthorName,Publisher.PublisherName,BookName,DateIn,Condition,Status FROM Book,TypeOfBook,Author,Publisher WHERE Book.TypeID = TypeOfBook.Id AND Book.AuthorID = Author.Id AND Book.PublisherID = Publisher.Id and Book.BookName like ?");
					ps.setString(1, p.getBookName());
					//ps.setString(2, user.getPassword());
					
					r = ps.executeQuery();
					while(r.next()) {
						p = new BookDTO(r.getInt("BookID"), r.getString("TypeName"), r.getString("AuthorName"),r.getString("PublisherName"), r.getString("BookName"), r.getDate("DateIn"), r.getString("Condition"), r.getString("Status"));
						BookListSearch.add(p);
					}
					conn.close();
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				return BookListSearch;
			}
			//Load data into combobox Type
			public static void loadTypeOfBookToCmb(JComboBox cmb) {
				Connection conn;
				PreparedStatement ps;
				ResultSet r;
				try {
					String query = "SELECT TypeName FROM TypeOfBook";
					conn = ConnectionUtils.getConnection();
					ps = conn.prepareStatement(query);
					r = ps.executeQuery();
					while(r.next()) {
						String typeName = r.getString("TypeName");
						cmb.addItem(typeName);
					}
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
			//Load data into combobox Author
			public static void loadAuthorToCmb(JComboBox cmb) {
				Connection conn;
				PreparedStatement ps;
				ResultSet r;
				try {
					String query = "SELECT AuthorName FROM Author";
					conn = ConnectionUtils.getConnection();
					ps = conn.prepareStatement(query);
					r = ps.executeQuery();
					while(r.next()) {
						String authorName = r.getString("AuthorName");
						cmb.addItem(authorName);
					}
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
			//Load data into combobox Publisher
			public static void loadPublisherToCmb(JComboBox cmb) {
				Connection conn;
				PreparedStatement ps;
				ResultSet r;
				try {
					String query = "SELECT PublisherName FROM Publisher";
					conn = ConnectionUtils.getConnection();
					ps = conn.prepareStatement(query);
					r = ps.executeQuery();
					while(r.next()) {
						String publisherName = r.getString("PublisherName");
						cmb.addItem(publisherName);
					}
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
}
