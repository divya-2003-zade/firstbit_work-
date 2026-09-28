# 🏏 Player Management System

A **menu-driven Player Management System developed in C** using structures, functions, dynamic memory allocation, strings, searching, updating, deleting, and sorting.

This project demonstrates the practical implementation of **C programming concepts** by managing player information through a console-based application.

---

## 📌 Project Overview

The **Player Management System** allows users to manage cricket player records efficiently.

Each player record contains:

* Jersey Number
* Player Name
* Runs
* Wickets
* Matches Played

The system provides options to **add, display, search, update, delete, and sort players**.

---

## 🚀 Features

### 1. Add Players

* Add one or multiple players at a time.
* Validates jersey numbers.
* Prevents duplicate jersey numbers.
* Allows dynamic memory expansion using `realloc()`.
* Validates runs, wickets, and matches played.

### 2. Display Players

Displays complete details of all currently stored players.

### 3. Search Players

Players can be searched using:

* Jersey Number
* Player Name

Player-name searching is **case-insensitive**.

### 4. Update Players

Player statistics can be updated using the jersey number:

* Runs
* Wickets
* Matches Played

### 5. Delete Players

* Deletes a player using the jersey number.
* Shifts remaining records to maintain the array structure.

### 6. Sort Players

Players can be sorted according to:

* Runs
* Wickets

Sorting is available in:

* Ascending Order
* Descending Order

The sorting operation uses a **temporary dynamically allocated array**, so the original player order remains unchanged.

### 7. Dynamic Memory Allocation

The project uses:

```c
malloc()
realloc()
free()
```

to manage memory dynamically.

---

## 🛠️ Technologies & Concepts Used

### Programming Language

* **C**

### Header Files

```c
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
```

### C Concepts Implemented

* Structures
* `typedef`
* Functions
* Pointers
* Arrays
* Strings
* `malloc()`
* `realloc()`
* `free()`
* String handling
* Searching
* Sorting
* CRUD operations
* Menu-driven programming
* Input validation
* Dynamic memory management

---

## 🧩 Data Structure

The project uses a structure named `players`:

```c
typedef struct players
{
    int jersey_no;
    char name[20];
    int runs;
    int wickets;
    int matches_played;
} players;
```

Each structure object represents one cricket player.

---

## 🔄 CRUD Operations

The project implements the basic **CRUD operations**:

| Operation | Function           |
| --------- | ------------------ |
| Create    | `Addplayer()`      |
| Read      | `displayplayers()` |
| Update    | `updateplayer()`   |
| Delete    | `deleteplayers()`  |

---

## 📂 Project Structure

```text
Player-Management-System/
│
├── PlayerManagementSystem.c
└── README.md
```

---

## ▶️ How to Run

### Step 1: Clone the Repository

```bash
git clone <your-repository-url>
```

### Step 2: Open the Project

Open the `.c` file in a C-supported IDE or editor such as:

* Code::Blocks
* Dev-C++
* Visual Studio Code
* Eclipse
* GCC

### Step 3: Compile

Using GCC:

```bash
gcc PlayerManagementSystem.c -o PlayerManagementSystem
```

### Step 4: Run

On Windows:

```bash
PlayerManagementSystem
```

or:

```bash
PlayerManagementSystem.exe
```

---

## 📋 Menu

```text
1. Add Players
2. Display Players
3. Search Players
4. Update Players
5. Delete Players
6. Sorting Players
7. Exit
```

---

## 🧪 Sample Player Data

The application initially contains sample player records such as:

```text
MS Dhoni
Virat Kohli
Rohit Sharma
Sachin Tendulkar
Yuvraj Singh
KL Rahul
Rishabh Pant
Hardik Pandya
```

These records are loaded using the `storePlayersHardcoded()` function.

---

## 💡 Key Learning Outcomes

Through this project, I practiced:

* Designing a structure-based application in C
* Passing structures and pointers to functions
* Managing dynamically allocated memory
* Using `realloc()` when additional memory is required
* Implementing CRUD operations
* Searching records using different criteria
* Implementing Bubble Sort
* Handling strings and user input
* Applying input validation
* Building a complete menu-driven console application

---

## 🔮 Future Improvements

Possible improvements include:

* Store player records permanently using file handling
* Add login/authentication
* Add sorting by player name and matches played
* Improve input validation
* Add statistics such as average runs and strike rate
* Add a graphical user interface
* Separate the project into multiple `.c` and `.h` files

---

## 👩‍💻 Author

**Divya Pramod Zade**

B.Tech Computer Science & Engineering

Java Full Stack Developer Trainee

---

## ⭐ Project Purpose

This project was developed as a **C programming practice project** to strengthen programming fundamentals and understand how concepts such as **structures, pointers, functions, dynamic memory allocation, searching, sorting, and CRUD operations** work together in a real-world style application.
