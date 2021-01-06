USE [LibraryManagement]
GO
/****** Object:  Table [dbo].[Account]    Script Date: 06/01/2021 11:42:56 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[MemberID] [int] NOT NULL,
	[AccountName] [nvarchar](30) NULL,
	[Password] [nvarchar](30) NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Author]    Script Date: 06/01/2021 11:42:57 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Author](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[AuthorName] [nvarchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Book]    Script Date: 06/01/2021 11:42:57 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Book](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[TypeID] [int] NOT NULL,
	[AuthorID] [int] NOT NULL,
	[PublisherID] [int] NOT NULL,
	[DateIn] [datetime] NULL,
	[Condition] [nvarchar](30) NULL,
	[Status] [nvarchar](30) NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Borrow_Return]    Script Date: 06/01/2021 11:42:57 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Borrow_Return](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[BorrowDate] [datetime] NULL,
	[ReturnDate] [datetime] NULL,
	[NumberOfBooks] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Borrow_ReturnInfo]    Script Date: 06/01/2021 11:42:57 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Borrow_ReturnInfo](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[Borrow_ReturnID] [int] NOT NULL,
	[BookID] [int] NOT NULL,
	[MemberID] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Member]    Script Date: 06/01/2021 11:42:57 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Member](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[MemberName] [nvarchar](50) NULL,
	[Birthday] [datetime] NULL,
	[Gender] [nvarchar](10) NULL,
	[PhoneNumber] [nvarchar](11) NULL,
	[Rank] [nvarchar](30) NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Publisher]    Script Date: 06/01/2021 11:42:57 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Publisher](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[PublisherName] [nvarchar](50) NULL,
	[Address] [nvarchar](50) NULL,
	[PhoneNumber] [nvarchar](11) NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TypeOfBook]    Script Date: 06/01/2021 11:42:57 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TypeOfBook](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[TypeName] [nvarchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[Account]  WITH CHECK ADD  CONSTRAINT [FK_MemberID] FOREIGN KEY([MemberID])
REFERENCES [dbo].[Member] ([Id])
GO
ALTER TABLE [dbo].[Account] CHECK CONSTRAINT [FK_MemberID]
GO
ALTER TABLE [dbo].[Book]  WITH CHECK ADD  CONSTRAINT [FK_AuthorID] FOREIGN KEY([AuthorID])
REFERENCES [dbo].[Author] ([Id])
GO
ALTER TABLE [dbo].[Book] CHECK CONSTRAINT [FK_AuthorID]
GO
ALTER TABLE [dbo].[Book]  WITH CHECK ADD  CONSTRAINT [FK_TypeID] FOREIGN KEY([TypeID])
REFERENCES [dbo].[TypeOfBook] ([Id])
GO
ALTER TABLE [dbo].[Book] CHECK CONSTRAINT [FK_TypeID]
GO
ALTER TABLE [dbo].[Borrow_ReturnInfo]  WITH CHECK ADD  CONSTRAINT [FK_BookID] FOREIGN KEY([BookID])
REFERENCES [dbo].[Book] ([Id])
GO
ALTER TABLE [dbo].[Borrow_ReturnInfo] CHECK CONSTRAINT [FK_BookID]
GO
ALTER TABLE [dbo].[Borrow_ReturnInfo]  WITH CHECK ADD  CONSTRAINT [FK_Member_ID] FOREIGN KEY([MemberID])
REFERENCES [dbo].[Member] ([Id])
GO
ALTER TABLE [dbo].[Borrow_ReturnInfo] CHECK CONSTRAINT [FK_Member_ID]
GO
