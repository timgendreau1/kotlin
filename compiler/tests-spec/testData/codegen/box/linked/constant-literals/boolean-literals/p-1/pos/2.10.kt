/*
 * KOTLIN CODEGEN BOX SPEC TEST (POSITIVE)
 *
 * SPEC VERSION: 0.1-draft
 * PLACES: constant-literals, boolean-literals -> paragraph 1 -> sentence 2
 * NUMBER: 10
 * DESCRIPTION: The use of Boolean literals as the identifier (with backtick) in the companionObject.
 * NOTE: this test data is generated by FeatureInteractionTestDataGenerator. DO NOT MODIFY CODE MANUALLY!
 * HELPERS: reflect
 */

package org.jetbrains.`true`

open class A {
    companion object `false` {

    }
}

class B {
    companion object `true`: A() {

    }
}

fun box(): String? {
    if (!checkCompanionObjectName(A::class, "org.jetbrains.true.A.false")) return null
    if (!checkCompanionObjectName(B::class, "org.jetbrains.true.B.true")) return null

    return "OK"
}
