plugins {
    alias(libs.plugins.okdownload.library)
}

android {
    namespace = "com.liulishuo.okdownload.sqlite"
}

dependencies {
    testImplementation(libs.robolectric)
    testImplementation(project(":okdownload"))
    implementation(libs.annotation)
    compileOnly(project(":okdownload"))
}