## 🟠 Assignment 2 — Decision Making and Conditional Logic

### 📌 Description

Assignment 2 focuses on applying **conditional statements and decision-making logic** to solve practical programming problems.

The programs use operators, nested `if-else`, multiple conditions, character input, and range-based decision making.

---

### 📝 Programs

| # | Program                                   | Concepts Practiced                   |
| - | ----------------------------------------- | ------------------------------------ |
| 1 | Perform an operation based on an operator | Arithmetic operators, `if-else`      |
| 2 | Determine the type of triangle            | Multiple conditions                  |
| 3 | Find the greatest of three numbers        | Nested `if-else`                     |
| 4 | Determine result based on marks           | `else-if` ladder                     |
| 5 | Calculate student/non-student discount    | Nested conditions, logical operators |
| 6 | Check divisibility by 3 and 5             | Logical operators, modulus           |
| 7 | Categorize a person based on age          | `else-if` ladder, ranges             |

---

### 🔹 1. Arithmetic Operation Using Operator

Accepts two numbers and an arithmetic operator:

```text
+
-
*
/
%
```

The program performs the corresponding operation based on the operator entered by the user.

**Concepts:**

* Arithmetic operators
* Character input
* `if-else`
* Modulus operator

---

### 🔹 2. Triangle Classification

Accepts three sides of a triangle and determines whether it is:

* **Equilateral** — all three sides are equal
* **Isosceles** — any two sides are equal
* **Scalene** — all three sides are different

This program practices comparing multiple values using conditional statements.

---

### 🔹 3. Greatest of Three Numbers

Finds the greatest number among three numbers using **nested `if-else` statements**.

Example:

```text
Input: 25 40 15
Output: 40 is greatest
```

**Concepts:**

* Nested `if-else`
* Relational operators
* Number comparison

---

### 🔹 4. Result Based on Marks

Accepts marks and displays the result according to the given conditions:

|        Marks | Result       |
| -----------: | ------------ |
| More than 75 | Distinction  |
| More than 65 | First Class  |
| More than 55 | Second Class |
|   40 or more | Pass Class   |
| Less than 40 | Fail         |

This program demonstrates the use of an **`else-if` ladder**.

---

### 🔹 5. Student Discount Calculation

Accepts the purchase price and asks whether the customer is a student (`y` or `n`).

#### Student

| Condition      | Discount |
| -------------- | -------: |
| Purchase > 500 |      20% |
| Otherwise      |      10% |

#### Non-Student

| Condition      |    Discount |
| -------------- | ----------: |
| Purchase > 600 |         15% |
| Otherwise      | No discount |

This program uses **nested conditional statements** to handle different combinations of conditions.

---

### 🔹 6. Divisibility by 3 and 5

Accepts a number and checks whether it is divisible by:

* 3 only
* 5 only
* Both 3 and 5
* Neither 3 nor 5

Possible outputs:

```text
Divisible by 3 but not by 5
Divisible by 5 but not by 3
Divisible by both
Divisible by None
```

The program practices the **modulus operator (`%`)** and logical conditions.

---

### 🔹 7. Age Category

Accepts the age of a person and categorizes them as:

|          Age | Category |
| -----------: | -------- |
| Less than 12 | Child    |
|        12–19 | Teenager |
|        20–59 | Adult    |
| 60 and above | Senior   |

This program demonstrates **range-based conditions** using an `else-if` ladder.

---

### 🧠 Concepts Learned

Through Assignment 2, I practiced:

* Arithmetic operators
* Modulus operator
* Relational operators
* Logical operators
* Character comparison
* `if-else`
* Nested `if-else`
* `else-if` ladder
* Multiple conditions
* Range-based conditions
* Decision-making logic
* Practical problem solving

---

### 📂 Assignment Structure

```text
Assignment-2/
│
├── 01_Arithmetic_Operation.c
├── 02_Triangle_Type.c
├── 03_Greatest_Of_Three.c
├── 04_Marks_Result.c
├── 05_Student_Discount.c
├── 06_Divisible_By_3_And_5.c
└── 07_Age_Category.c
```

---

### 🎯 Learning Outcome

Assignment 2 strengthened my understanding of **conditional logic and decision-making in C**. I practiced using multiple conditions and nested conditions to solve real-world style programming problems.
