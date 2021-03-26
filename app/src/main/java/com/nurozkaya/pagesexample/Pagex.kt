package com.nurozkaya.pagesexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pagex.*

class Pagex : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagex)
        goToPageYButton.setOnClickListener {
            val intent= Intent(this@Pagex, Pagey::class.java)
            startActivity(intent)
        }


    }
}