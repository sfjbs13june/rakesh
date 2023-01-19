### **#Create Spring Project**

https://start.spring.io/

#Select maven version as 2.7.7 and java as 11
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
curl --location --request GET 'localhost:8080/add?a=35&b=7'


curl --location --request POST 'localhost:8080/sub?a=35&b=7'


curl --location --request PUT 'localhost:8080/mul?a=35&b=7'


curl --location --request DELETE 'localhost:8080/div?a=35&b=7'
```


### **#Coverage**

#Run All Tests with Coverage(Right click on project to view this option)

#Output of the Coverage is:
```agsl
#for Class   -   100%

#for Method  -    80%

#for Line    -    85%
```


