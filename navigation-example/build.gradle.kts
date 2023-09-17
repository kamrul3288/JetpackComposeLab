plugins {
    id("iamkamrul.android.compose.library")
}

android {
    namespace = "com.iamkamrul.navigation"
}

dependencies{
    implementation(project(":core:common"))
    implementation(project(":core:ui"))
    implementation(project(":core:designsystem"))
    implementation(libs.androidx.compose.navigation)
}