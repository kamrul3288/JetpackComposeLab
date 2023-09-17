plugins {
    id("iamkamrul.android.compose.library")
}

android {
    namespace = "com.iamkamrul.ui"
}

dependencies {
    implementation(project(":core:designsystem"))
}