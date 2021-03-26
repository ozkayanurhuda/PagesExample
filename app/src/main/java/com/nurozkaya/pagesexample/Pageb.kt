package com.nurozkaya.pagesexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pageb.*

class Pageb : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pageb)
        goToPageYFromBButton.setOnClickListener {
            val intent=Intent(this@Pageb,Pagey::class.java)
            startActivity(intent)
        }
    }
}