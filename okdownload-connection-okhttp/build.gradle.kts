plugins {
    alias(libs.plugins.okdownload.library)
}

android {
    namespace = "com.liulishuo.okdownload.okhttp"
}

dependencies {
    testImplementation(project(":okdownload"))

    compileOnly(project(":okdownload"))
    implementation(libs.okhttp)
    implementation(libs.annotation)
}