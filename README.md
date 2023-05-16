
# BloggingApplication

This is a RESTful web service for a blogging platform that provides secure CRUD operations with authentication and authorization using Spring Security. The API is built using Java and the Spring Framework.


### Technical Stacks

- Spring Boot 
- Spring Framework
- Spring Data JPA 
- MySQL 
- Hibernate
- Java
- Swagger UI
- Postman
- Spring Security


### Modules
-  Users Login Module
-  Admin Module
-  Users Module
-  Category Module
-  Post Module
-  Comment Module


### Features

* Users Login Module:-
 * Allows users to create an account and log in to the system.
 * Provides authentication and authorization mechanisms to ensure secure access.
 * Manages user profiles, including personal information and account settings.
 * Supports password recovery and account activation processes.

* Admin Module:
 * Enables administrators to manage the overall system and its configuration.
 * Grants administrative privileges to perform critical tasks.
 * Allows adding, editing, and deleting user accounts.

* Users Module:
 * Allows users to view and manage their profiles.
 * Provides options to update personal information and account settings.
 * Supports user interactions, such as following other users or sending friend requests.
 * Enables users to view their activity history and manage privacy settings.

* Category Module:

Enables the creation and management of different categories or topics for posts.
Provides options to add, edit, and delete categories.
Allows categorization of posts for better organization and navigation.
Supports searching and filtering posts based on categories.

* Post Module:
 * Enables users to create, edit, and delete posts.
 * Provides options to format and style post content.
 * Supports multimedia content, such as images or videos, within posts.
 * Allows users to like, share, or bookmark posts.
 * Provides features for sorting and filtering posts based on various criteria.

* Comment Module:
 * Enables users to comment on posts and engage in discussions.
 * Supports threaded discussions to facilitate nested comments.
 * Provides options to like or dislike comments.
Supports moderation features to manage and remove comments if necessary.


### ER Diagram
The following Diagram depicts the flow of our Entity Relation Diagram to simplify the work flow.
![blog-er-digram](https://user-images.githubusercontent.com/87421981/236364968-56ba9d60-b1c0-418d-be51-10b9a62ff69d.png)


### Installation & Run
- Before running the API server, you have to update the database configuration inside the application.properties file
- Update the port number, username and password as per your local database configuration
````
    server.port=8888

    spring.datasource.url=jdbc:mysql://localhost:3306/ecomdb;
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    spring.datasource.username=root
    spring.datasource.password=ujjawal
    
````
## API Root Endpoint

`https://localhost:8888/index.html`

`http://localhost:8888/swagger-ui.html`


### some screenshots of the Swagger UI 
![blog](https://user-images.githubusercontent.com/87421981/236360645-f2a9a65a-d749-41a1-adfe-5e7d60b570f9.PNG)


