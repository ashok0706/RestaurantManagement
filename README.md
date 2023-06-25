## **Restaurant management**

### Frame Works And Language Used 
---
* JAVA Programming language
* SQL for Querries
 * Spring Boot
 * MYSQL
 * Hybernate
 * Lombook
 * Maven Biuld Tool
 * Valiadation 

### Data Flow
----
1. #### **controller**
  * AdminController

  PathS-- 1. Admin/signUp

         2. Admin/addfoodItems/{email}

  Admin can directly add Food item 

  * VisitorController

  Paths -- 1. visitor/signUp

          2. oder

for This function i have used ***@POSTMAPPING , @REQUESTBODY, @PATHVARIABLE*** at methode level
 

 ***@RestController @Requestmapping*** at classelevel, 


2. #### Service
  * AdminServise

  * VisitorServise


These All classer used for Busseness logic operations
are Annatated with  
***@service***

3. #### Model
 * Admin

* Visitor

* Order

* Fooditems

  These all are Entity classes 
  every class annotated with ***@Entity, @Data, @NoArgConstructor, @Id  and used @valid Email , id***

4. #### Repository
 * AdminRepo

  * VisitorRepo

  * OrderRepo

  * FoodItemRepo

  

   These all are Interfaces and all  extended with JpaCRUD repository

   every class annotated with ***@Repository***.

   ### Data Stuctures 

 Regular Array Lists Are used.

 ### Summary

 This project is designed for 
 * visitor can Order food
 * Admin can add fooditems.
 
The  operations on various tables wich are internally connected as OnetoOne, ManytoOne, ManytoMany  form.



