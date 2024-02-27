rootProject.name = "okdownload-root"

include(
    ":okdownload",
    ":process",
    ":okhttp",
    ":sqlite",
    ":kotlin",
    ":benchmark",
    ":filedownloader",
    ":sample"
)

project(":process").projectDir = File(settingsDir,"okdownload-process")
project(":okhttp").projectDir = File(settingsDir, "okdownload-connection-okhttp")
project(":sqlite").projectDir = File(settingsDir, "okdownload-breakpoint-sqlite")
project(":kotlin").projectDir = File(settingsDir, "okdownload-kotlin-enhance")
project(":filedownloader").projectDir = File(settingsDir, "okdownload-filedownloader")

//pluginManagement {
//    repositories {
//        maven(url = "https://maven.aliyun.com/repository/public")
//        google()
//        mavenCentral()
//    }
//}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven(url = "https://maven.aliyun.com/repository/public")
        google()
        mavenCentral()
    }
}