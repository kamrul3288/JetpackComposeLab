

import com.android.build.api.variant.LibraryAndroidComponentsExtension
import com.android.build.gradle.LibraryExtension
import com.iamkamrul.jetpackcomposelab.configureFlavors
import com.iamkamrul.jetpackcomposelab.configureGradleManagedDevices
import com.iamkamrul.jetpackcomposelab.configureKotlinAndroid
import com.iamkamrul.jetpackcomposelab.configurePrintApksTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType

class AndroidLibraryConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.library")
                apply("org.jetbrains.kotlin.android")
            }

            extensions.configure<LibraryExtension> {
                configureKotlinAndroid(this)
                defaultConfig.targetSdk = 33
                configureFlavors(this)
                configureGradleManagedDevices(this)
            }
            extensions.configure<LibraryAndroidComponentsExtension> {
                configurePrintApksTask(this)
            }
            val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")
            configurations.configureEach {
                resolutionStrategy {
                    force(libs.findLibrary("junit4").get())
                    // Temporary workaround for https://issuetracker.google.com/174733673
                    force("org.objenesis:objenesis:2.6")
                }
            }
            dependencies {
                add("implementation",libs.findLibrary("androidx-core-ktx").get())
                add("implementation",libs.findLibrary("androidx-lifecycle-runtime").get())
                add("implementation",libs.findLibrary("androidx-compose-activity").get())
                add("implementation",libs.findLibrary("androidx-compose-ui").get())
                add("implementation",libs.findLibrary("androidx-compose-ui-graphics").get())
                add("implementation",libs.findLibrary("androidx-compose-ui-tooling-preview").get())
                add("implementation",libs.findLibrary("androidx-compose-material3").get())
                add("implementation",libs.findLibrary("gson").get())

                add("testImplementation",libs.findLibrary("junit4").get())
                add("androidTestImplementation",libs.findLibrary("androidx-junit").get())
                add("androidTestImplementation",libs.findLibrary("androidx-espresso-core").get())
                add("androidTestImplementation",libs.findLibrary("androidx-compose-ui-test-junit4").get())
                add("debugImplementation",libs.findLibrary("androidx-compose-ui-tooling").get())
                add("debugImplementation",libs.findLibrary("androidx-compose-ui-test-manifest").get())


            }
        }
    }
}