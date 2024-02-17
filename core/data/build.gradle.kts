plugins {
    alias(libs.plugins.iamkamrul.android.library)
    alias(libs.plugins.iamkamrul.android.hilt)
}

android {
    namespace = "com.iamkamrul.data"

}

dependencies {
    api(projects.core.datastore)

    implementation(libs.androidx.core.ktx)
    implementation(libs.kotlinx.coroutines.android)

    testImplementation(libs.test.junit)
    androidTestImplementation(libs.test.extjunit)
    androidTestImplementation(libs.test.espresso)
}