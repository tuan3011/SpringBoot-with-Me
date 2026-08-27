# SpringBoot-with-Me

> From writing Spring Boot APIs to understanding what happens underneath them.

## About

This is a long-term learning repository documenting my journey to become a **Junior Java Backend Engineer** with strong technical depth. 

The goal is to move beyond "cargo-cult" programming (blindly copying annotations) and build a robust mental model of how frameworks like Spring Boot and Hibernate actually operate under the hood. I want to be able to debug independently, explain internal trade-offs, and confidently tackle Junior Backend interviews.

> *"A concept is not learned just because I can reproduce code."*

## Learning Philosophy

I focus on understanding the mechanisms behind the abstractions. *"Never teach Spring as magic."*

**The Core Loop:**
`LEARN → UNDERSTAND → EXPERIMENT → BREAK → DEBUG → EXPLAIN → APPLY → REFLECT`

* **No Magic:** Always explain what happens internally (e.g., what Spring creates, when it creates it, where it stores it).
* **Debugging as a First-Class Skill:** Do not just "fix" bugs; form hypotheses, experiment, and find the root cause.
* **No Early Overengineering:** Master the Modular Monolith and production-grade Spring Boot before touching Microservices or Cloud patterns.

## Roadmap & Technical Scope

The journey is structured into progressive modules. Topics will be tackled one layer at a time.

| Domain | Status |
| :--- | :--- |
| **Java Core** (OOP, Memory, Collections) | In Progress |
| **IDE Debugging** | In Progress |
| **Architecture** (DTOs, Data Exposure) | In Progress |
| **Spring Core** (IoC, DI, Beans) | Planned |
| **Spring MVC** (REST, Jackson) | Planned |
| **Database & JPA/Hibernate** | Planned |
| **Transactions & Concurrency** | Planned |
| **Spring Security** (JWT, Auth) | Planned |
| **Testing, Caching, Messaging, Docker** | Planned |

## Current Progress

* **Current Focus:** Module 1 - Java Backend Fundamentals & Survival Skills.
* **Last Completed:** Day 01 - Mastering the Debugger & Java Memory Model (Pass-by-value).
* **Next Milestone:** Day 02 - Immutability.

## The Failure Lab

Bugs are treated as first-class learning material. A dedicated **Failure Lab** is planned to document and dissect critical issues such as:
* `LazyInitializationException`
* N+1 Queries
* Transaction and Concurrency Failures

Each failure is analyzed through a structured process:
`Problem → Symptoms → Hypothesis → Investigation → Root Cause → Fix → Trade-offs → Interview Question`

## Real-World Integration

This repository is a laboratory for experiments and learning. Real backend products will be built in separate repositories to demonstrate applied concepts. 

`Learning Concept → Experiment → Real Project → Real Problem → Debugging`

## DSA Companion

Software engineering requires both systems knowledge and algorithmic problem-solving. This backend journey runs parallel to my algorithmic practice:

> **[365 Days LeetCoding with Cùi](https://github.com/tuan3011/365-Days-of-LeetCoding-with-Me)** — Focuses strictly on Data Structures and Algorithms.

The two projects serve complementary purposes and do not interfere with one another.

## Repository Structure

```text
SpringBoot-with-Me/
├── README.md
└── 01-Java-Backend-Fundamentals/
    └── Day-01-Debugger-and-Memory/
        ├── README.md
        └── src/
            └── Day1Debugger.java
