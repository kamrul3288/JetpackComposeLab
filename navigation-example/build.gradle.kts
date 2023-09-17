plugins {
    id("iamkamrul.android.compose.library")
}

android {
    namespace = "com.iamkamrul.navigation"
}

dependencies{
    implementation(project(":common"))
    implementation(libs.androidx.compose.navigation)
    implementation(libs.androidx.compose.materialicon)
}