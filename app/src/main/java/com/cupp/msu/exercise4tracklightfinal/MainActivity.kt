package com.cupp.msu.exercise4tracklightfinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var trafficIndicator: Button
    private lateinit var redlight: View
    private lateinit var greenlight: View
    private lateinit var yellowlight: View


    private var isStop = true
    private var isGo = false
    private var isWait = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        redlight.visibility=View.INVISIBLE
        greenlight.visibility=View.INVISIBLE
        yellowlight.visibility=View.INVISIBLE

        trafficIndicator.setOnClickListener {
            if (isStop) {
                trafficIndicator.setBackgroundResource(R.drawable.green)
                trafficIndicator.text = "Go"
                redlight.visibility = View.INVISIBLE
                greenlight.visibility = View.VISIBLE
                yellowlight.visibility = View.INVISIBLE
                isGo= true
                isStop = false
            } else if (isGo) {
                trafficIndicator.setBackgroundResource(R.drawable.yellow)
                trafficIndicator.text = "Wait"
                redlight.visibility = View.INVISIBLE
                greenlight.visibility = View.INVISIBLE
                yellowlight.visibility = View.VISIBLE
                isGo= false
                isWait = true
            } else {
                trafficIndicator.setBackgroundResource(R.drawable.red)
                trafficIndicator.text = "Stop"
                redlight.visibility = View.VISIBLE
                greenlight.visibility = View.INVISIBLE
                yellowlight.visibility = View.INVISIBLE
                isWait= false
                isStop = true
            }
        }
    }
}