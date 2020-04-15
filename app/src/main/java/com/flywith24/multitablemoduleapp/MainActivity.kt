package com.flywith24.multitablemoduleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.flywith24.feature1.Feature1Activity
import com.flywith24.feature2.Feature2Activity

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    fun click(view: View) {
        startActivity(Intent(this, Feature1Activity::class.java))
    }
}
