plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id ("kotlin-kapt")
}

android {
    namespace = "com.mexingsoft.database"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.mexingsoft.database"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
}

dependencies {
    // Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.0")

    // Room Persistence Library
    val roomVersion = "2.4.3"
    implementation("androidx.room:room-runtime:$roomVersion")
    kapt("androidx.room:room-compiler:$roomVersion")
    implementation("androidx.room:room-ktx:$roomVersion")

    // ViewModel and LiveData
    val lifecycleVersion = "2.5.0"
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycleVersion")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycleVersion")

    // Core
    implementation("androidx.core:core-ktx:1.8.0")

    // AppCompat
    val appCompatVersion = "1.6.1"
    implementation("androidx.appcompat:appcompat:$appCompatVersion")

    // Material Design
    val materialVersion = "1.8.0"
    implementation("com.google.android.material:material:$materialVersion")

    // ConstraintLayout
    val constraintLayoutVersion = "2.1.4"
    implementation("androidx.constraintlayout:constraintlayout:$constraintLayoutVersion")

    // Testing
    val junitVersion = "4.13.2"
    testImplementation("junit:junit:$junitVersion")
    val espressoVersion = "3.5.1"
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:$espressoVersion")

    // Navigation
    val navVersion = "2.5.3"
    implementation("androidx.navigation:navigation-fragment-ktx:$navVersion")
    implementation("androidx.navigation:navigation-ui-ktx:$navVersion")

}