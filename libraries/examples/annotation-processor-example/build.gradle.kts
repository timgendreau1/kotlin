description = "Simple Annotation Processor for testing kapt"

plugins {
    kotlin("jvm")
    maven // only used for installing to mavenLocal()
}

dependencies {
    compile(kotlinStdlib())
}

sourceSets {
    "test" {}
}

