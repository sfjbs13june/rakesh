# Build
mvn clean install

# Run Reciever
mvn spring-boot:run


# Run Caller

mvn spring-boot:run

# Test for receiver
curl --location --request GET 'localhost:10082/receiver/get'

# Test from caller to receiver

curl --location --request GET 'localhost:10081/caller/get'

# Test for receiver
curl --location --request POST 'localhost:10082/receiver/post'

# Test from caller to receiver

curl --location --request POST 'localhost:10081/caller/post'

# Test for receiver
curl --location --request PUT 'localhost:10082/receiver/put'

# Test from caller to receiver

curl --location --request PUT 'localhost:10081/caller/put'

# Test for receiver
curl --location --request DELETE 'localhost:10082/receiver/delete'

# Test from caller to receiver

curl --location --request DELETE 'localhost:10081/caller/delete'