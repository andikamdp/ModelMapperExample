echo Current Dir "%CD%"
call mvn sonar:sonar -Dsonar.projectKey=UtilsModelMapper -Dsonar.host.url=http://localhost:9000 -Dsonar.login=eca13c9d76f904428452ca07b7e6a120cc391299
call mvn clean package
xcopy /s /Y "C:\Users\Andika Mulyawan\.jenkins\workspace\UtilsModelMapper" E:\GIT\PUBLISH\UtilsModelMapper
xcopy /s /Y "C:\Users\Andika Mulyawan\.jenkins\workspace\test\UtilsModelMapper" E:\GIT\PUBLISH\UtilsModelMapper

cd /d E:
cd "E:\GIT\PUBLISH\Test"
java -jar -Xms1024m -Xmx1024m Spring_Boot_Training-0.0.1-SNAPSHOT.jar
