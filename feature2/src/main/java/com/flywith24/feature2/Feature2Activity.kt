package com.flywith24.feature2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.gaelmarhic.quadrant.QuadrantConstants

class Feature2Activity : AppCompatActivity(R.layout.activity_feature2) {
    fun click(view: View) {
        startActivity(Intent().setClassName(this, QuadrantConstants.MAIN_ACTIVITY))
    }
}
