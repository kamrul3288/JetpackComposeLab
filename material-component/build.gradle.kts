plugins {
    id("iamkamrul.android.compose.library")
    id("iamkamrul.android.library")
}

android {
    namespace = "com.iamkamrul.material"
}

dependencies{
    implementation(project(":common"))
    implementation(libs.androidx.compose.navigation)
    implementation(libs.image.coil)
    implementation(libs.androidx.compose.materialicon)
}