
plugins {
    id ("iamkamrul.android.application")
    id ("iamkamrul.android.compose.application")
}

android {
    namespace = "com.iamkamrul.jetpackcomposelab"
    defaultConfig {
        applicationId = "com.iamkamrul.jetpackcomposelab"
        versionCode = 1
        versionName = "1.0.0"
        testInstrumentationRunner  = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary  = true
        }
    }

    buildTypes{
        getByName("debug") {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        getByName("release") {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

dependencies {
    implementation(project(":core:common"))
    implementation(project(":core:designsystem"))
    implementation(project(":core:ui"))
    implementation(project(":material-component"))
    implementation(project(":layout-example"))
    implementation(project(":navigation-example"))

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime)
    implementation(libs.androidx.compose.activity)
    implementation (libs.androidx.compose.ui)
    implementation (libs.androidx.compose.ui.graphics)
    implementation (libs.androidx.compose.ui.tooling.preview)
    implementation (libs.androidx.compose.material3)
    implementation(libs.androidx.compose.navigation)


    testImplementation (libs.test.junit4)
    androidTestImplementation (libs.test.androidx.junit)
    androidTestImplementation (libs.test.androidx.espresso)
    androidTestImplementation (libs.test.androidx.compose.ui.junit)
    androidTestImplementation (libs.test.androidx.compose.ui.manifest)
    debugImplementation (libs.test.androidx.compose.ui.tooling)
}