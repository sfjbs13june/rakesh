#### **#Create Springboot project**

https://start.spring.io/

#select maven version as 2.7.7 and java as 11
#Add Spring web dependency

#### **#Build project**
```
mvn clean install
```

#### **#Run the application**
```
mvn spring-boot:run
```

#### **#Test application**
```
curl --location --request GET 'localhost:8081/request/hello?name=Rakesh'

curl --location --request GET 'localhost:8081/send/welcome'
```

#### **#Coverage**

#Run All tests with coverage(right click on project)

#Output of code coverage is:
```
#for Class  -  100%

#for Method -  80%

#for Line   -  85%
```