# Day 01: Moving Beyond System.out.println — Mastering the Debugger & Java Memory

- **Difficulty:** Basic
- **Time:** 1 hour

### 1. Learning Objectives
- Learn how to use the IDE Debugger (Breakpoint, Step Over/Into/Out, Resume).
- Use `Evaluate Expression` (`Alt+F8`) to dynamically modify data at runtime.
- Understand Heap and Stack memory allocation, along with Java's standard Pass-by-value mechanism.

### 2. Concepts & Internal Mechanisms
- **Debugger:** Utilizes the JVMTI (Java Virtual Machine Tool Interface) to freeze the currently running thread, allowing for deep inspection of the application state.
- **Pass-by-value:** In Java, EVERYTHING is pass-by-value (meaning a copy of the value is passed).
  - **Primitive Types (`int`, `double`, etc.):** Stored on the Stack. When passed into a method, a copy of the actual value is created. Modifying this variable inside the method does not affect the original variable outside.
  - **Object Types (`User`, `String`, etc.):** The actual Objects reside on the Heap. What gets passed into a method is a **copy of the Reference (the memory address)**. Therefore, both the internal and external variables point to the exact same Object on the Heap. Modifying the Object's properties inside the method will modify the actual Object.

### 3. Debugging Experiment
- Executed a test program simulating the modification of a primitive `int` and a property of a `User` object.
- Directly observed the Object's memory ID in the debugger (e.g., `User@963`).
- Used the `Evaluate Expression` tool to force an object name change to `"Thay Doi Tu Debugger"` while the program was paused, avoiding the need to modify the source code and rebuild.

### 4. Reflection
- **The Limits of `System.out.println`:** This manual approach only scratches the surface of an issue. It clutters the codebase and wastes time by requiring continuous rebuilding whenever more information is needed.
- **The Power of the IDE Debugger:** It allows me to step deeply into the program's execution (step-by-step), helping me observe the exact state and mutations of all data in memory at runtime.
- **Practical Application of `Evaluate Expression`:** This is an incredibly powerful tool when testing APIs or debugging complex logic. Instead of manually querying the Database to change test data or stopping the app to modify code when hitting a `null` error, I can use `Evaluate Expression` to mock and assign a new value on the fly. This technique significantly speeds up the bug-fixing process.
- **Understanding Java Memory:** This experiment completely cleared up my previous confusion. I now have a solid grasp of Java's *pass-by-value* mechanism and how memory is allocated for primitive types (Stack) versus Objects (Heap, accessed via references).
