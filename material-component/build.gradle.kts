plugins {
    alias(libs.plugins.iamkamrul.android.feature.compose)
}
android {
    namespace = "com.iamkamrul.material"
}

dependencies{
    implementation(libs.image.coil.compose)
}