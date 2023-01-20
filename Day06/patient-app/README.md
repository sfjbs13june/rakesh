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

#Add junit dependency in pom.xml file

### **#Test application  (curl Commands)**
```agsl
curl --location --request POST 'localhost:8080/patient/save' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=5F812D64B9748F4CDAE37CBF353EF71F' \
--data-raw '{
     "id" : "133",
     "name" : "pat123",
     "age" : "40",
    "gender" : "male",
    "disease" : "bactrial"
}'



curl --location --request PUT 'localhost:8080/patient/update?disease=cold&age=50' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=5F812D64B9748F4CDAE37CBF353EF71F' \
--data-raw '{
     "id" : "123",
     "name" : "pat123",
     "age" : "30",
    "gender" : "male",
    "disease" : "bactrial"
}'
```


**#Add Spring Security Dependency in pom.xml file**

```agsl

curl --location --request POST 'localhost:8080/patient/save' \
--header 'Authorization: Basic dXNlcjEyMzpwYXNzd29yZA==' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=F9EA9AAC3C5EE82327345F02FDF83E9F' \
--data-raw '{
     "id" : "133",
     "name" : "pat123",
     "age" : "40",
    "gender" : "male",
    "disease" : "bactrial"
}'



curl --location --request PUT 'localhost:8080/patient/update?disease=cold&age=50' \
--header 'Authorization: Basic YWRtaW4xMjM6cGFzc3dvcmQ=' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=F9EA9AAC3C5EE82327345F02FDF83E9F' \
--data-raw '{
     "id" : "123",
     "name" : "pat123",
     "age" : "30",
    "gender" : "male",
    "disease" : "bactrial"
}'
```