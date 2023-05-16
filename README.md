
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

* Users Login Features:-
 * Allows users to create an account and log in to the system.
 * Provides authentication and authorization mechanisms to ensure secure access.
 * Manages user profiles, including personal information and account settings.
 * Supports password recovery and account activation processes.

* Admin Features:
 * Enables administrators to manage the overall system and its configuration.
 * Grants administrative privileges to perform critical tasks.
 * Allows adding, editing, and deleting user accounts.

* Users Features:
 * Allows users to view and manage their profiles.
 * Provides options to update personal information and account settings.
 * Supports user interactions, such as following other users or sending friend requests.
 * Enables users to view their activity history and manage privacy settings.

* Category Features:

Enables the creation and management of different categories or topics for posts.
Provides options to add, edit, and delete categories.
Allows categorization of posts for better organization and navigation.
Supports searching and filtering posts based on categories.

* Post Features:
 * Enables users to create, edit, and delete posts.
 * Provides options to format and style post content.
 * Supports multimedia content, such as images or videos, within posts.
 * Allows users to like, share, or bookmark posts.
 * Provides features for sorting and filtering posts based on various criteria.

* Comment Features:
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


### Users Module

* `POST /register:` Purpose:` Registers a new user.
`Request Body:` JSON object representing the user details to be registered (UserDto).
`Response:` Returns a UserDto object representing the registered user and HTTP status code 201 (Created).

* `PUT /update/{userId}:`
`Purpose:` Updates an existing user.
`Path Parameter:` userId - The ID of the user to update.
`Request Body:` JSON object representing the updated user details (UserDto).
`Response:` Returns a UserDto object representing the updated user and HTTP status code 202 (Accepted).

* `GET /{userId}:`
`Purpose:` Retrieves a user by their ID.
`Path Parameter:` userId - The ID of the user to retrieve.
`Response:` Returns a UserDto object representing the retrieved user and HTTP status code 200 (OK).

* `DELETE /{userId}:`
`Purpose:` Deletes a user by their ID.
`Path Parameter:` userId - The ID of the user to delete.
`Response:` Returns an HTTP status code 200 (OK) if the user is successfully deleted.

* `GET /getAll:`
`Purpose:` Retrieves all users.
`Response:` Returns a list of UserDto objects representing all users and HTTP status code 200 (OK).


### Post Module

* `POST /user/{userId}/category/{categoryId}/posts:`
`Purpose:` Creates a new post for a specific user and category.
`Path Parameters:`
`userId:` The ID of the user creating the post.
`categoryId:` The ID of the category for the post.
`Request Body:` JSON object representing the post details (PostDto).
`Response:` Returns a PostDto object representing the created post and HTTP status code 201 (Created).

* `PUT /post/{postId}:`
`Purpose:` Updates an existing post.
`Path Parameter:` postId - The ID of the post to update.
`Request Body:` JSON object representing the updated post details (PostDto).
`Response:` Returns a PostDto object representing the updated post and HTTP status code 200 (OK).

* `GET /post/{postId}:`
`Purpose:` Retrieves a post by its ID.
`Path Parameter:` postId - The ID of the post to retrieve.
`Response:` Returns a PostDto object representing the retrieved post and HTTP status code 202 (Accepted).

* `DELETE /{postId}/post:`
`Purpose:` Deletes a post by its ID.
`Path Parameter:` postId - The ID of the post to delete.
`Response:` Returns an HTTP status code 200 (OK) if the post is successfully deleted.

* `GET /allposts:`
`Purpose:` Retrieves all posts.
`Response:` Returns a list of PostDto objects representing all posts and HTTP status code 202 (Accepted).

* `GET /allpost/:`
`Purpose:` Retrieves all posts with pagination and sorting options.
`Request Parameters:`
`pageNumber (optional):` The page number to retrieve (default: 1).
`pageSize (optional):` The number of posts per page (default: 10).
`sortBy (optional):` The field to sort the posts by (default: predefined value).
`sortDir (optional):` The sort direction (asc/desc) for the posts (default: predefined value).
`Response:` Returns a PostResponse object containing paginated post results and HTTP status code 200 (OK).

* `GET /category/{categoryId}/posts:`

`Purpose:` Retrieves posts for a specific category with pagination.
`Path Parameter:` categoryId - The ID of the category to retrieve posts for.
`Request Parameters:`
`pageNumber (optional):` The page number to retrieve (default: 1).
`pageSize (optional):` The number of posts per page (default: 10).
`Response:` Returns a PostResponse object containing paginated post results and HTTP status code 202 (Accepted).

* `GET /user/{userId}/posts:`
`Purpose:` Retrieves posts for a specific user with pagination.
`Path Parameter:` userId - The ID of the user to retrieve posts for.
`Request Parameters:`
`pageNumber (optional):` The page number to retrieve (default: 1).
`pageSize (optional):` The number of posts per page (default: 10).
`Response:` Returns a PostResponse object containing paginated post results and HTTP status code 202 (Accepted).

*`GET /posts/{keyword}:`
`Purpose:` Retrieves posts by searching for a keyword in the title.
`Path Parameter: keyword -` The keyword to search


 ### Comment Module
 
 * `POST/{postId}/user/{userId}/comment:`
 `Purpose:` Creates a new comment for a specific post and user.
`Path Parameters:`
`postId:` The ID of the post the comment belongs to.
`userId:` The ID of the user creating the comment.
`Request Body:` JSON object representing the comment details (CommentDto).
`Response:` Returns a CommentDto object representing the created comment and HTTP status code 201 (Created).

* `DELETE /comment/{commentId}:`
`Purpose:` Deletes a comment by its ID.
`Path Parameter:` commentId - The ID of the comment to delete.
`Response:` Returns an HTTP status code 200 (OK) if the comment is successfully deleted.


 ### Comment Module
 



### some screenshots of the Swagger UI 
![blog](https://user-images.githubusercontent.com/87421981/236360645-f2a9a65a-d749-41a1-adfe-5e7d60b570f9.PNG)


