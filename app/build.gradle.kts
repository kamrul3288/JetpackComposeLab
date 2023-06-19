import com.iamkamrul.jetpackcomposelab.NiaBuildType

plugins {
    id ("composelab.android.application")
    id ("composelab.application.compose")
    id ("composelab.android.application.flavors")
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
        debug {
            applicationIdSuffix = NiaBuildType.DEBUG.applicationIdSuffix
        }
    }
}

dependencies {
    implementation(project(":common"))
    implementation(project(":material-component"))
    implementation(project(":layout-example"))

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime)
    implementation(libs.androidx.compose.activity)
    implementation (libs.androidx.compose.ui)
    implementation (libs.androidx.compose.ui.graphics)
    implementation (libs.androidx.compose.ui.tooling.preview)
    implementation (libs.androidx.compose.material3)
    implementation(libs.androidx.compose.navigation)
    testImplementation (libs.junit4)
    androidTestImplementation (libs.androidx.junit)
    androidTestImplementation (libs.androidx.espresso.core)
    androidTestImplementation (libs.androidx.compose.ui.test.junit4)
    debugImplementation (libs.androidx.compose.ui.tooling)
    debugImplementation (libs.androidx.compose.ui.test.manifest)
}