plugins {
    id("composelab.android.library.compose")
    id("composelab.android.library")
}

android {
    namespace = "com.iamkamrul.material"
}

dependencies{
    implementation(project(":common"))
    implementation(libs.androidx.compose.navigation)
}