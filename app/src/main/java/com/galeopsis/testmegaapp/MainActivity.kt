package com.galeopsis.testmegaapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (i in 0..10 step 2) {
            println("TEST  [$i]")
        }

        println(" ")

        var n = 0
        while (n < 11) {
            println("TEST_2 [$n]")
            n += 2
        }

        println(" ")

        val x = 25
            println(if (x < 11) "TEST_3 [$x]" else "ddd")
    }
}
