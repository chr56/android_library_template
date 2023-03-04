plugins {
    val apgVersion = "7.4.1"
    val kotlinVersion = "1.8.10"

    id("com.android.library") version apgVersion apply false
    id("org.jetbrains.kotlin.android") version kotlinVersion apply false

    //id("org.jetbrains.kotlin.plugin.serialization") version kotlinVersion apply false
}