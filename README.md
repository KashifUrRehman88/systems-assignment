# systems-assignment
This repository holds the SD manager project which is an application to govern the process of ticket handling. 

Dear Hiring Team, to develop this application I have used below technologies :- 

JAVA VERSION 17 

SPRING BOOT VERSION 3.1.3

MAVEN : - To manage a project's build, reporting and documentation from a central piece of information. Using maven we can build and manage any Java based project.

LOMBOK VERSION 1.18.22 (This library helps us ide to ignore generating boiler plate code for your pojo classes (No need of generating getters, setter explicitly). And this is done during compile time. The main aim of project Lombok is reduce boilerplate headaches out of the developer's task list.)

SPRING-DATA-JPA VERSION  3.1.3 (To store data in a relational database.)

JPA-REPOSITORY (JpaRepository is a JPA (Java Persistence API) specific extension of Repository. It contains the full API of CrudRepository and PagingAndSortingRepository. So it contains API for basic CRUD operations and also API for pagination and sorting. )



#  Coding Technique : - 

I have created three Controllers i.e. : - 

1. ReportController.java (API to Set Report to Assignee)
2. TicketAuditController.java (API to View Ticket History via API)
3. TicketController.java (API for CRUD on Ticket Including Update Ticket Status API)
4. TicketDistributionController.java (API and service to assign and distribute the 1000 tickets to multiple assignees.)

Dear Hiring Team, you may be thinking that all APIs can be integrated into only two Controllers i.e. TicketController.java and ReportController.java. Yes I can also do that

BUT

In Java, when we're designing a web application using a framework like Spring MVC, it's generally considered a good practice to organize your APIs into separate controllers based on their functionality. This helps improve code organization, maintainability, and separation of concerns.


Each controller should be responsible for a specific set of related APIs, making the codebase more modular and easier to manage. This separation helps with code readability, reduces the chances of conflicts, and makes it simpler to find and modify specific APIs in the future.

So, that is the reason I have 4 controllers. it's generally recommended to keep separate controllers for different sets of APIs rather than combining multiple APIs into a single controller. This practice aligns well with the principles of modular and maintainable software design.

