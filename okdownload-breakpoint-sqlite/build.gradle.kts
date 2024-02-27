plugins {
    id("okdownload.android.library")
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