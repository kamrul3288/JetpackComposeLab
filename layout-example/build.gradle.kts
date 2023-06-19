plugins {
    id("composelab.android.library.compose")
    id("composelab.android.library")
}

android {
    namespace = "com.iamkamrul.layout"
}

dependencies{
    implementation(project(":common"))
    implementation(libs.androidx.compose.navigation)
}