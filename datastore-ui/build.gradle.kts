plugins {
    alias(libs.plugins.iamkamrul.android.feature.compose)
}

android {
    namespace = "com.iamkamrul.datastore_ui"

}

dependencies {
    implementation(libs.androidx.datastore.preferences)
}