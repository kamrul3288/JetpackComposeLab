import com.google.protobuf.gradle.GenerateProtoTask

plugins {
    alias(libs.plugins.iamkamrul.android.library)
    alias(libs.plugins.iamkamrul.android.hilt)
    alias(libs.plugins.protobuf)
}

android {
    namespace = "com.iamkamrul.datastore"
}

protobuf {
    protoc {
        artifact = libs.protobuf.protoc.get().toString()
    }
    generateProtoTasks {
        all().forEach { task ->
            task.builtins {
                register("java") {
                    option("lite")
                }
                register("kotlin") {
                    option("lite")
                }
            }
        }
    }
}


androidComponents {
    onVariants(selector().all()) { variant ->
        afterEvaluate {
            val protoTask = project.tasks.getByName("generate" + variant.name.replaceFirstChar { it.uppercaseChar() } + "Proto") as GenerateProtoTask
            project.tasks.getByName("ksp" + variant.name.replaceFirstChar { it.uppercaseChar() } + "Kotlin") {
                dependsOn(protoTask)
                (this as org.jetbrains.kotlin.gradle.tasks.AbstractKotlinCompileTool<*>).setSource(
                    protoTask.outputBaseDir
                )
            }
        }
    }
}


dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.datastore.preferences)
    implementation(libs.androidx.datastore.proto)
    implementation(libs.protobuf.kotlinlite)
    implementation(libs.kotlinx.coroutines.android)

    testImplementation(libs.test.junit)
    androidTestImplementation(libs.test.extjunit)
    androidTestImplementation(libs.test.espresso)
}