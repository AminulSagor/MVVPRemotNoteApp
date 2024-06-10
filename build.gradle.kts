// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
    id("com.google.devtools.ksp") version "1.9.10-1.0.13" apply false
}

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath (libs.gradle)
        classpath (libs.kotlin.gradle.plugin)
        classpath (libs.hilt.android.gradle.plugin)


        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

