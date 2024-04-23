plugins {
    alias(libs.plugins.okdownload.library)
    alias(libs.plugins.dokka)
}

android {
    namespace = "com.liulishuo.okdownload.kotlin"
}

dependencies {
    testImplementation(project(":okdownload"))

    implementation(libs.kotlin.stdlib)
    implementation(libs.kotlinx.coroutines)
    compileOnly(project(":okdownload"))
}

tasks.dokkaHtml.configure {
    outputDirectory.set(buildDir.resolve("docs/javadoc"))
}