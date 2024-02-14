
import com.android.build.gradle.LibraryExtension
import com.iamkamrul.configureAndroidCompose
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

class AndroidLibraryComposeConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply("iamkamrul.android.library")

            val extension = extensions.getByType<LibraryExtension>()
            configureAndroidCompose(extension)
        }
    }

//    override fun apply(target: Project) {
//        with(target) {
//            pluginManager.apply {
//                apply("iamkamrul.android.library")
//            }
//            val extension = extensions.getByType<LibraryExtension>()
//            val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")
//            configureAndroidCompose(extension)
//
//            dependencies {
//                add("implementation",libs.findLibrary("androidx-core-ktx").get())
//                add("implementation",libs.findLibrary("androidx-compose-activity").get())
//                add("implementation",libs.findLibrary("androidx-compose-ui").get())
//                add("implementation",libs.findLibrary("androidx-compose-ui-graphics").get())
//                add("implementation",libs.findLibrary("androidx-compose-material3").get())
//                add("implementation",libs.findLibrary("androidx-compose-ui-tooling-preview").get())
//
//                add("testImplementation",libs.findLibrary("test-junit4").get())
//                add("androidTestImplementation",libs.findLibrary("test-androidx-junit").get())
//                add("androidTestImplementation",libs.findLibrary("test-androidx-espresso").get())
//                add("androidTestImplementation",libs.findLibrary("test-androidx-compose-ui-junit").get())
//                add("debugImplementation",libs.findLibrary("test-androidx-compose-ui-tooling").get())
//                add("debugImplementation",libs.findLibrary("test-androidx-compose-ui-manifest").get())
//            }
//        }
//    }

}