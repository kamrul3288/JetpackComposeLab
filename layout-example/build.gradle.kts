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
    implementation(libs.androidx.compose.foundation)
    implementation(libs.androidx.compose.ui.util)
    implementation(libs.accompanist.pager.indicators)
}