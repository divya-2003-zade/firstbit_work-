# 🏦 FBS Bank – Bank Account Management System

## 📌 Project Overview

**FBS Bank – Bank Account Management System** is a **console-based Java banking application** developed as an Object-Oriented Programming case study.

The system models a bank branch and supports different types of bank accounts, customer information, account management, banking transactions, transaction history, daily activities, and branch-level reporting.

The project focuses on applying **Java OOP concepts and real-world banking operations** in a structured and reusable application.

---

## 🎯 What This System Does

The application manages the complete account lifecycle and provides functionality for:

* Bank branch management
* Multiple types of bank accounts
* Customer and account information
* Account creation and deletion
* Account searching
* Account updating
* Account closing
* Deposit and withdrawal
* Fund transfer
* Transaction history
* Branch reporting
* Daily activity reporting
* Account-specific information and operations
* Input validation
* Banking-related business rules

---

# ✨ Main Features

The application provides a menu-driven banking system with **12 major operations**:

| Option | Feature             | Purpose                                                 |
| ------ | ------------------- | ------------------------------------------------------- |
| 1      | Display Accounts    | Displays available bank accounts                        |
| 2      | Add Account         | Creates a new bank account                              |
| 3      | Deposit             | Deposits money into an account                          |
| 4      | Withdraw            | Withdraws money from an account                         |
| 5      | Transfer            | Transfers money between accounts                        |
| 6      | Search Account      | Searches an account using account number or customer ID |
| 7      | Update Account      | Updates common and account-specific information         |
| 8      | Delete Account      | Deletes an account after confirmation                   |
| 9      | Transaction History | Displays transaction history                            |
| 10     | Branch Report       | Generates branch-related information                    |
| 11     | Daily Report        | Displays daily banking activities                       |
| 12     | Close Account       | Closes an account                                       |

The main application class coordinates these operations through a centralized banking menu.

---

# 🏦 Account Types

The system supports **four different account types**.

## 1. 💰 Savings Account

The Savings Account contains banking features such as:

* Minimum balance
* Interest rate
* Auto sweep
* Online banking
* Mobile banking
* Cheque book facility

It is designed to represent a regular personal savings account.

---

## 2. 💼 Salary Account

The Salary Account represents an employee salary-based bank account.

It maintains information such as:

* Employee name
* Employee ID
* Salary
* Employer name
* Department
* Designation
* Salary verification
* Employer verification
* Automatic salary credit
* Interest
* Frozen status

---

## 3. 🏢 Current Account

The Current Account represents a business-oriented bank account.

It supports:

* Business name
* Business type
* GST information
* Trade license
* KYC status
* Overdraft limit
* Overdraft utilization
* Cheque book
* Statement facility

The application also provides predefined business categories such as:

* Retail
* Wholesale
* Manufacturing
* Service
* Other

---

## 4. 🏠 Loan Account

The Loan Account represents a loan-related banking account.

It maintains:

* Loan ID
* Loan type
* Sanctioned amount
* Loan amount
* Interest rate
* Loan tenure
* Collateral
* Guarantor
* Credit score
* Pre-closure information
* Foreclosure charges
* Penalty
* Loan status
* EMI

### Supported Loan Types

The system provides different loan categories with corresponding interest rates:

| Loan Type | Interest Rate |
| --------- | ------------: |
| Personal  |           10% |
| Home      |            8% |
| Education |            7% |
| Vehicle   |            9% |
| Business  |           11% |

### Loan Tenure

The application provides predefined tenure options:

* 12 months
* 24 months
* 36 months
* 48 months
* 60 months
* 84 months
* 120 months

The EMI is recalculated when relevant loan details such as loan type, loan amount, or tenure are changed.

---

# 👤 Customer & Account Management

The system maintains common customer and account information such as:

* Customer name
* Phone number
* Email
* Address
* City
* State
* Pincode
* IFSC code
* Nominee name
* Nominee relationship
* Account status

The application also supports searching an account using:

* Account number
* Customer ID

---

# ➕ Account Creation

The application allows users to create different types of accounts dynamically.

During account creation, it:

* Collects common customer information
* Checks whether the account number already exists
* Allows selection of account type
* Creates the appropriate account object
* Assigns common information
* Assigns account-specific information
* Applies account-specific business rules
* Adds the account to the branch
* Records the activity in the daily report

A particularly important part of the design is that different child account objects are handled through a common `Account` reference.

---

# 🔄 Account Update

The application provides a dedicated update operation.

Common information that can be updated includes:

1. Customer Name
2. Phone Number
3. Email
4. Address
5. City
6. State
7. Pincode
8. IFSC
9. Nominee Name
10. Nominee Relation
11. Account Status
12. Account-Specific Details

The system then provides different update options depending on the actual account type.

### Savings Account Updates

* Minimum balance
* Auto sweep
* Online banking
* Mobile banking
* Cheque book

### Salary Account Updates

* Employer name
* Salary
* Department
* Designation
* Salary verification
* Employer verification
* Auto salary credit
* Frozen status

### Current Account Updates

* Business name
* Business type
* GST
* Trade license
* Overdraft limit
* KYC
* Cheque book
* Statement

### Loan Account Updates

* Loan type
* Loan amount
* Tenure
* Collateral
* Guarantor
* Credit score
* Pre-closure
* Foreclosure charges

---

# 💳 Banking Transactions

The system supports three major financial operations.

## Deposit

Money can be deposited into an existing account after validating the entered amount.

## Withdrawal

Money can be withdrawn from an account after validating the account and amount.

## Transfer

The system supports transferring money from one account to another using:

* Source account
* Destination account
* Transfer amount

These operations are recorded as daily banking activities.

---

# 📜 Transaction History

The system provides a dedicated **Transaction History** feature.

It allows the account's transaction history to be displayed using the account's transaction-history functionality.

This helps maintain a record of banking activities associated with an account.

---

# 📊 Branch Report & Daily Report

The application contains two reporting-related features.

## Branch Report

The Branch Report provides information related to the bank branch and its accounts.

The branch itself contains information such as:

* Bank name
* Branch ID
* Branch name
* Branch code
* IFSC
* Address
* City
* State
* Pincode
* Contact number
* Email
* Manager information
* Employee count
* Working hours
* Branch opening time
* Branch status

---

## Daily Report

The `DailyReport` component records activities performed during the banking session.

Activities such as:

* Account creation
* Deposit
* Withdrawal
* Transfer
* Update
* Delete
* Account closure
* Branch-related operations

can be recorded as part of the daily activity.

---

# 🧠 Object-Oriented Programming Concepts

This project is primarily designed to demonstrate **OOP concepts in Java**.

## 1. Encapsulation

The system keeps account information inside account classes and accesses the information through methods such as getters and setters.

For example, common account information and account-specific properties are managed through class methods rather than being directly manipulated everywhere.

### Why it is used

* Protects object data
* Controls how data is modified
* Improves maintainability
* Keeps data and related operations together

---

## 2. Inheritance

Different account types are derived from the common `Account` class.

```text
                 Account
                    │
       ┌────────────┼────────────┐
       │            │            │
   Savings       Salary       Current
   Account       Account      Account
                    │
                 Loan
                Account
```

Conceptually, the account classes share common account functionality while providing their own specialized information.

---

## 3. Abstraction

The common `Account` abstraction represents properties and operations that are common to different bank accounts.

The individual account classes provide specialized account information.

This allows the application to work with different account types through a common account reference.

---

## 4. Polymorphism

One of the important concepts demonstrated by the project is **runtime polymorphism**.

The application declares:

```text
Account a;
```

and then assigns different child objects to the same parent reference:

```text
SavingsAccount
SalaryAccount
CurrentAccount
LoanAccount
```

This means one `Account` reference can represent different account objects at runtime.

### Concept

```text
Account reference
       │
       ├── SavingsAccount object
       ├── SalaryAccount object
       ├── CurrentAccount object
       └── LoanAccount object
```

This reduces the need to create separate management logic for every account type.

---

## 5. Upcasting

The project uses a parent-class reference to hold a child-class object.

Conceptually:

```text
Account ← SavingsAccount
Account ← SalaryAccount
Account ← CurrentAccount
Account ← LoanAccount
```

This is **upcasting**.

It allows the main application to handle different account types through the common `Account` type.

---

## 6. Downcasting

When account-specific properties need to be updated, the application identifies the actual runtime account type and converts the `Account` reference back to the appropriate child type.

For example:

```text
Account
   ↓
SavingsAccount
```

or

```text
Account
   ↓
LoanAccount
```

This is used in the account-specific update functionality.

---

## 7. `instanceof`

The project uses `instanceof` to determine the actual runtime type of an account before performing account-specific operations.

Conceptually:

```text
Is the account a SavingsAccount?
        ↓
      Yes → Savings-specific update
```

The same approach is used for Salary, Current, and Loan accounts.

---

## 8. Interface-Based Design

The reporting functionality is separated through a reporting abstraction.

The project uses the `ReportOperations` interface together with `DailyReport`, allowing reporting-related operations to be separated from the main banking controller logic.

This demonstrates **interface-based programming** and separation of responsibilities.

---

# 🔗 Relationships Between Classes

The project demonstrates different types of relationships used in object-oriented design.

### IS-A Relationship

The account hierarchy represents an **IS-A** relationship.

```text
SavingsAccount IS-A Account
SalaryAccount  IS-A Account
CurrentAccount IS-A Account
LoanAccount    IS-A Account
```

### HAS-A Relationship

The banking system also uses **HAS-A** relationships.

Conceptually:

```text
BankBranch HAS-A collection of Accounts
DailyReport HAS-A reporting information
```

This separates objects based on their real-world responsibilities.

---

# ☕ Java Concepts Demonstrated

The project applies several core Java concepts.

### Classes and Objects

The system is divided into classes representing real-world banking entities.

### Constructors

Objects are initialized with appropriate account and branch information.

### Methods

Operations such as deposit, withdrawal, transfer, search, update, delete, and close are represented through methods.

### Static Members

The main application uses static members for shared application-level resources such as the `Scanner` and daily report reference.

### `Scanner`

`Scanner` is used to accept user input from the console.

### `switch`

The main menu and several selection menus use `switch` logic to process user choices.

### Conditional Statements

`if`, `else if`, and other conditional logic are used for:

* Validation
* Account-type checking
* Business rules
* User choices
* Confirmation
* Error handling

### Loops

Loops are used where repeated user input or menu processing is required.

### `String` Handling

String methods are used for input processing and comparison.

The application also uses case-insensitive comparison where appropriate.

### `LocalTime`

`LocalTime` is used to represent the branch opening time.

### Primitive Data Types

The project uses data types such as:

* `int`
* `double`
* `boolean`

for appropriate banking information and validation.

---

# 🛡️ Input Validation

The project contains dedicated validation methods to make console input safer and more controlled.

## Required Input

Required fields cannot be left empty.

## Integer Validation

Integer input is checked before it is converted and used.

## Positive Integer

Certain values must be greater than zero.

## Amount Validation

The application validates positive and non-negative monetary values where required.

## Phone Number Validation

The phone number must contain exactly **10 digits**.

```text
XXXXXXXXXX
```

## Pincode Validation

The pincode must contain exactly **6 digits**.

```text
XXXXXX
```

## Credit Score Validation

Credit score input is restricted to the range:

```text
0 – 900
```

## Menu Choice Validation

Menu choices are checked against their allowed minimum and maximum values.

## Yes/No Validation

Boolean-style questions are handled using accepted Yes/No input and converted into boolean values.

---

# 🏦 Banking Business Rules

The project does not only collect information; it also applies several banking-related rules.

### Duplicate Account Prevention

Before creating an account, the system checks whether the account number already exists.

### Loan Amount Rule

The loan amount cannot be greater than the sanctioned amount.

```text
Loan Amount ≤ Sanctioned Amount
```

### Loan Interest Rules

Different loan types are associated with predefined interest rates.

### Loan Tenure Rules

Loan tenure is selected from predefined duration options.

### Savings Minimum Balance

Savings account minimum balance is selected from predefined values.

### Overdraft Limit

Current accounts provide predefined overdraft limit options.

### Foreclosure Charges

Loan foreclosure charges are selected from predefined options.

---

# 🧾 Account Lifecycle

The system supports the major stages of an account's lifecycle:

```text
Create Account
      ↓
Display / Search
      ↓
Deposit / Withdraw / Transfer
      ↓
Update Account
      ↓
Transaction History
      ↓
Close Account
      ↓
Delete Account
```

This makes the case study closer to a real-world account management workflow.

---

# 🏗️ Project Architecture

The project can be viewed conceptually as the following structure:

```text
                    BankBranchTest
                         │
                         ▼
                    BankBranch
                         │
                         │ manages
                         ▼
                      Account
                         │
          ┌──────────────┼──────────────┐
          │              │              │
          ▼              ▼              ▼
   SavingsAccount   SalaryAccount   CurrentAccount
                         │
                         ▼
                    LoanAccount


       Account
          │
          ▼
     Transaction
          │
          ▼
 Transaction History


      DailyReport
          │
          ▼
  ReportOperations
```

The main class acts as the application's **controller/menu layer**, while the account classes represent different banking entities and the reporting classes handle reporting responsibilities.

---

# 📚 Main Class Responsibilities

| Class              | Responsibility                                                                                                      |
| ------------------ | ------------------------------------------------------------------------------------------------------------------- |
| `BankBranchTest`   | Controls the console application, menu, user input, account operations, validation, and interaction between objects |
| `BankBranch`       | Represents the bank branch and manages branch/account-related operations                                            |
| `Account`          | Represents common account information and common account behavior                                                   |
| `SavingsAccount`   | Represents savings-account-specific properties and functionality                                                    |
| `SalaryAccount`    | Represents salary-account-specific properties and functionality                                                     |
| `CurrentAccount`   | Represents business/current-account-specific properties and functionality                                           |
| `LoanAccount`      | Represents loan-related properties, rules, and EMI-related functionality                                            |
| `Transaction`      | Represents transaction information/history                                                                          |
| `DailyReport`      | Maintains and generates daily banking activity information                                                          |
| `ReportOperations` | Defines reporting-related operations through an interface                                                           |

---

# 🌍 Real-World Banking Concepts Modeled

The project includes several concepts that make the case study resemble a real banking system.

### Customer Information

* Name
* Contact details
* Address
* City
* State
* Pincode

### Banking Information

* Account number
* Customer ID
* IFSC
* Account status
* Nominee
* Nominee relationship

### Business Banking

* Business name
* Business type
* GST
* Trade license
* KYC
* Overdraft

### Employment Banking

* Employee ID
* Employer
* Salary
* Department
* Designation
* Salary verification

### Loan Management

* Loan type
* Loan amount
* Interest
* Tenure
* EMI
* Credit score
* Collateral
* Guarantor
* Foreclosure

---

# 🔐 Data & Responsibility Separation

The application separates common account information from account-specific information.

### Common Information

Handled through the common `Account` structure:

```text
Customer
Account Number
Customer ID
Contact Information
Address
IFSC
Nominee
Account Status
```

### Specialized Information

Handled by individual account classes:

```text
SavingsAccount
→ Minimum Balance
→ Banking Facilities

SalaryAccount
→ Employer
→ Salary
→ Employee Details

CurrentAccount
→ Business
→ GST
→ Overdraft

LoanAccount
→ Loan
→ Interest
→ Tenure
→ EMI
→ Collateral
```

This structure avoids putting every account-specific property into one common account model.

---

# 📈 Reporting & Activity Tracking

The application keeps track of banking activities performed during the session.

The daily reporting mechanism is connected to operations such as:

* Adding accounts
* Depositing money
* Withdrawing money
* Transferring money
* Updating accounts
* Deleting accounts
* Closing accounts
* Branch-related activities

This provides an additional layer of activity tracking beyond the individual account transaction history.

---

# 🎓 Concepts Demonstrated by the Project

This case study demonstrates practical use of:

* Object-Oriented Programming
* Encapsulation
* Inheritance
* Abstraction
* Polymorphism
* Runtime polymorphism
* Upcasting
* Downcasting
* `instanceof`
* Interfaces
* Classes and objects
* Constructors
* Methods
* Static members
* Conditional statements
* Loops
* `switch`
* `Scanner`
* `String` handling
* `LocalTime`
* Input validation
* Regular expressions
* Exception-safe input handling
* Real-world business rules
* Object relationships
* Separation of responsibilities
* Transaction management
* Reporting

---

# 💡 Key Highlights

### 🔹 Multiple Account Types

The system does not treat every bank account identically. Each account type has its own specialized information and functionality.

### 🔹 Runtime Polymorphism

A common `Account` reference is used to work with different child account objects.

### 🔹 Dynamic Account-Specific Operations

The update functionality identifies the actual account type and provides the corresponding options.

### 🔹 Strong Input Validation

Dedicated validation methods are used for phone numbers, pincodes, credit scores, amounts, choices, and required fields.

### 🔹 Real-World Business Rules

The project models concepts such as:

* Minimum balance
* Overdraft
* GST
* KYC
* Salary verification
* Loan sanction
* Interest rates
* Loan tenure
* EMI
* Collateral
* Guarantor
* Foreclosure

### 🔹 Transaction & Reporting

The system combines account-level transaction history with branch and daily reporting.

---

# 🚀 Project Objective

The main objective of this project is to demonstrate how **core Java and Object-Oriented Programming concepts can be combined to build a structured real-world application**.

Instead of creating separate unrelated programs for each concept, the case study brings concepts such as:

```text
OOP
 │
 ├── Encapsulation
 ├── Inheritance
 ├── Abstraction
 ├── Polymorphism
 │
 ├── Interfaces
 ├── Validation
 ├── Business Rules
 ├── Object Relationships
 ├── Transaction Management
 └── Reporting
```

into one integrated **Bank Account Management System**.

---
## 📂 Project Structure

```text
FBS-Bank
│
├── src
│   │
│   ├── Account.java
│   ├── SavingsAccount.java
│   ├── CurrentAccount.java
│   ├── SalaryAccount.java
│   ├── LoanAccount.java
│   ├── BankBranch.java
│   ├── Transaction.java
│   ├── ReportOperations.java
│   └── DailyReport.java
│
└── README.md

## 💡 Key OOP Design

The project follows a real-world modelling approach.

```text
                     FBS BANK
                        |
                    BankBranch
                        |
                  manages Accounts
                        |
        ┌───────────────┼───────────────┐
        ↓               ↓               ↓
     Account        Transaction     DailyReport
        |
   ┌────┼─────┬─────────┐
   ↓    ↓     ↓         ↓
Savings Current Salary  Loan
Account Account Account Account
```

This structure makes the project easier to understand, maintain, and extend.

---


# 🏁 Conclusion

**FBS Bank – Bank Account Management System** is a Java-based OOP case study that models banking operations through multiple account types, account lifecycle management, transactions, validation, business rules, and reporting.

The project demonstrates how Java OOP concepts can be applied to organize a larger application into **reusable classes, specialized account types, common abstractions, runtime polymorphism, and clearly separated responsibilities**.

It serves as a practical demonstration of moving from individual Java concepts to a structured, real-world application design.
# 🏦 FBS Bank – Bank Account Management System



## 👩‍💻 Author

**Divya Pramod Zade**

Java Full Stack Development Trainee
FirstBit Solutions, Pune

---

## ⭐ Project Purpose

This project was developed as a **Java OOP case study** to understand how Object-Oriented Programming concepts can be applied to a real-world banking system.
