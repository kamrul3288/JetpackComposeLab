plugins {
    alias(libs.plugins.iamkamrul.android.feature.compose)
}

android {
    namespace = "com.iamkamrul.sc"
}

dependencies {
    implementation(projects.core.data)
}