## 🔵 Assignment 3 — Loops and Number Programs

### 📌 Description

Assignment 3 focuses on **loops and mathematical problem solving in C**.

The programs use loops to repeat operations and solve common number-based problems such as prime numbers, Armstrong numbers, perfect numbers, factorials, strong numbers, and palindromes.

The main looping concepts practiced are:

* `for` loop
* `while` loop
* Repeated calculations
* Digit extraction
* Mathematical operations
* Number validation

---

### 📝 Programs

| #  | Program                              | Concepts Practiced             |
| -- | ------------------------------------ | ------------------------------ |
| 1  | Print numbers from 1 to 10           | `for` loop                     |
| 2  | Print multiplication table           | `for` loop, multiplication     |
| 3  | Find sum of numbers in a range       | Loop, accumulation             |
| 4  | Check whether a number is prime      | Loop, divisibility             |
| 5  | Check whether a number is Armstrong  | Digit extraction, powers, loop |
| 6  | Check whether a number is Perfect    | Divisors, loop                 |
| 7  | Find factorial of a number           | Loop, multiplication           |
| 8  | Check whether a number is Strong     | Factorial, digit extraction    |
| 9  | Check whether a number is Palindrome | Reverse number, loop           |
| 10 | Find sum of first and last digit     | Digit extraction               |

---

### 🔹 1. Print Numbers from 1 to 10

Prints numbers from `1` to `10` using a loop.

**Output:**

```text
1 2 3 4 5 6 7 8 9 10
```

**Concept:** `for` loop.

---

### 🔹 2. Multiplication Table

Accepts a number and prints its multiplication table from `1` to `10`.

**Example:**

```text
Input: 5

Output:
5 10 15 20 25 30 35 40 45 50
```

**Concepts:**

* `for` loop
* Multiplication
* Repeated execution

---

### 🔹 3. Sum of Numbers in a Given Range

Accepts a starting and ending value and calculates the sum of all numbers within that range.

**Example:**

```text
Start = 1
End = 5

1 + 2 + 3 + 4 + 5 = 15
```

**Output:**

```text
15
```

**Concept:** Accumulator variable with a loop.

---

### 🔹 4. Prime Number

Checks whether a given number is a **prime number**.

A prime number has exactly two factors:

```text
1 and itself
```

**Example:**

```text
Input: 7
Output: Prime
```

The program checks whether the number is divisible by any number other than `1` and itself.

---

### 🔹 5. Armstrong Number

Checks whether a given number is an **Armstrong number**.

**Example:**

```text
153
```

For this number:

```text
1³ + 5³ + 3³
= 1 + 125 + 27
= 153
```

Therefore:

```text
153 → Armstrong
```

**Concepts:**

* Digit extraction
* `%` operator
* Integer division
* Loop
* Mathematical calculations

---

### 🔹 6. Perfect Number

Checks whether a number is a **Perfect number**.

A perfect number is equal to the sum of its proper divisors.

**Example:**

```text
28
```

Its proper divisors are:

```text
1 + 2 + 4 + 7 + 14 = 28
```

Therefore:

```text
28 → Perfect
```

---

### 🔹 7. Factorial

Finds the factorial of a given number.

**Example:**

```text
Input: 5

5! = 5 × 4 × 3 × 2 × 1
   = 120
```

**Output:**

```text
120
```

**Concepts:**

* Loop
* Multiplication
* Accumulator

---

### 🔹 8. Strong Number

Checks whether a number is a **Strong number**.

A number is Strong when the sum of the factorials of its digits is equal to the original number.

**Example:**

```text
145
```

Calculation:

```text
1! + 4! + 5!
= 1 + 24 + 120
= 145
```

Therefore:

```text
145 → Strong
```

This program combines:

* Digit extraction
* Factorial calculation
* Loops
* Mathematical comparison

---

### 🔹 9. Palindrome Number

Checks whether a number remains the same when its digits are reversed.

**Example:**

```text
Input: 121

Reverse = 121
```

Therefore:

```text
121 → Palindrome
```

**Concepts:**

* `%` operator
* Integer division
* Reverse number
* Loop
* Comparison

---

### 🔹 10. Sum of First and Last Digit

Finds the first and last digit of a number and calculates their sum.

**Example:**

```text
Input: 12345

First digit = 1
Last digit  = 5

Sum = 1 + 5
    = 6
```

**Output:**

```text
6
```

**Concepts:**

* Digit extraction
* Integer division
* Modulus operator
* Loops

---

### 🧠 Concepts Learned

Through Assignment 3, I practiced:

* `for` loop
* `while` loop
* Loop initialization and condition
* Increment/decrement
* Nested calculations
* Accumulator variables
* `%` modulus operator
* Integer division
* Digit extraction
* Number reversal
* Prime number logic
* Armstrong number logic
* Perfect number logic
* Strong number logic
* Palindrome logic
* Factorial calculation
* Mathematical problem solving

---

### 📂 Assignment Structure

```text
Assignment-3/
│
├── 01_Print_1_To_10.c
├── 02_Multiplication_Table.c
├── 03_Sum_Of_Range.c
├── 04_Prime_Number.c
├── 05_Armstrong_Number.c
├── 06_Perfect_Number.c
├── 07_Factorial.c
├── 08_Strong_Number.c
├── 09_Palindrome_Number.c
└── 10_Sum_First_Last_Digit.c
```

---

### 🎯 Learning Outcome

Assignment 3 helped me understand how **loops can be used to repeatedly execute statements and solve mathematical problems**. I also learned how to extract individual digits from a number and apply different mathematical conditions to identify special numbers.
