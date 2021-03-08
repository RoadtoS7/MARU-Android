object KotlinDependencies {
    val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin_version}"
}

object AndroidXDependencies {
    val coreKtx = "androidx.core:core-ktx:${Versions.core_ktx_version}"
    val appCompat = "androidx.appcompat:appcompat:${Versions.appcompat_version}"
    val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraint_layout_version}"
}

object TestDependencies {
    val jUnit = "junit:junit:${Versions.junit_version}"
    val androidTest = "androidx.test.ext:junit:${Versions.androidtest_version}"
    val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso_version}"
}

object MaterialDesignDependencies {
    val materialDesign = "com.google.android.material:material:${Versions.material_design_version}"
}