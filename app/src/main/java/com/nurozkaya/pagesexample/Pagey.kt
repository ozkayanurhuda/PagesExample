package com.nurozkaya.pagesexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Pagey : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagey)
    }

    override fun onBackPressed() {
        val exitIntent= Intent(Intent.ACTION_MAIN)
        exitIntent.addCategory(Intent.CATEGORY_HOME)
        exitIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(exitIntent)
    }
}
