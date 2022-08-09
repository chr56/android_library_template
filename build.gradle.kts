buildscript {
    @Suppress("JcenterRepositoryObsolete")
    repositories {
        mavenCentral()
        google()
        gradlePluginPortal()
        jcenter()
        maven(url = "https://jitpack.io")
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.2.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.21")
    }
}

plugins {
    val apgVersion = "7.2.1"
    val kotlinVersion = "1.6.21"

    id("com.android.library") version apgVersion apply false
    id("org.jetbrains.kotlin.android") version kotlinVersion apply false
}

allprojects {
    @Suppress("JcenterRepositoryObsolete")
    repositories {
        mavenCentral()
        google()
        jcenter()
        maven(url = "https://jitpack.io")
    }
}
