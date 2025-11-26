rootProject.name = "TodoExample"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
    }
}

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

include(":composeApp")
include(":core:di")
include(":core:data")
include(":core:domain")
include(":core:presentation")
include(":feature:list:domain")
include(":feature:list:presentation")
include(":feature:list:di")
include(":feature:details:di")
include(":feature:details:domain")
include(":feature:details:presentation")
