### **#Create Spring Project**

https://start.spring.io/

#Select maven version as 2.7.8 and java as 11
#Add Spring web Dependency


### **#Build Project**
```agsl
mvn clean install
```

### **#Run the application**
```agsl
mvn spring-boot:run
```

### **#Test application  (curl Commands)**

```agsl
curl --location --request GET 'localhost:8080/get/students' \
--header 'Authorization: Basic dXNlcjEyMzpwYXNzd29yZA==' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=D45FE51A79F77DAE1439A47D38707660' \
--data-raw '{
     "name" : "rakesh",
     "roll" : "roll1",
     "std" : "10th",
    "schoolName" : "PCS"
    
}'




curl --location --request GET 'localhost:8080/map/students' \
--header 'Authorization: Basic YWRtaW4xMjM6cGFzc3dvcmQ=' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=D45FE51A79F77DAE1439A47D38707660' \
--data-raw '{
     "name" : "rakesh",
     "roll" : "roll1",
     "std" : "10th",
    "schoolName" : "PCS"
    
}'
```

### **#After adding Dockerfile**

**Build Project**
```agsl
mvn clean install
```

**Dockerization**
```agsl
mvn install dockerfile:build
```

**List Docker images**
```agsl
docker images
```

**List Docker running container**
```agsl
docker ps
```

**Running the application in docker container**
```agsl
docker run -p 8080:8080 rakeshuppala/student-app:0.0.1-SNAPSHOT
```

**Curl commands**
```agsl
curl --location --request GET 'localhost:8080/get/students' \
--data-raw ''

curl --location --request GET 'localhost:8080/map/students' \
--data-raw ''
```




