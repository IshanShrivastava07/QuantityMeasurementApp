# 🚀 Quantity Measurement Application  
📏 *TDD • Clean Code • Scalable Architecture*

---

## 🧠 Project Overview
A scalable system to handle:
- Unit Equality
- Unit Conversion
- Arithmetic Operations
- Multi-category Measurements (Length, Weight, Volume, Temperature)

---

# 📚 Use Case Implementation (UC1 → UC21)

---

## 📅 UC1 – Feet Equality
**Branch:** feature/UC1-FeetEquality  

### 🎯 Objective
- Validate equality between two Feet values

### ✅ Implementation
- Created `Feet` class  
- Implemented `equals()` method  
- Added null & type safety  
- Wrote JUnit tests  

---

## 📅 UC2 – Feet & Inches Equality
**Branch:** feature/UC2-InchEquality  

### 🎯 Objective
- Compare Feet and Inches  
- Ensure `12 inches = 1 foot`

### ✅ Implementation
- Introduced conversion logic  
- Base unit comparison  
- Improved equality handling  

---

## 📅 UC3 – Generic Quantity (DRY)
**Branch:** feature/UC3-GenericLength  

### 🎯 Objective
- Remove duplication  
- Create reusable Quantity class  

### ✅ Implementation
- Centralized conversion  
- Eliminated unit-specific logic  
- Improved abstraction  

---

## 📅 UC4 – Extend Units (Yard)
**Branch:** feature/UC4-YardEquality  

### 🎯 Objective
- Support more units  
- Make system scalable  

### ✅ Implementation
- Added `Unit Enum`  
- Base unit mapping  
- Extensible structure  

---

## 📅 UC5 – Unit Conversion
**Branch:** feature/UC5-UnitConversoion  

### 🎯 Objective
- Convert units (Feet ↔ Inch ↔ Yard)

### ✅ Implementation
- `convertTo()` method  
- Centralized logic  
- Precision-safe calculations  

---

## 📅 UC6 – Addition of Units
**Branch:** feature/UC6-UnitAddition  

### 🎯 Objective
- Add two quantities  

### ✅ Implementation
- Convert → Add → Return  
- Accurate arithmetic logic  

---

## 📅 UC7 – Target Unit Addition
**Branch:** feature/UC7-TargetUnitAddition  

### 🎯 Objective
- Add values and return in specific unit  

### ✅ Implementation
- `add(quantity, targetUnit)`  
- Conversion before return  

---

## 📅 UC8 – Standalone Unit Enum
**Branch:** feature/UC8-StandaloneUnit  

### 🎯 Objective
- Improve modularity  

### ✅ Implementation
- Separated Unit enum  
- Better design & flexibility  

---

## 📅 UC9 – Weight Measurement
**Branch:** feature/UC9-WeightMeasurement  

### 🎯 Objective
- Add Weight category  

### ✅ Implementation
- Added Gram, Kilogram  
- Category-safe comparison  
- Prevented cross-category operations  

---

## 📅 UC10 – Generic Quantity (Multi-category)
**Branch:** feature/UC10-GenericQuantity  

### 🎯 Objective
- Fully generic system  

### ✅ Implementation
- Created `Unit Interface`  
- Generic class `<T extends Unit>`  
- Type-safe operations  

---

## 📅 UC11 – Volume Measurement
**Branch:** feature/UC11-VolumeMeasurement  

### 🎯 Objective
- Add Volume category  

### ✅ Implementation
- Added Litre, Millilitre  
- Base unit: ml  
- Conversion + addition  

---

## 📅 UC12 – Subtraction & Division
**Branch:** feature/UC12-SubtractionAndDivision  

### 🎯 Objective
- Extend arithmetic operations  

### ✅ Implementation
- `subtract()`  
- `divide()`  
- Base unit logic  

---

## 📅 UC13 – Centralized Arithmetic Logic
**Branch:** feature/UC13-CentralizedArithmeticLogic  

### 🎯 Objective
- Remove duplication  

### ✅ Implementation
- Common arithmetic handler  
- DRY principle enforced  

---

## 📅 UC14 – Temperature Measurement
**Branch:** feature/UC14-TemperatureMeasurementwithSelectiveArithmetic  

### 🎯 Objective
- Add Temperature  

### ⚠ Special Logic
```
°F = (°C × 9/5) + 32
```

### ✅ Implementation
- Formula-based conversion  
- Restricted invalid arithmetic  
- Domain-specific rules  

---

## 📅 UC15 – N-Tier Architecture
**Branch:** feature/UC15-NTierArchitectureRefactor  

### 🎯 Objective
- Improve structure  

### 🏗 Architecture
```
Controller → Service → Repository → DB
```

### ✅ Implementation
- DTO layer  
- Service layer  
- Dependency Injection  

![WhatsApp Image 2026-04-06 at 3 52 24 PM](https://github.com/user-attachments/assets/2e2d5e43-25f4-41d5-918f-20b577956c70)

---

## 📅 UC16 – JDBC Persistence
**Branch:** feature/UC16-JDBCPersistence  

### 🎯 Objective
- Add database support  

### 🗄 Tables
```
users
measurements
measurement_units
```

### ✅ Implementation
- JDBC integration  
- Prepared statements  
- Connection pooling  

---

## 📅 UC17 – Spring Boot Backend
**Branch:** feature/UC17-SpringBackend  

### 🎯 Objective
- Build REST APIs  

### ✅ Implementation
- Controllers  
- Services  
- JPA integration  

---

## 📅 UC18 – Google Auth + JWT
**Branch:** feature/UC18-GoogleAuthUserManagement  

### 🎯 Objective
- Secure APIs  

### 🔐 Flow
```
User → Google Login → JWT → API Access
```

### ✅ Implementation
- OAuth2 login  
- JWT token generation  
- Role-based security  

---

## 📅 UC21 – Microservices Architecture
**Branch:** feature/UC21-MicroservicesArchitecture  

### 🎯 Objective
- Convert monolith → microservices  

### 🏗 Architecture
```
API Gateway
   ↓
Auth Service | Quantity Service | Admin Service
   ↓
Eureka Server
```

### ✅ Implementation
- Service registry (Eureka)  
- API Gateway  
- JWT security  
- Independent services  

---

<img width="800" height="400" alt="image" src="https://github.com/user-attachments/assets/f945ff65-83cb-4c31-abc4-39c7cd70ca3b" />


# ✨ Highlights

- 🧪 TDD Driven Development  
- 🧱 Clean Architecture  
- 🔐 Secure Authentication  
- 🔄 Scalable Microservices  
- 📦 Multi-domain Support  

---
