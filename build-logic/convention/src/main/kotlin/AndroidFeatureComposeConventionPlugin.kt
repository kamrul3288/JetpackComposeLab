import com.android.build.gradle.LibraryExtension
import com.iamkamrul.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies

class AndroidFeatureComposeConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply {
                apply("iamkamrul.android.library")
                apply("iamkamrul.android.library.compose")
                apply("iamkamrul.android.hilt")
            }
            extensions.configure<LibraryExtension> {
                defaultConfig {
                    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
                }
            }

            dependencies {
                //add("implementation", project(":core:di"))
                //add("implementation", project(":core:domain"))
                add("implementation", project(":core:common"))
                add("implementation", project(":core:designsystem"))
                add("implementation", project(":core:ui"))


                add("implementation", libs.findLibrary("androidx.core.ktx").get())
                add("implementation", libs.findLibrary("androidx.compose.ui").get())
                add("implementation", libs.findLibrary("androidx.compose.ui.graphics").get())
                add("implementation", libs.findLibrary("androidx.compose.material3").get())
                add("implementation", libs.findLibrary("androidx.compose.material.iconsExtended").get())
                add("implementation", libs.findLibrary("androidx.compose.activity").get())
                add("implementation", libs.findLibrary("androidx.compose.constraintlayout").get())

                add("debugImplementation", libs.findLibrary("androidx.compose.ui.tooling").get())
                add("debugImplementation", libs.findLibrary("androidx.compose.ui.manifest").get())

                add("implementation", libs.findLibrary("androidx.compose.navigation.hilt").get())
                add("implementation", libs.findLibrary("androidx.compose.navigation.core").get())
                add("implementation", libs.findLibrary("androidx.compose.lifecycle.runtime").get())
                add("implementation", libs.findLibrary("androidx.compose.lifecycle.viewmodel").get())
                add("implementation", libs.findLibrary("log.timber").get())
                add("implementation", libs.findLibrary("kamrul3288.dateced").get())
                add("implementation", libs.findLibrary("kotlinx.coroutines.android").get())


                add("testImplementation", libs.findLibrary("test.junit").get())
                add("androidTestImplementation", libs.findLibrary("test.extjunit").get())
                add("androidTestImplementation", libs.findLibrary("test.espresso").get())
                add("androidTestImplementation", libs.findLibrary("test.junit.compose.ui").get())

            }
        }
    }
}
