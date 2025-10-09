// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.2.1" apply false // versão estável compatível
    id("com.android.library") version "8.2.1" apply false // se houver módulos de library
    id("org.jetbrains.kotlin.android") version "1.9.25" apply false
    id("org.jetbrains.kotlin.kapt") version "1.9.25" apply false
}

tasks.register<Delete>("clean") {
    delete(layout.buildDirectory)
}