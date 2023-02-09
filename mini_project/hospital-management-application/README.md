## Create Springboot Project
```agsl
https://start.spring.io/
```

## Build the Project
```agsl
mvn clean install 
```

## Docker image Creation
```agsl
mvn install dockerfile:build
```

## Run the Project
```agsl
cd docker
```
```agsl
docker-compose up -d
```
```agsl
cd..
```
```agsl
mvn spring-boot:run
```
```agsl
docker-compose down
```

## Testing 

### Doctor Controller
```agsl
curl --location --request GET 'localhost:8080/doctor/doctor-appointment?doctorName=pavan' \
--header 'Authorization: Basic ZG9jdG9yOmRvY3Rvcg==' \
--header 'Cookie: JSESSIONID=96A89FBBE914F890798E9CC99B9695D5' \
--data-raw ''





curl --location --request POST 'localhost:8080/doctor/save' \
--header 'Authorization: Basic ZG9jdG9yOmRvY3Rvcg==' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=B7E6821D388DCC56BEEA5BDB49700E17' \
--data-raw '{
        "appointmentId": "0001",
        "patientName": "pat0001",
        "doctorName": "pavan1",
        "date": "9th dec",
        "prescription": {
            "prescriptionId": "pre0001",
            "appointmentId": "app0001",
            "description": "drugs for dengue",
            "patientName": "Rakesh1",
            "doctorName": "pavan1"
        }
    }'
```

### Patient Controller
```agsl
curl --location --request GET 'localhost:8080/patient/myappointment?patientName=rakesh' \
--header 'Authorization: Basic cGF0aWVudDpwYXRpZW50' \
--header 'Cookie: JSESSIONID=96A89FBBE914F890798E9CC99B9695D5' \
--data-raw ''



curl --location --request POST 'localhost:8080/patient/save' \
--header 'Authorization: Basic cGF0aWVudDpwYXRpZW50' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=96A89FBBE914F890798E9CC99B9695D5' \
--data-raw '{
  "appointmentId": "app0003",
  "patientName": "rakesh",
  "doctorName": "pavan",
  "date": "6th feb",
  "prescription": {
    "prescriptionId": "pre0003",
    "appointmentId": "app0003",
    "description": "viral fever",
    "patientName": "rakesh",
    "doctorName": "pavan"
  }
}'

```


### Prescription Controller

```agsl
curl --location --request GET 'localhost:8080/patient/myappointment?patientName=rakesh' \
--header 'Authorization: Basic cGF0aWVudDpwYXRpZW50' \
--header 'Cookie: JSESSIONID=96A89FBBE914F890798E9CC99B9695D5' \
--data-raw ''



curl --location --request POST 'localhost:8080/patient/save' \
--header 'Authorization: Basic cGF0aWVudDpwYXRpZW50' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=96A89FBBE914F890798E9CC99B9695D5' \
--data-raw '{
  "prescriptionId": "pre0003",
  "appointmentId": "app0003",
  "description": "bp",
  "patientName": "rakesh",
  "doctorName": "pavan"
}'
```

## Docker Commands
```agsl
docker ps -a

docker stop <CONTAINER_ID>

docker rm <CONTAINER_ID>

docker rmi <IMAGE_ID>
```

## Swagger
```agsl
http://localhost:8080/swagger-ui-/index.html
```


## Credentials
```agsl
ROLE :DOCTOR---> Username & Password : doctor  & doctor
ROLE :PATIENT--> Username & Password : patient & pstient
```