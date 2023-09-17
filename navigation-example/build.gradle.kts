plugins {
    id("iamkamrul.android.compose.library")
    id("iamkamrul.android.library")
}

android {
    namespace = "com.iamkamrul.navigation"
}

dependencies{
    implementation(project(":common"))
    implementation(libs.androidx.compose.navigation)
    implementation(libs.androidx.compose.materialicon)
}