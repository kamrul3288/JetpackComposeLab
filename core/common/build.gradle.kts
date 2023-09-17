plugins {
    id("iamkamrul.android.compose.library")
}

android {
    namespace = "com.iamkamrul.common"
}

dependencies {
    implementation(libs.gson)
}