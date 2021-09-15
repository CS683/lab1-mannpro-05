package com.example.mad_lab_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.d("LifeCycle", "onCreate Method called!!")
        Toast.makeText(this, "onStart Method called!!", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("LifeCycle", "onResume Method called!!")
        Toast.makeText(this, "onResume Method called!!", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("LifeCycle", "onPause Method called!!")
        Toast.makeText(this, "onPause Method called!!", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d("LifeCycle", "onStop Method called!!")
        Toast.makeText(this, "onStop Method called!!", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("LifeCycle", "onRestartMethod called!!")
        Toast.makeText(this, "onRestart Method called!!", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LifeCycle", "onDestroy Method called!!")
        Toast.makeText(this, "onDestroy Method called!!", Toast.LENGTH_SHORT).show()
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        Log.d("LifeCycle", "onSaveInstanceState Method called!!")
        Toast.makeText(this, "onSaveInstanceState Method called!!", Toast.LENGTH_SHORT).show()
    }


}