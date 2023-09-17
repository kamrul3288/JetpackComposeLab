plugins {
    id("iamkamrul.android.compose.library")
    id("iamkamrul.android.library")
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
    implementation(libs.androidx.compose.constraintlayout)
}