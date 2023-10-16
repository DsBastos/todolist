<h1 align="center">
  To-do List in Java Spring Boot
</h1>

<p align="center">
  <img alt="GitHub language count" src="https://img.shields.io/github/languages/count/dsbastos/todolist-Java-Spring_Boot">

  <img alt="Repository size" src="https://img.shields.io/github/repo-size/dsbastos/todolist-Java-Spring_Boot">

  <a href="https://github.com/dsbastos/todolist-Java-Spring_Boot/">
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/dsbastos/todolist-Java-Spring_Boot">
  </a>

   <img alt="License" src="https://img.shields.io/badge/license-MIT-brightgreen">
   <a href="https://github.com/dsbastos/todolist-Java-Spring_Boot/stargazers">
  </a>

  <a href="https://www.linkedin.com/in/daniel-bastos98/">
    <img alt="made by Daniel Bastos" src="https://img.shields.io/badge/made%20by-Daniel%20Bastos-blue">
  </a>
</p>

<h4 align="center">
  Status: Finished
</h4>

<p align="center">
About •
Features •
Tech •
How to test? •
Author
</p>

<h1 align="center">
    <img alt="move.it" title="move.it" src="src\main\resources\static\Wallpaper.png" />
</h1>

## 💻 About

Backend of a To-Do list in Spring Boot (Java web framework).

This project I did in the Java course offered by Rocketseat.

This was my first experience with Spring Boot.

I do deploy in **[Render](https://www.render.com/)** to create a image of my environment in Docker.

## ⚙️ Features

- User registration
- User authentication
- Permissions check
- Password encryption
- Task creation
- Updating tasks

## 🛠️ Tech

The following tools were used in the construction of the project:

- **[Java](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)**
- **[Spring Boot](https://spring.io/projects/spring-boot)**
- **[H2 Database Engine](https://www.h2database.com/html/main.html)**
- **[Docker](https://www.docker.com/)**

## 🤔 How to test?

### Create a User

1. **Method:** POST
2. **URL:** <https://todolist-springboot-2sb6.onrender.com/users/>
3. **Request Body:** JSON format:

```json
{
  "name": "NameTest",
  "username": "UsernameTest",
  "password": "12345"
}
```

### Create a Task

1. **Method:** POST
2. **URL:** <https://todolist-springboot-2sb6.onrender.com/tasks/>
3. **Request Body:** JSON format:

```json
{
  "description": "Go to shop in Lisbon",
  "title": "Vacation",
  "priority": "High",
  "startAt": "2024-08-14T12:30",
  "endAt": "2024-08-14T15:35"
}
```

### View Created Tasks

1. **Method:** GET
2. **URL:** <https://todolist-springboot-2sb6.onrender.com/tasks/>

### Update a Task

1. **Method:** PUT
2. **URL:** <https://todolist-springboot-2sb6.onrender.co/id> (Replace id with the task's ID)
3. **Request Body:** JSON format:

```json
{
  "description": "Go to shop in Viseu"
}
```

Be sure to include Basic Authentication in all requests by providing the username and password of the user created during registration. This is essential to ensure access to view, create and update tasks. In addition, check that the requests are configured correctly and that you have the necessary permissions to access the URL provided.

## Getting Started

1 - Clone the git clone repository <https://github.com/DsBastos/todolist-Java-Spring_Boot.git>

2 - Run mvn clean install to install the dependencies

3 - Run mvn spring-boot:run to upload the application

4 - The application will be available on port localhost:8080

5 - Use an HTTP request application to run the tests

## 👨🏻‍💻 Author

<a href="https://www.linkedin.com/in/daniel-bastos98/">
 <img style="border-radius: 50%;" src="https://avatars2.githubusercontent.com/u/29290002?s=400&u=30a3e2a8c4f61097a9d2366964baefc176a60b89&v=4" width="100px;" alt="Daniel Bastos "/>
</a>

[![Linkedin Badge](https://img.shields.io/badge/-Daniel-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/daniel-bastos98/)](https://www.linkedin.com/in/daniel-bastos98/)
