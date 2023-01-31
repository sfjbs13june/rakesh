#Build

mvn clean install

# Run
```
docker-compose -f docker-compose-mysql.yml up -d

mvn spring-boot:run

docker-compose -f docker-compose-mysql.yml down

```
# training
##POST

```
curl --location --request POST 'localhost:8081/patient/save' \
--header 'Content-Type: application/json' \
--data-raw '{
    "id":2,
    "name":"shashank",
    "age":26,
    "gender":"Male",
    "disease":"Fever"
}'

```
## Get

```
curl -X GET http://localhost:8081/user/read 
```

## Getting inside container

docker exec -it <container-id> /bin/bash
mysql -u user -p
show databases;
use db;
show tables;
select * from user;
