package com.julamme.shopped

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       main_add_new.setOnClickListener {v ->
           addNewItem()
       }
    }

    fun addNewItem() {
        ListCacheManager.cache.addToCache("todo", listOf("object one", "object 2")) //TODO
    }
}
