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