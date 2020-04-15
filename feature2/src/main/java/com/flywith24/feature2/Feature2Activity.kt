package com.flywith24.feature2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.gaelmarhic.quadrant.QuadrantConstants
import kotlinx.android.synthetic.main.activity_feature2.*

class Feature2Activity : AppCompatActivity(R.layout.activity_feature2) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val result = intent.getStringExtra("key")
        button.text = result
    }

    fun click(view: View) {
        startActivity(Intent().setClassName(this, QuadrantConstants.MAIN_ACTIVITY))
    }
}
