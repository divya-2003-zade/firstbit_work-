## 🟡 Assignment 1 — Conditional Statements

### 📌 Description

Assignment 1 focuses on **decision-making in C programming**.

The programs use conditions to check different situations and perform different operations based on the given input.

The main concepts practiced are:

* `if`
* `if-else`
* `else-if`
* Logical conditions
* Relational operators
* Character comparison
* Conditional calculations

---

### 📝 Programs

| # | Program                                             | Concepts Practiced                        |
| - | --------------------------------------------------- | ----------------------------------------- |
| 1 | Check whether a number is even or odd               | `if-else`, modulus operator               |
| 2 | Check whether a 3-digit number is a palindrome      | Conditions, arithmetic operations         |
| 3 | Check whether a year is a leap year                 | Conditional statements, logical operators |
| 4 | Check whether a character is a vowel or consonant   | Character comparison, conditions          |
| 5 | Check whether a person is eligible to vote          | `if-else`, relational operator            |
| 6 | Check whether a character is uppercase or lowercase | Character comparison, ASCII values        |
| 7 | Calculate total salary based on basic salary        | `if-else`, percentage calculation         |

---

### 🔹 1. Even or Odd

Checks whether a given number is **even or odd** using the modulus operator.

```text
Number % 2 == 0 → Even
Number % 2 != 0 → Odd
```

---

### 🔹 2. 3-Digit Palindrome

Checks whether a given **3-digit number** reads the same from left to right and right to left.

Example:

```text
121 → Palindrome
123 → Not Palindrome
```

The program extracts individual digits and compares them to determine whether the number is a palindrome.

---

### 🔹 3. Leap Year

Checks whether a given year is a **leap year** based on the leap-year conditions.

The program practices the use of:

* Relational operators
* Logical operators
* Conditional statements

---

### 🔹 4. Vowel or Consonant

Checks whether a given character is a **vowel or consonant**.

Vowels checked include:

```text
a, e, i, o, u
A, E, I, O, U
```

---

### 🔹 5. Voting Eligibility

Checks whether a person is eligible to vote based on their age.

```text
Age >= 18 → Eligible to vote
Age < 18  → Not eligible to vote
```

---

### 🔹 6. Uppercase or Lowercase

Checks whether a given character is:

* Uppercase
* Lowercase

For example:

```text
A → Uppercase
a → Lowercase
```

This program also helps understand **character ranges and ASCII values**.

---

### 🔹 7. Total Salary Calculation

Calculates the total salary based on the basic salary.

#### If Basic Salary ≤ 5000

| Component | Percentage |
| --------- | ---------: |
| DA        |        10% |
| TA        |        20% |
| HRA       |        25% |

#### If Basic Salary > 5000

| Component | Percentage |
| --------- | ---------: |
| DA        |        15% |
| TA        |        25% |
| HRA       |        30% |

The program calculates the applicable allowances and then calculates the **total salary**.

```text
Total Salary = Basic + DA + TA + HRA
```

---

### 🧠 Concepts Learned

Through Assignment 1, I practiced:

* Conditional statements
* `if`
* `if-else`
* `else-if`
* Relational operators
* Logical operators
* Modulus operator
* Character comparison
* ASCII-based character checking
* Percentage calculations
* Basic decision-making logic
* Problem solving

---

### 📂 Assignment Structure

```text
Assignment-1/
│
├── 01_Even_Or_Odd.c
├── 02_Three_Digit_Palindrome.c
├── 03_Leap_Year.c
├── 04_Vowel_Or_Consonant.c
├── 05_Voting_Eligibility.c
├── 06_Uppercase_Or_Lowercase.c
└── 07_Total_Salary.c
```

---

### 🎯 Learning Outcome

Assignment 1 helped me understand how **conditional statements allow a C program to make decisions based on different conditions**. These concepts form the foundation for solving more complex programming problems.
