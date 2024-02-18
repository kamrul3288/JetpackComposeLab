plugins {
    alias(libs.plugins.iamkamrul.android.library)
    alias(libs.plugins.iamkamrul.android.hilt)
}

android {
    namespace = "com.iamkamrul.data"

}

dependencies {
    implementation(projects.core.datastore)

    implementation(libs.androidx.core.ktx)
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.androidx.datastore.preferences)

    testImplementation(libs.test.junit)
    androidTestImplementation(libs.test.extjunit)
    androidTestImplementation(libs.test.espresso)
}