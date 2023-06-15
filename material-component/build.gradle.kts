plugins {
    id("composelab.android.library.compose")
    id("composelab.android.library")
}

android {
    namespace = "com.iamkamrul.common"
}

dependencies{
    implementation(libs.androidx.compose.navigation)
}