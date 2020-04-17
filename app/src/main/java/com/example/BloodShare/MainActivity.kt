package com.example.BloodShare

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private lateinit var register: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        register = findViewById(R.id.textregister)
        register.setOnClickListener {
            startActivity(Intent(this, Register::class.java))
        }
    }
}
/*
Tanggal pengerjaan 16 april 2020
Deskripsi pengerjaan: Membuat layout main, register, almost, verify dan home
Tanggal pengerjaan 17 april 2020
Deskripsi pengerjaan: Membuat class main, register, almost, verify dan home
Nim : 10117127
Nama : Bayu Satya Pratama
Kelas : IF4
 */

