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
  * RestarauntController

  PathS-- 1. /getRestaurant/{id} 

         2. /getAllRestaurant 
         
         3. /updateRestaurant 

         4. /deleteRestaurant

         5 . /creatReastaurant

         

for This function i have used ***@POSTMAPPING , @REQUESTBODY, @PATHVARIABLE*** at methode level
 

 ***@RestController @Requestmapping*** at classelevel, 


2. #### Service
  * ReastaurantSeravise



These All classer used for Busseness logic operations
are Annatated with  
***@service***

3. #### Model
 * Restaurant


  These all are Entity classes 
  every class annotated with ***@Entity, @Data, @NoArgConstructor, @Id  and used @valid Email , id***

4. #### Repository
 * RestaurantRepo

  

  

   These all are Interfaces and all  extended with JpaCRUD repository

   every class annotated with ***@Repository***.

   ### Data Stuctures 

 Regular Array Lists Are used.

 ### Summary

 This project is designed for 
 * restaurant CRUD Operation
 
The  operations on  tables wich are RDBMS. 



