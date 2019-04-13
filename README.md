# Sound monitoring POC - Edgent Library

This is an Android-friendly library to send data coming from sensors to a remote instance of IBM Watson.
This library is based on the [Car Monitoring POC Edgent library](https://github.com/car-monitoring-sapienza-iot-2019/car_monitoring_poc_edgent).

## Getting started

### Prerequisites
This application is written with JDK8 in mind. If you don't have a Java Development Kit installed you can download it from [Oracle](http://www.oracle.com/technetwork/java/javase/downloads/index.html).

### Compile from sources
- `git clone` or download this repo.
- Open a terminal in the directory where the sources are stored.
- Execute `mvn install -DskipTests` . You will find the .jar file in the target folder.

### Add to your project

This library can be easily added to your existing project through Maven or Gradle.

**Maven**

1) Add the JitPack repository
```
<repositories>
	<repository>
	    <id>jitpack.io</id>
	    <url>https://jitpack.io</url>
	</repository>
</repositories>
```
2) Add the dependency
```
<dependency>
    <groupId>com.github.momo1901</groupId>
    <artifactId>sound-meter-poc-edgent</artifactId>
    <version>-SNAPSHOT</version>
</dependency>
```

**Gradle**

1) Add it in your root build.gradle at the end of repositories:
```
allprojects {
    repositories {
		maven { url 'https://jitpack.io' }
	}
}
```
2) Add the dependency
```
dependencies {
    implementation 'com.github.momo1901:sound-meter-poc-edgent:-SNAPSHOT'
}
```

## Example
```
DataBuilder builder = new DataBuilder();
// Sensor is an object that implements the correct like ReadIntSensor or ReadFloatSensor
builder.setMinSensor(sensor);
builder.setMaxSensor(sensor);
builder.setAvgSensor(sensor);
builder.setDbSensor(sensor);
builder.setRealtimeSensor(sensor);
Properties prop = new Properties();
prop.setProperty("org", "your org");
prop.setProperty("type", "your type");
prop.setProperty("id", "your id");
prop.setProperty("auth-method", "your auth-method");
prop.setProperty("auth-token", "your token");
EdgentApp.init(prop, builder); //Data are now being sent in a background thread
```


 ## Dependencies
 - [Apache Edgent](http://edgent.apache.org/)
 - [Json simple](https://code.google.com/archive/p/json-simple/)
 - [JUnit](https://github.com/junit-team/junit4)