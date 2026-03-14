# Address Book Management System (Java)

A simple **Java Swing based Address Book Management System** that allows users to manage contact records.  
The application provides features to **login, add, search, and delete contacts** using a graphical interface.

---

## 🚀 Features

- User Login Authentication
- Add new contact records
- Search contacts by **Name or Phone Number**
- Delete contact records
- Simple **GUI built using Java AWT/Swing**
- Database connectivity using **JDBC**

---

## 🛠️ Technologies Used

- Java
- Java AWT / Swing
- JDBC
- ODBC Data Source
- SQL

---

## 📂 Project Structure

```
AddressBook
│
├── Loginb.java     # Login page
├── Start.java      # Main menu
├── Add.java        # Add contact record
├── Search.java     # Search contact
├── DeleRec.java    # Delete contact
```

---

## 🗄️ Database Tables

### login

| Field | Type |
|------|------|
| username | varchar |
| password | varchar |

### addressb

| Field | Type |
|------|------|
| Name | varchar |
| Phone | number |
| Address | varchar |
| Email | varchar |
| Birthdate | date |
| City | varchar |

---

## ⚙️ Setup Instructions

### 1. Install Java
Install **JDK 8 or later**

### 2. Configure ODBC Data Source

1. Open **Control Panel**
2. Go to **Administrative Tools**
3. Open **ODBC Data Sources**
4. Create a DSN named:

```
student
```

### 3. Create Database Tables

Create the required tables **login** and **addressb** in your database.

### 4. Compile the Project

```
javac *.java
```

### 5. Run the Program

```
java Loginb
```

---

## 📸 Application Modules

- Login Screen
- Main Menu
- Add Contact
- Search Contact
- Delete Contact

---

## 👨‍💻 Author

**Shubh Kapadia**  
Final Year CSE Student
