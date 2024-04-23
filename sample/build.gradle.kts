plugins {
    alias(libs.plugins.okdownload.app)
}
android {
    defaultConfig {
        applicationId = "com.liulishuo.okdownload.sample"

        versionCode = 1
        versionName = "1.0"
    }

    signingConfigs {
        create("release") {
            storeFile = rootProject.file("keystore")
            storePassword = "okdownload"
            keyAlias = "okdownload"
            keyPassword = "okdownload"
        }
    }

    buildTypes {
        getByName("release") {
            signingConfig = signingConfigs.getByName("release")
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
    namespace = "com.liulishuo.okdownload.sample"
}

dependencies {
    implementation(libs.kotlin.stdlib)
    //noinspection GradleDependency source code is not available on 26
    implementation(libs.material)
    //noinspection GradleDependency source code is not available on 26
    implementation(libs.appcompat)
    // Appcompat-v7 (only Anko Commons)
    implementation(libs.anko.sdk25)
    implementation(libs.anko.appcompat.v7.commons)
    // Appcompat-v7 (Anko Layouts)
    implementation(libs.anko.appcompat.v7)
    implementation(libs.anko.sdk25.coroutines)
    implementation(libs.anko.coroutines)
    // CardView-v7
    implementation(libs.anko.cardview.v7)
    //noinspection GradleDependency
    // Design
    implementation(libs.anko.design)
    implementation(libs.anko.design.coroutines)
    // RecyclerView-v7
    implementation(libs.anko.recyclerview.v7)
    implementation(libs.anko.recyclerview.v7.coroutines)
    implementation(libs.kotlinx.coroutines)
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.constraintlayout)
    implementation(project(":okdownload"))
    implementation(project(":sqlite"))
    implementation(project(":okhttp"))
    implementation(project(":filedownloader"))
    implementation(project(":kotlin"))

    compileOnly(libs.annotations)
}
