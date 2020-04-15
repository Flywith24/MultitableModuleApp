package com.flywith24.feature1

import android.content.Intent
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.gaelmarhic.quadrant.QuadrantConstants
import org.koin.android.ext.android.get

class Feature1Activity : AppCompatActivity(R.layout.activity_feature1) {

    fun pluginClick(view: View) {
        startActivity(Intent().apply {
            setClassName(this@Feature1Activity, QuadrantConstants.FEATURE2_ACTIVITY)
                .putExtra("key", "value")
        })
    }

    fun koinClick(view: View) {
        startActivity(Intent().apply {
            setClassName(this@Feature1Activity, get())
                .putExtra("key", "value")
        })
    }
}
