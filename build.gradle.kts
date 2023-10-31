plugins {
    kotlin("multiplatform") version "1.9.10"
    id("org.jetbrains.compose") version "1.5.3"
}

group = "moe.tlaster"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    targetHierarchy.default()
    mingwX64 {
        binaries {
            sharedLib {
                baseName = "libuntitled"
            }
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(compose.runtime)
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}
