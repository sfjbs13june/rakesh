#Build

mvn clean install

# Run
docker-compose -f docker-compose-rabbitmq.yml up -d


rabbitmq-app-producer> mvn spring-boot:run

# Test
curl --location --request GET 'http://localhost:8080/rabbitmq/producer?empName=employee1&empId=id1'


rabbitmq-app-consumer> mvn spring-boot:run

#Show data on browser::

http://localhost:15672/

user-name:guest
password:guest


## Stop Container
```agsl
docker-compose -f docker-compose-rabbitmq.yml down
```
v