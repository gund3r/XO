run:
	java -jar ./target/XO-1.0-SNAPSHOT-jar-with-dependencies.jar

build: clear update
	mvn verify

clear:
	mvn clean

update:
	mvn versions:update-properties versions:display-plugin-updates

.DEFAULT_GOAL := build-run
build-run: build run
