Run mysql docker container

To Start
docker run -d -e MYSQL_ROOT_PASSWORD=administrator -e MYSQL_DATABASE=tododb -e MYSQL_USERNAME=root -p 3306:3306 mysql

To Stop
doker container stop <container-id>

.
