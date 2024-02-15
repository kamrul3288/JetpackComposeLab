
@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.iamkamrul.android.application)
    //alias(libs.plugins.iamkamrul.android.hilt)
    alias(libs.plugins.iamkamrul.android.application.compose)
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
            isDebuggable = true
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
    implementation(projects.layoutExample)
    implementation(projects.materialComponent)
    implementation(projects.navigationExample)
    implementation(projects.serviceComponent)

    implementation(projects.core.common)
    implementation(projects.core.ui)
    implementation(projects.core.designsystem)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.compose.activity)
    implementation(libs.androidx.compose.constraintlayout)
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.material3)
    implementation(libs.androidx.compose.material.iconsExtended)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.compose.navigation.core)
    implementation(libs.androidx.compose.navigation.hilt)

    debugImplementation(libs.androidx.compose.ui.tooling)
    debugImplementation(libs.androidx.compose.ui.manifest)

    testImplementation(libs.test.junit)
    androidTestImplementation(libs.test.extjunit)
    androidTestImplementation(libs.test.junit.compose.ui)
    androidTestImplementation(libs.test.espresso)
}