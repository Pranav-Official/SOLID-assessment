# GameStore Documentation

## Overview

This Java application, named `GameStore`, serves as a simple representation of a game store. The application employs several classes and interfaces to demonstrate the usage of SOLID principles. Below is the documentation for the provided code.

## SOLID Principles

### Single Responsibility Principle (SRP)

#### `GameStore` Class

The `GameStore` class is primarily responsible for managing the game store application's flow. It incorporates a menu system for downloading and installing games. The main method of this class demonstrates the adherence to the Single Responsibility Principle by handling the user interface logic and the initiation of game processing.

#### `GameProcessor` Class

The `GameProcessor` class adheres to the Single Responsibility Principle by focusing on the processing of games. It implements the `GameProcessorInterface` and delegates the download and installation tasks to the specified `Downloadable` and `Installable` instances.

#### `Downloadable` and `Installable` Interfaces

These interfaces follow the Single Responsibility Principle by defining clear responsibilities: one for handling game downloads (`Downloadable`) and the other for game installations (`Installable`).

### Open/Closed Principle (OCP)

#### `Downloadable` Interface

There are several implementions of `Downloadable` Interface, such as `FTPDownloader`, `NormalDownload`. This makes Downlaod function open for extentions, without modifying existing code.

#### `GameProcessor` Class

The `GameProcessor` class is designed to be open for extension and closed for modification. It achieves this by accepting implementations of `Downloadable` and `Installable` through its constructor. This allows for easy extension by introducing new download or installation strategies without modifying the existing code.

### Liskov Substitution Principle (LSP)

#### `OnlineGame` Class

The `OnlineGame` class is an extension of the `Game` class, demonstrating the Liskov Substitution Principle. It inherits from `Game` and introduces additional properties specific to online games.

#### `OfflineGame` Class

The `OfflineGame` class is an extension of the `Game` class, demonstrating the Liskov Substitution Principle. It inherits from `Game` and introduces additional properties specific to Offine games.

These two Classes can be substituted interchangable, and the behaviour of the program will not change, and even and instance of `Game` can also be used, thus completed the **Liskov Substitution Principle (LSP)**

Same fuctionality is implemented by the child classes of `Verification` Class, that are `OnlineVerification` , `SystemBasedVerification` and `KeyBasedVarification`.

### Interface Segregation Principle (ISP)

#### `Downloadable` Interface and `Installable` Interface

The `Downloadable` and Installable interface are interfaces defining two fuctionality of idownloading and intsalling games. These fuction whould normally be used together. But since it can be used individually, both the functions are defined in interfaces and then segregated.

### Dependancy Inversion

### `Verification` Interface

There are 3 verification classes that are implementing the `Verification` Interface, that are `OnlineVerification` , `SystemBasedVerification` and `KeyBasedVarification`. SO normally we cna create objects of these classes by using the class as data type. eg `OnlineVerification newVerification = new OnlineVerification() `. This will be the program or the current class dependant on a low level module such as `OnlineVerification`. Instead we inver the depandancy to teh parent of the classes. eg `Verification newVerification = new OnlineVerification() `

#### 

## Classes and Interfaces

### `GameStore`

The main class responsible for initiating the game store application, managing user interactions, and demonstrating the use of SOLID principles.

### `GameProcessor`

A class implementing the `GameProcessorInterface`, responsible for processing games using specified download and installation strategies.

### `GameProcessorInterface`

An interface defining methods related to game processing.

### `Downloadable`

An interface specifying methods for handling game downloads.

### `NormalDownload`

A concrete implementation of the `Downloadable` interface, representing normal download behavior.

### `Installable`

An interface specifying methods for handling game installations.

### `InstallationManager`

A concrete implementation of the `Installable` interface, representing installation management behavior.

### `Game`

A class representing general game information, with properties such as name, version, price, and online status.

### `OnlineGame`

An extension of the `Game` class specifically for online games, introducing additional properties.

### `rewards`

A class providing a method `displayRewards` to display rewards based on game information. It calculates rewards as 30% of the game's price.



