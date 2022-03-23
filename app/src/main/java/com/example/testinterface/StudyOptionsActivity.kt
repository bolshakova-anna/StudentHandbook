package com.example.testinterface

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class StudyOptionsActivity: AppCompatActivity() {
    var name: String? = null

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_study_options)
  //      this.name = intent.getStringExtra("name").toString()
        val intentExtras = intent.extras
        if (intentExtras != null) {
            name = intentExtras!!.getString("name","Default")
        }
        findViewById<TextView>(R.id.subjectname).text = name;
        //TODO кнопочки
        findViewById<Button>(R.id.backToSubjects).setOnClickListener {
            Log.v("Subjects", "Back-to-subjects-activity button was pressed")
            val i = Intent(this, SubjectsActivity::class.java)
            startActivity(i)
        }
    }


    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}