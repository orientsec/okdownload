plugins {
    alias(libs.plugins.okdownload.library)
}

android {
    namespace = "com.liulishuo.okdownload"
}

dependencies {
    implementation(libs.annotation)
    compileOnly(libs.annotations)
}