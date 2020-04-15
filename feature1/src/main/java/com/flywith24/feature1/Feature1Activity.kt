package com.flywith24.feature1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.gaelmarhic.quadrant.QuadrantConstants

class Feature1Activity : AppCompatActivity(R.layout.activity_feature1) {

    fun click(view: View) {
        startActivity(Intent().apply {
            setClassName(this@Feature1Activity, QuadrantConstants.FEATURE2_ACTIVITY)
                .putExtra("key", "value")
        })
    }
}
