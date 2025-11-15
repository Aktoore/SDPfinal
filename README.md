# 🚗 Vehicle Rental System

Система аренды транспортных средств с использованием паттернов проектирования.

## 🏗️ Архитектура проекта


- **Bridge** - разделение абстракции и реализации
- **Decorator** - динамическое добавление функциональности  
- **Factory** - создание объектов
- **Facade** - унифицированный интерфейс
- **Observer** - система уведомлений
- **Strategy** - алгоритмы ценообразования

## 📁 Структура проекта

### Core Components:
- `User.java` - абстрактный класс пользователя
- `Customer.java`, `Admin.java` - конкретные пользователи
- `Vehicle.java` - абстрактный класс транспортного средства
- `Car.java`, `Bike.java`, `Van.java` - конкретные транспортные средства

### Bridge Pattern:
- `FuelType.java` - интерфейс типа топлива
- `Electric.java`, `Petrol.java`, `Diesel.java` - реализации
- `Color.java` - интерфейс цвета
- `RedColor.java`, `BlueColor.java`, `BlackColor.java` - реализации

### Decorator Pattern:
- `VehicleDecorator.java` - абстрактный декоратор
- `GPSDecorator.java` - добавление GPS
- `InsuranceDecorator.java` - добавление страховки
- `ChildSeatDecorator.java` - добавление детского кресла

### Factory Pattern:
- `UserFactory.java` - фабрика пользователей
- `VehicleFactory.java` - фабрика транспортных средств

### Other Patterns:
- `PricingStrat.java` - стратегия ценообразования
- `Hourly.java`, `Daily.java` - конкретные стратегии
- `Observer.java`, `UserObserver.java` - наблюдатель
- `RentalFacade.java` - фасад для упрощения работы
- `NotificationFacade.java` - фасад уведомлений

## 🎯 Преимущества архитектуры

### Bridge Pattern:
- **Гибкость**: Легко добавлять новые цвета и типы топлива
- **Расширяемость**: Отделяет абстракцию от реализации
- **Поддержка**: Упрощает модификацию системы

### Decorator Pattern:
- **Динамичность**: Добавление функций без изменения классов
- **Комбинируемость**: Несколько декораторов можно использовать вместе
- **Открытость/закрытость**: Система открыта для расширения, но закрыта для изменений

## 🚀 Запуск проекта

```bash
# Компиляция
javac -d target/classes src/*.java

# Запуск
java -cp target/classes Main