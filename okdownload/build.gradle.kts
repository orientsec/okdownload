plugins {
    id("okdownload.android.library")
}

android {
    namespace = "com.liulishuo.okdownload"
}

dependencies {
    implementation(libs.annotation)
    compileOnly(libs.annotations)
}