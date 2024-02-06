plugins {
    alias(libs.plugins.androidGradlePluginLibrary)
    alias(libs.plugins.kotlin.android)

    // alias(libs.plugins.kotlin.serialization)
    // alias(libs.plugins.kotlin.parcelize)
    // alias(libs.plugins.kotlin.ksp)

    // id("maven-publish")
    // id("signing")
}

android {
    compileSdk = 34
    buildToolsVersion = "34.0.0"

    defaultConfig {
        minSdk = 24
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

    buildFeatures {
        buildConfig = false
        // viewBinding = true
        // compose = true
    }
}

dependencies {
    implementation(libs.androidx.core)
    implementation(libs.androidx.annotation)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.fragment)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.lifecycle.runtime)

    // implementation(libs.androidx.room)
    // ksp(libs.androidx.room.compiler)
    // implementation(libs.bundles.compose)

    // implementation(libs.google.material)

    implementation(libs.okhttp3)

//    implementation(libs.kotlinx.coroutines)
//    implementation(libs.kotlinx.serialization)

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


            pom {
                name
                url

                licenses {
                    license {
                        name
                        url
                    }
                }
                developers {
                    developer {
                        id
                        name
                        timezone
                    }
                }
                scm {
                    connection
                    developerConnection
                    url
                }
            }
        }
    }
}
 */

/*
val secretPropsFile = rootProject.file("secrets.properties")
var secrets = Properties()
if (secretPropsFile.exists()) {
    secretPropsFile.inputStream().use {
        secrets.load(it)
    }
}
if (secretPropsFile.exists()) {
    signing {
        sign(publishing.publications)
        val key = File(secrets["signing_file"] as String).readText()
        useInMemoryPgpKeys(
            secrets["signing_key"] as String,
            key,
            secrets["signing_password"] as String
        )
    }
}
 */