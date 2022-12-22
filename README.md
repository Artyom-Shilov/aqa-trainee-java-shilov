
Task 1 launch: mvn compile exec:java -Dexec.mainClass="com.shilov.task1.Runner"

Task 2 launch: mvn compile exec:java -Dexec.mainClass="com.shilov.task2.Runner" -Dexec.args=${name}

Task 3 launch: mvn compile exec:java -Dexec.mainClass="com.shilov.task3.Runner"
 
Note: May appear a problem with displaying of сyrillic text using Windows command line for launches.
Recommended to switch command line encoding to UTF-8(cmd /K chcp 65001) and add 

-Dsun.stdout.encoding=UTF-8 as a launch argument. 
