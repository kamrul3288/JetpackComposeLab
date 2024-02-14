plugins {
    alias(libs.plugins.iamkamrul.android.library)
}

android {
    namespace = "com.iamkamrul.common"
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.gson)
}