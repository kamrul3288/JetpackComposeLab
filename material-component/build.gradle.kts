plugins {
    id("iamkamrul.android.compose.library")
}

android {
    namespace = "com.iamkamrul.material"
}

dependencies{
    implementation(project(":core:common"))
    implementation(libs.androidx.compose.navigation)
    implementation(libs.image.coil)
    implementation(libs.androidx.compose.materialicon)
}