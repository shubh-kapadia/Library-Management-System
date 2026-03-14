Address Book Management System (Java)

A simple Java Swing based Address Book Application that allows users to login and manage contacts.
Users can add, search, and delete contact records stored in a database using JDBC connectivity.

Features

User Login Authentication

Add new contact records

Search contacts by Name or Phone Number

Delete existing records

Simple GUI built using Java AWT/Swing

Database connectivity using JDBC-ODBC

Project Structure
AddressBook/
│
├── Loginb.java      # Login screen
├── Start.java       # Main menu after login
├── Add.java         # Add new contact
├── Search.java      # Search contact
├── DeleRec.java     # Delete contact

Example login interface is implemented in


Search functionality is implemented in


Delete functionality is implemented in


Add record functionality is implemented in


Main menu navigation is implemented in


Technologies Used

Java

Java Swing / AWT

JDBC

ODBC Database Connection

SQL

Database Structure
Table: login
Field	Type
username	varchar
password	varchar
Table: addressb
Field	Type
Name	varchar
Phone	number
Address	varchar
Email	varchar
Birthdate	date
City	varchar
How to Run

Install Java JDK

Configure ODBC Data Source

Create DSN named student

Create required database tables.

Compile the project

javac *.java

Run the login class

java Loginb
Screens

Application includes:

Login Screen

Main Menu

Add Contact Form

Search Contact

Delete Contact
