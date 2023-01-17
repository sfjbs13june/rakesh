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
#Add junit dependency in pom.xml file

#### **#Test application**
```
curl --location --request GET 'localhost:8082/add?x=60&y=30'

curl --location --request GET 'localhost:8082/sub?x=60&y=30'

curl --location --request GET 'localhost:8082/mul?x=60&y=30'

curl --location --request GET 'localhost:8082/div?x=60&y=30'
```

#### **#Coverage**

#Run All tests with coverage(right click on project)

#Output of code coverage is:
```
#for Class  -  100%

#for Method -  80%

#for Line   -  85%
```