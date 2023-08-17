plugins {
    id("composelab.android.library.compose")
    id("composelab.android.library")
}

android {
    namespace = "com.iamkamrul.navigation"
}

dependencies{
    implementation(project(":common"))
    implementation(libs.androidx.compose.navigation)
    implementation(libs.androidx.compose.materialicon)
}