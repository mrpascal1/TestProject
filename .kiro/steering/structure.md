# Project Structure

```
TestProject/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/shahid/raza/testproject/    # Kotlin source code
│   │   │   │   ├── MainActivity.kt               # Main entry point
│   │   │   │   └── BusinessCardActivity.kt       # Secondary activity
│   │   │   ├── res/                              # Resources
│   │   │   │   ├── layout/                       # XML layouts
│   │   │   │   ├── drawable/                     # Images and drawables
│   │   │   │   ├── values/                       # Strings, colors, themes
│   │   │   │   ├── values-night/                 # Dark theme resources
│   │   │   │   ├── mipmap-*/                     # App launcher icons
│   │   │   │   └── xml/                          # XML configs
│   │   │   └── AndroidManifest.xml               # App manifest
│   │   ├── androidTest/                          # Instrumented tests
│   │   └── test/                                 # Unit tests (if added)
│   ├── build.gradle.kts                          # App-level build config
│   └── proguard-rules.pro                        # ProGuard rules
├── gradle/
│   └── wrapper/                                  # Gradle wrapper
├── .kiro/                                        # Kiro config (this folder)
│   └── steering/                                 # Steering documents
├── build.gradle.kts                              # Project-level build config
├── settings.gradle.kts                           # Project settings
├── gradle.properties                             # Gradle properties
├── gradlew                                       # Gradle wrapper script
└── local.properties                              # Local environment (gitignored)
```

## Package Structure
- **Main package**: `shahid.raza.testproject`
- **Test package**: `shahid.raza.testproject` (androidTest)

## Naming Conventions
- **Activities**: PascalCase + "Activity" suffix (e.g., `MainActivity`, `BusinessCardActivity`)
- **Layout files**: `activity_` prefix + snake_case (e.g., `activity_main.xml`)
- **IDs**: `btn` for buttons, `tv` for text views, `iv` for image views (lowercase)
- **Kotlin files**: Same name as class (e.g., `MainActivity.kt`)