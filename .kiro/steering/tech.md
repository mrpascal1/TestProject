# Tech Stack

## Build System
- **Gradle** with Kotlin DSL (`.gradle.kts`)
- **Android Gradle Plugin (AGP)**: 9.0.1

## Language & JVM
- **Kotlin**: 1.9.24+ (via AGP)
- **Java Compatibility**: JVM 11

## Android SDK
- **Compile SDK**: 36 (with minorApiLevel 1)
- **Target SDK**: 36
- **Min SDK**: 29 (Android 10)

## Core Libraries
| Library | Version | Purpose |
|---------|---------|---------|
| androidx.core.ktx | 1.18.0 | Kotlin extensions for AndroidX |
| androidx.appcompat | 1.7.1 | App compatibility utilities |
| material | 1.13.0 | Material Design components |
| androidx.activity | 1.13.0 | Activity and Fragment utilities |
| androidx.constraintlayout | 2.2.1 | Constraint-based layout |

## Testing
| Library | Version | Purpose |
|---------|---------|---------|
| junit | 4.13.2 | Unit testing |
| androidx.junit | 1.3.0 | Instrumented tests |
| espresso.core | 3.7.0 | UI testing |

## Build Features
- **ViewBinding**: Enabled
- **ProGuard**: Enabled for release (minify disabled by default)

## Common Commands

```bash
# Build the app
./gradlew build

# Run unit tests
./gradlew test

# Run instrumented tests
./gradlew connectedAndroidTest

# Install on connected device/emulator
./gradlew installDebug

# Build release APK
./gradlew assembleRelease

# Clean build
./gradlew clean
```