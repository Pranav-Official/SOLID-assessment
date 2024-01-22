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

### Interface Segregation Principle (ISP)

#### `GameProcessorInterface` Interface

The `GameProcessorInterface` interface adheres to the Interface Segregation Principle by providing a specific set of methods related to game processing. This allows implementing classes to choose and implement only the methods relevant to their responsibilities.

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



