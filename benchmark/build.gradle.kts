plugins {
    id("okdownload.android.app")
}
android {
    namespace = "com.liulishuo.okdownload.benchmark"
    defaultConfig {
        applicationId = "com.liulishuo.okdownload.benchmark"
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        vectorDrawables.useSupportLibrary = true
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
    lint {
        lintConfig = file("lint.xml")
        textOutput = file("stdout")
        textReport = true
    }
}

dependencies {
    implementation(libs.kotlin.stdlib)
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.constraintlayout)
}
