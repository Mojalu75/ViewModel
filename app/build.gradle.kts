plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.mojalu75.viewmodel"
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        applicationId = "com.mojalu75.viewmodel"
        minSdk = 27
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = true
                packageScope = setOf("androidx.**", "kotlin.**", "kotlinx.**")
            }
        }
    }
    buildFeatures{
        viewBinding = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    // ViewModel
    implementation("androidx. lifecycle: lifecycle-viewmodel-ktx:2.3.1")
    //livedata
    implementation("androidx. lifecycle: lifecycle-livedata-ktx:2.3.1")
    // Fragment
    implementation("androidx. fragment:fragment-ktx:1.3.2")
    // Activity
    implementation("androidx.activity:activity-ktx:1.2.2")
    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.core.ktx)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)
}