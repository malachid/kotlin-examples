package org.example.kotlin.mixed

import android.content.Intent
import android.os.Bundle
import android.app.Activity
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.widget.Button
import org.example.kotlin.mixed.databinding.ActivityMain2Binding

open class KotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMain2Binding>(this, R.layout.activity_main2)

        // NOTE: Kotlin executes the next line correctly, but Android Studio shows it as an error
        binding.setDatabound(String.format("%s is databound", javaClass.simpleName))
        binding.executePendingBindings()

        var next = findViewById(R.id.Button02) as Button
        next.setOnClickListener {
            val intent: Intent = Intent()
            setResult(RESULT_OK, intent)
            finish()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main_activity2, menu)
        return true
    }
}
