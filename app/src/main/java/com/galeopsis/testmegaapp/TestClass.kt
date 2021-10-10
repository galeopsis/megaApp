package com.galeopsis.testmegaapp

class TestClass(var str: String) {
    fun printTest() {
        println(if (str == "test") "good, it is test in test1 str is $str" else "nifiga!!! str is $str")
    }
}