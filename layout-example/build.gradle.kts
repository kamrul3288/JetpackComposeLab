plugins {
    alias(libs.plugins.iamkamrul.android.feature.compose)
}

android {
    namespace = "com.iamkamrul.layout"
}

dependencies{
    implementation(libs.image.coil.compose)
    implementation(libs.accompanist.pagerindicator)
}