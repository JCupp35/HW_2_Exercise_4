package com.cupp.msu.exercise4tracklightfinal

import android.graphics.Color
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

        trafficIndicator = findViewById(R.id.indicator_button)
        redlight = findViewById(R.id.red)
        greenlight = findViewById(R.id.green)
        yellowlight = findViewById(R.id.yellow)

        redlight.visibility=View.INVISIBLE
        greenlight.visibility=View.INVISIBLE
        yellowlight.visibility=View.INVISIBLE

        trafficIndicator.setOnClickListener {
            if (isStop) {
                trafficIndicator.setBackgroundResource(R.drawable.green)
                trafficIndicator.text = "Go"
                trafficIndicator.setTextColor(Color.BLACK)
                trafficIndicator.setBackgroundColor(Color.GREEN)
                redlight.visibility = View.INVISIBLE
                greenlight.visibility = View.VISIBLE
                yellowlight.visibility = View.INVISIBLE
                isGo= true
                isStop = false
            } else if (isGo) {
                trafficIndicator.setBackgroundResource(R.drawable.yellow)
                trafficIndicator.text = "Wait"
                trafficIndicator.setTextColor(Color.BLACK)
                trafficIndicator.setBackgroundColor(Color.YELLOW)
                redlight.visibility = View.INVISIBLE
                greenlight.visibility = View.INVISIBLE
                yellowlight.visibility = View.VISIBLE
                isGo= false
                isWait = true
            } else {
                trafficIndicator.setBackgroundResource(R.drawable.red)
                trafficIndicator.text = "Stop"
                trafficIndicator.setTextColor(Color.BLACK)
                trafficIndicator.setBackgroundColor(Color.RED)
                redlight.visibility = View.VISIBLE
                greenlight.visibility = View.INVISIBLE
                yellowlight.visibility = View.INVISIBLE
                isWait= false
                isStop = true
            }
        }
    }
}