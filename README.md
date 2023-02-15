<br>
<h1 align="center">
API-TASK + Docker.
</h1>
<br>

## 💬 About the repository

Repository where in creating and updating a taska in the database
## ⚠ Prerequisites for project execution

* docker
* docker-compose

## 📌 How to use?
First we will build the appication so that the .jar can be generated.
```
mvn clean install -DskipTests
```
After the build is complete, just run the application. 
```
docker-compose up
```
let's access the application's routes. This api is already documented, which makes it easier for us to test the routes
```
http://localhost:8080/swagger-ui/index.html
```


---
Thank you!
