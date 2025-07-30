# C Programming

A collection of C programs designed to demonstrate and practice fundamental concepts of the C programming language. Each file focuses on a specific topic, from basic syntax to more advanced concepts like pointers and dynamic memory allocation.

**Author:** Shardul Tapkire

---

## How to Compile and Run

### Prerequisites
You must have the **GCC (GNU Compiler Collection)** installed on your system to compile and run these programs.

---

### Compiling a Single File

Use the following command in your terminal:
```bash
gcc <program_name>.c -o <output_name>
```

**Example:**
```bash
gcc Hello.c -o Hello
```

---

### Running the Compiled Program

```bash
./<output_name>
```

**Example:**
```bash
./Hello
```

---

### Compiling Multiple Files

Some examples (like those demonstrating the `extern` storage class) require linking multiple source files together.

**Example 1:**
```bash
gcc First.c Second.c -o FirstSecondDemo
./FirstSecondDemo
```

**Example 2:**
```bash
gcc Marvellous.c Infosystems.c -o MarvellousInfosystemsDemo
./MarvellousInfosystemsDemo
```

---

## Code Index

Programs are categorized by the C programming concept they demonstrate.

---

### 1. Basics & Syntax

| Filename   | Description |
|------------|-------------|
| Hello.c    | The classic "Hello World" program to verify the compiler setup. |
| Demo.c     | A simple program demonstrating the `main` function and `printf`. |
| Datatype.c | Displays various fundamental data types and their memory sizes using `sizeof`. |

---

### 2. Control Flow

#### a. Sequence

| Filename      | Description |
|---------------|-------------|
| Sequance.c    | Demonstrates the sequential execution of code. |
| Sequance2.c   | Prints numbers from 1 to 5 sequentially. |
| Sequance3.c   | Prints numbers from 5 to 1 sequentially. |

#### b. Selection (Conditional Logic)

| Filename      | Description |
|---------------|-------------|
| Selection1.c  | Basic `if-else` statement to check pass/fail based on marks. |
| Selection2.c  | Using a function to encapsulate `if-else` logic. |
| Selection3.c  | Demonstrates an `if-else if-else` ladder to check multiple conditions. |
| Selection4.c  | Demonstrates the `switch-case` statement as an alternative to if-else ladder. |

#### c. Iteration (Loops)

| Filename      | Description |
|---------------|-------------|
| Iteration1.c  | Basic `for` loop to print a message multiple times. |
| Iteration2.c  | `for` loop to print numbers from 1 to 5. |
| Iteration3.c  | `for` loop to print numbers from 50 down to 1. |
| Iteration4.c  | Basic `while` loop to print numbers from 1 to 5. |
| Iteration5.c  | `while` loop to print a message multiple times. |
| Iteration6.c  | `do-while` loop to print a message multiple times. |
| Iteration7.c  | `do-while` loop to print numbers from 1 to 5. |
| Iteration8.c  | `while` loop to print numbers in reverse. |
| Iteration9.c  | `do-while` loop to print numbers in reverse. |

---

### 3. Functions

| Filename      | Description |
|---------------|-------------|
| Addition1.c   | Addition of two hardcoded integer values. |
| Addition2.c   | Takes two integers as input from the user and prints their sum. |
| Addition3.c   | Addition using a dedicated function with hardcoded values. |
| Addition4.c   | Addition using a function that accepts user-provided values. |

---

### 4. Arrays

| Filename       | Description |
|----------------|-------------|
| ArrayDemo1.c   | Basic array initialization and element access. |
| ArrayDemo2.c   | Demonstrates `sizeof` on an array and basic pointer arithmetic. |
| ArrayDemo3.c   | Shows different syntaxes for accessing array elements using pointers. |
| ArrayDemo4.c   | Various methods of initializing an array. |
| ArrayDemo5.c   | Shows arrays of different data types (`char`, `int`, `float`, `double`). |

---

### 5. Pointers

| Filename         | Description |
|------------------|-------------|
| PointerDemo1.c   | Introduction to pointers, the address-of (`&`) and dereference (`*`) operators. |
| PointerDemo2.c   | Demonstrates pointers for various data types. |
| PointerDemo3.c   | Introduction to generic (`void *`) pointers and typecasting. |
| PointerDemo4.c   | Shows multiple pointers pointing to the same memory location. |
| PointerDemo5.c   | Demonstrates double (`**`) and triple (`***`) pointers. |

---

### 6. Strings

| Filename     | Description |
|--------------|-------------|
| String1.c    | Different ways to initialize a string (character array). |
| String2.c    | Use of the standard library function `strlen()` and `sizeof()` on a string. |
| String3.c    | A custom implementation of the `strlen()` function. |
| String4.c    | Traversing a string using a character pointer. |

---

### 7. Storage Classes

| Filename             | Description |
|----------------------|-------------|
| auto1.c              | Demonstrates local vs. global variable scope. |
| auto2.c              | Shows the default garbage value of an uninitialized local variable. |
| auto3.c              | Explicit use of the `auto` keyword. |
| register1.c          | Demonstrates the `register` storage class specifier. |
| Static1.c            | Shows the behavior of a local variable without the `static` keyword. |
| Static2.c            | Shows how a static local variable retains its value across function calls. |
| First.c, Second.c    | Demonstrates the `extern` storage class to access a global variable from another file. |
| Infosystems.c, Marvellous.c | Another example of `extern` and static global variables across files. |

---

### 8. Dynamic Memory Allocation

| Filename      | Description |
|---------------|-------------|
| Dynamic1.c    | Basic dynamic memory allocation for an integer array using `malloc()` and `free()`. |
| Dynamic2.c    | Dynamic memory allocation for a `double` array. |
| Dynamic3.c    | Static allocation of an array of structures. |
| Dynamic4.c    | Dynamic allocation of memory for a single structure using `malloc()`. |
