// WITH_RUNTIME
// PROBLEM: none

fun foo() {
    val foo: String? = null
    foo?.let {
        it.to("").to("").to(it)<caret>
    }
}