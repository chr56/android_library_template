plugins {
    id("com.android.library")
    id("kotlin-android")
    // id("maven-publish")

    //id("org.jetbrains.kotlin.plugin.serialization")
}

android {
    compileSdk = 33

    defaultConfig {
        minSdk = 24
        targetSdk = 33
        namespace = "lib.template"

        consumerProguardFiles("consumer-rules.pro")

        aarMetadata {
            minCompileSdk = 24
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    publishing {
        publishing {
            singleVariant("release") {
                withSourcesJar()
            }
        }
    }
}

dependencies {

    //implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.5.0")

}

/*
val libVersion = ""
publishing {
    publications {
        create<MavenPublication>("release") {
            afterEvaluate {
                from(components["release"])
            }
            groupId = ""
            artifactId = ""
            version = libVersion
        }
    }
}
 */
