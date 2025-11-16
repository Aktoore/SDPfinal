# Vehicle Rental System

A vehicle rental system implemented using multiple software design patterns.

## Architecture Overview

### Design Patterns Used
- **Bridge** – separates abstraction from implementation  
- **Decorator** – adds features dynamically  
- **Factory** – centralized object creation  
- **Facade** – simplifies complex operations  
- **Observer** – notifies users about changes  
- **Strategy** – interchangeable pricing algorithms  

## Project Structure

### Core Components
- `User.java` – abstract user class  
- `Customer.java`, `Admin.java` – concrete user types  
- `Vehicle.java` – abstract vehicle class  
- `Car.java`, `Bike.java`, `Van.java` – concrete vehicles  

### Bridge Pattern
- `FuelType.java` – fuel type interface  
- `Electric.java`, `Petrol.java`, `Diesel.java` – fuel implementations  
- `Color.java` – color interface  
- `RedColor.java`, `BlueColor.java`, `BlackColor.java` – color implementations  

### Decorator Pattern
- `VehicleDecorator.java` – base decorator  
- `GPSDecorator.java` – adds GPS  
- `InsuranceDecorator.java` – adds insurance  
- `ChildSeatDecorator.java` – adds child seat  

### Factory Pattern
- `UserFactory.java` – creates users  
- `VehicleFactory.java` – creates vehicles  

### Other Patterns
- `PricingStrat.java` – pricing strategy interface  
- `Hourly.java`, `Daily.java` – pricing strategy implementations  
- `Observer.java`, `UserObserver.java` – observer system  
- `RentalFacade.java` – unified rental interface  
- `NotificationFacade.java` – notification management  

## Benefits of the Architecture

### Bridge Pattern
- Easy to add new fuel types or colors  
- Abstraction is fully separated from implementation  
- Increases flexibility and maintainability  

### Decorator Pattern
- Adds functionality without modifying existing classes  
- Multiple decorators can be combined  
- Supports the open/closed principle  

## Running the Project

```bash

javac -d target/classes src/*.java

java -cp target/classes Main
javac -d target/classes src/*.java
java -cp target/classes Main
