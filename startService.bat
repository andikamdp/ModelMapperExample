echo Current Dir "%CD%"
xcopy /s /Y "C:\Users\Andika Mulyawan\.jenkins\workspace\UtilsModelMapper" E:\GIT\PUBLISH\UtilsModelMapper

cd /d E:
cd "E:\GIT\PUBLISH\UtilsModelMapper"
call mvn clean package test sonar:sonar -Dsonar.projectKey=UtilsModelMapper -Dsonar.host.url=http://localhost:9000 -Dsonar.login=eca13c9d76f904428452ca07b7e6a120cc391299
java -jar -Xms1024m -Xmx1024m Model_Mapper-0.0.1-SNAPSHOT.jar
