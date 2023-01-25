###** Docker Basic Commands **

###** 1) To view the all docker containers **

```
docker ps
```

###** 2) To view the only running docker containers **

```
docker ps -a
```

###** 3) To view the docker images created **

```
docker images
```

###** 4) To login in to the Docker  **
```
docker login
```

###** 5) To logout from the Docker ** 

```
docker logout
```

###** 6) To Run the Docker **

```
docker run -p <REPOSITORY>:<IMAGE> 
```

###** 7) To push container in to Docker use **

```
docker push  <REPOSITORY>:<TAG>
```

###** 8) To run container in to Docker use **

```
docker run <REPOSITORY>:<TAG>
```

###** 9) To pull conatiner from the docker use **

```
docker pull <Repo>:<tag>
```

###** 10) docker exec tells Docker that we want to execute a command into a running container **

```
docker exec -ti <container-id> /bin/sh
```

###** 11) To remove the container **

```
docker rm <containerid>
```

###** 12) To remove the image **

```
docker rmi <IMAGE ID>
```

