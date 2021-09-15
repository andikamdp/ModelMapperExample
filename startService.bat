echo Current Dir "%CD%"
TIMEOUT /T 10
 mvn clean package
TIMEOUT /T 10
mvn test
TIMEOUT /T 10
mvn sonar:sonar -Dsonar.projectKey=UtilsModelMapper -Dsonar.host.url=http://localhost:9000 -Dsonar.login=eca13c9d76f904428452ca07b7e6a120cc391299
TIMEOUT /T 10
xcopy /s /Y "C:\Users\Andika Mulyawan\.jenkins\workspace\UtilsModelMapper" E:\GIT\PUBLISH\UtilsModelMapper
TIMEOUT /T 10
cd /d E:
TIMEOUT /T 10
cd "E:\GIT\PUBLISH\UtilsModelMapper"
TIMEOUT /T 10

java -jar -Xms1024m -Xmx1024m Model_Mapper-0.0.1-SNAPSHOT.jar
