#!/usr/bin/env bash 
echo -e "`echo Compiling SampleAkaneChan.java`\c"
javac -classpath ./Akane-chan.jar SampleAkaneChan.java
echo ' --> Done!!'
echo -e "`echo Creating run.sh file`\c"
touch ./run.sh
echo 'java -classpath ./Akane-chan.jar: SampleAkaneChan' > ./run.sh
echo ' --> Done!!'

read -n1 -p 'run.shを実行してもよろしいですか? (y/N): ' yn
case $yn in
	[yY]*)
		echo ''
		bash ./run.sh;;
	*)
		echo 'N';;
esac
