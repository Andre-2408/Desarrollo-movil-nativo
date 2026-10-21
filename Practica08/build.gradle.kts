// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.compose) apply false
    // Agregar esta última línea de código y hacer Sync Now
    id("com.google.devtools.ksp") version "2.2.10-2.0.2" apply false
}
