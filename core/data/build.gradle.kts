plugins {
    alias(libs.plugins.iamkamrul.android.library)
}

android {
    namespace = "com.iamkamrul.data"

}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.kotlinx.coroutines.android)

    testImplementation(libs.test.junit)
    androidTestImplementation(libs.test.extjunit)
    androidTestImplementation(libs.test.espresso)
}