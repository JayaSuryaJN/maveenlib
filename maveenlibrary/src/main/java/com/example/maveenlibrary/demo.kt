package com.example.maveenlibrary

import android.content.Context
import android.widget.Toast

class demo {
    fun showToast(context: Context, message: String, duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(context, message, duration).show()
    }
}