plugins {
    alias(libs.plugins.iamkamrul.android.library)
}

android {
    namespace = "com.iamkamrul.di"

}

dependencies {
    implementation(libs.androidx.core.ktx)

    testImplementation(libs.test.junit)
    androidTestImplementation(libs.test.extjunit)
    androidTestImplementation(libs.test.espresso)
}