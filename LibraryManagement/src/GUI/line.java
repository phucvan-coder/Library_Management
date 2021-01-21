package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.jdbc.JDBCCategoryDataset;
import org.jfree.data.xy.IntervalXYDataset;

import DAO.ConnectionUtils;
import DTO.BookDTO;

import java.sql.Connection;
import java.sql.DriverManager;

public class line extends JFrame {

	private JPanel contentPane;
	
	public line() {
        super("Line Chart Example with JFreechart");
 
        JPanel chartPanel = createChartPanel();
        add(chartPanel, BorderLayout.CENTER);
 
        setSize(640, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
 
    private JPanel createChartPanel() {
    	Connection conn;
    	
    	try {
    		conn = ConnectionUtils.getConnection();
    		String query = "select BorrowDate,NumberOfBooks from Borrow_Return";
			java.sql.Statement st = conn.createStatement();
			//conn.close();
			JDBCCategoryDataset dataset = new JDBCCategoryDataset(conn, query);
			dataset.executeQuery(query);
			String chartTitle = "Programming Languages Trends";
	        String categoryAxisLabel = "BorrowDate";
	        String valueAxisLabel = "NumberOfBooks";
	     
	        //CategoryDataset dataset = createDataset();
	     
	        JFreeChart chart = ChartFactory.createLineChart(chartTitle,
	                categoryAxisLabel, valueAxisLabel, dataset);
	     
	        return new ChartPanel(chart);
	        // creates a line chart object
	        // returns the chart panel
			
    		
    	}
    	catch (Exception e){
    		JOptionPane.showMessageDialog(null, e);
    	}
    	return null;
    	
    	
    }
 
   

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					line frame = new line();
					frame.setVisible(true);
					//dispose();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	

}
