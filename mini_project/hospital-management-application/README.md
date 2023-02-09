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

