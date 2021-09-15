echo Current Dir "%CD%"
xcopy /s /Y "C:\Users\Andika Mulyawan\.jenkins\workspace\UtilsModelMapper" E:\GIT\PUBLISH\UtilsModelMapper
cd /d E:
cd "E:\GIT\PUBLISH\UtilsModelMapper"
java -jar -Xms1024m -Xmx1024m Model_Mapper-0.0.1-SNAPSHOT.jar
