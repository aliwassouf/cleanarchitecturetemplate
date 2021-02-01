plugins {
    base
    kotlin("jvm") version "1.4.21" apply false
}

allprojects {

    group = "com.jimdo"

    version = "1.0.0-SNAPSHOT"

    repositories {
        jcenter()
    }
}

dependencies {
    // Make the root project archives configuration depend on every subproject
    subprojects.forEach {
        archives(it)
    }
}