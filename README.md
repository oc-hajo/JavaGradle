# Java Maven Example Project

Prerequisites:
- Java installation (`java --version`)
- Gradle must not be installed (gradle wrapper scripts only require java installation)
    - gradle wrappers are `gradlew` (unix) and `gradlew.bat` (windows)
    - used gradle version can be determined from `gradle-wrapper-properties`


# Usage

## Build and run

```bash
# without dependencies
./gradlew jar
# with dependencies
./gradlew fatJar

java -cp app/build/libs/app.jar org.example.App
```

or

```bash
./gradlew run
```

## Adding dependencies

1. Search in maven repositories: https://mvnrepository.com/
2. Add dependency to `build.gradle`:
```
dependencies {
    // Use JUnit test framework.
    testImplementation libs.junit

    // This dependency is used by the application.
    implementation libs.guava

    // https://mvnrepository.com/artifact/org.json/json
    implementation group: 'org.json', name: 'json', version: '20240303'
}
```
3. Build and run the project