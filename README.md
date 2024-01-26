# Bank Management System

## Description
The Bank Management System is a Java application that provides a graphical user interface (GUI) for managing a bank's operations. It allows users to perform various banking tasks such as creating accounts, depositing and withdrawing money, transferring funds, and viewing account details.

## Features
- **User Authentication:** Secure login system to ensure only authorized users can access the application.
- **Account Operations:** Create new accounts, deposit and withdraw money, transfer funds between accounts.
- **View Account Details:** View account balance, transaction history, and account information.
- **Database Connectivity:** Utilizes JDBC to connect to a backend database for storing and retrieving data.

## Technologies Used
- **Java Swing (JFrames):** For the graphical user interface.
- **JDBC (Java Database Connectivity):** For connecting to and interacting with the backend database.

## Requirements
- Java Development Kit (JDK)
- MySQL Database (or any other supported database)

## Setup
1. **Database Configuration:**
    - Create a new database for the Bank Management System.
    - Execute the SQL scripts provided in the 'database' folder to set up the necessary tables.

2. **IDE Setup:**
    - Import the project into your favorite Java IDE.
    - Ensure that the JDBC driver for your chosen database is included in the project.

3. **Configuration:**
    - Update the database connection details in the `DBConnection.java` file.

4. **Run the Application:**
    - Run the `Main.java` file to start the application.

## Usage
1. **Login:**
    - Use valid credentials to log in.
    - Default admin credentials may be provided for initial setup.

2. **Main Menu:**
    - Navigate through the menu to perform various banking operations.

3. **Logout:**
    - Use the logout option to securely exit the application.

## Contributing
Feel free to contribute by opening issues or creating pull requests. Your feedback and suggestions are welcome!


