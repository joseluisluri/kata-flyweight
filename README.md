[![Build Solved Branch Badge](https://travis-ci.org/joseluisluri/kata-flyweight.svg?branch=master)](https://travis-ci.org/joseluisluri/kata-flyweight)
[![Sonar Quality Gate Badge](https://sonarcloud.io/api/project_badges/measure?project=kata-flyweight%3Aapi&metric=alert_status)](https://sonarcloud.io/dashboard?id=kata-flyweight)

# Welcome to Flyweight Kata!

Learn about software patterns through guided exercises

## Table of contents

- [Setup](#setup)
- [Problem definition](#problem-definition)
- [Requirements](#requirements)
- [How to get started](#how-to-get-started)
- [Solution](#solution)

## Setup 

The following tools must be installed on your computer:

- [Java SE Development Kit 8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) or higher
- [IntelliJ IDEA: Community Edition](https://www.jetbrains.com/idea/download/)
- [Git](https://git-scm.com/downloads)

Once you're ready:

1. **Clone** this repository
2. Import the project and try to **compile it**
3. If the build is completed successfully, you can start

## Problem definition

In an imaginary Lego video game, bricks are generated according to their shape and color. To model this scenario, three classes have been defined: [Brick](https://github.com/joseluisluri/kata-flyweight/blob/master/src/main/java/Brick.java), [BrickColor](https://github.com/joseluisluri/kata-flyweight/blob/master/src/main/java/BrickColor.java) and [BrickType](https://github.com/joseluisluri/kata-flyweight/blob/master/src/main/java/BrickType.java).

The responsibility for creating instances of bricks has been delegated to a [BrickFactory](https://github.com/joseluisluri/kata-flyweight/blob/master/src/main/java/BrickFactory.java) component. Which depending on the characteristics of the brick returns the appropriate object.

Thousands of bricks will be generated during a game, so performance is a point to consider.

## Requirements

- Square pieces have a 2x2 dimension
- Rectangular pieces have a 4x2 (width x height) dimension
- Performance is very important, so keep in mind **not create more objects than necessary**

## How to get started

Follow the steps below:

1. Make sure you **understand** the problem
2. Read and **analyze** the source code
3. **Research** about flyweight pattern
4. **Implement** your solution in [BrickFactoryImpl](https://github.com/joseluisluri/kata-flyweight/blob/master/src/main/java/BrickFactoryImpl.java)
5. Run the unit tests to **evaluate** if your solution meets the requirements

## Solution

You can find a possible solution in the branch called "solved".
