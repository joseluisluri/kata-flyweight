# Welcome to Flyweight Kata!

[TOC]

## Setup 

The following tools must be installed on your computer:

- [Java SE Development Kit 8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) or higher.
- [IntelliJ IDEA: Community Edition](https://www.jetbrains.com/idea/download/)
- [Git](https://git-scm.com/downloads)

Once you're ready:

1. Clone this repository
2. Import the project and try to compile it.
3. If the build is completed successfully, you can start.

## Problem definition

In an imaginary Lego video game, bricks are generated according to their shape and color. To model this scenario, three classes have been defined: Brick, BrickColor and BrickType.

The responsibility for creating instances of bricks has been delegated to a BrickFactory component. Which depending on the characteristics of the X returns the appropriate object.

Thousands of bricks will be generated during a game, so performance is a point to consider.

## Requirements

- Square pieces have a 2x2 dimension
- Rectangular pieces have a 4x2 (width x height) dimension
- Performance is very important, so keep in mind **not create more objects than necessary**

## What you need to do

Follow the steps below:

1. Make sure you **understand** the problem
2. Read and **analyze** the source code
3. **Research** about flyweight pattern
4. **Implement** your solution in _BrickFactoryImpl.java_
5. Run the unit tests to **evaluate** if your solution meets the requirements

## Solution

You can find a possible solution in the branch called "solved".