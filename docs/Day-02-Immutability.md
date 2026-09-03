# Day 02: Immutability & The Record Feature

- **Difficulty:** Intermediate
- **Time:** 30 minutes

### 1. Learning Objectives
- Understand the concept of Immutability.
- Learn how to design a standard Immutable Class in Java.
- Get familiar with the modern Java `record` feature (Java 14+).

### 2. Concepts & Internal Mechanisms
- **What is Immutability?** An Object whose state/data CANNOT be changed once it has been initialized (using the `new` keyword).
- **4 Rules to Create an Immutable Class:**
  1. The class must be marked as `final` (preventing inheritance/subclassing).
  2. All fields must be `private final` (assigned only once).
  3. Absolutely no Setter methods.
  4. All data must be injected once through the Constructor.
- **The `record` Feature:** A concise syntax declaration in Java. When declaring a `record`, Java automatically generates a perfect Immutable class (including constructor, getters, `toString`, `equals`, and `hashCode`) in just a single line of code.

### 3. Debugging Experiment
- Experienced firsthand how a standard (Mutable) object can be silently modified by another function due to Java's pass-by-value mechanism (passing the memory reference), which was covered in Day 1.
- Refactored the class to be Immutable, successfully forcing the IDE to throw a red Compile-time error immediately when there was an attempt to mutate the data.

### 4. Reflection
- **The Value of Immutability:** This mechanism completely prevents data from being unexpectedly modified mid-process (which is extremely critical in multi-threading environments). If a state change is needed, it strictly requires initializing a completely new Object via the Constructor. This effectively shifts hidden bugs (Runtime errors) into syntax errors (Compile-time errors) that are easily spotted while typing.
- **Practical Application of `record`:** This feature is incredibly useful. It keeps the codebase concise and clean, making it a perfect fit for creating DTOs (Data Transfer Objects) in Spring Boot later on.
