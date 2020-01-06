package th.ac.su.ict.yanapat.palette

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tvRGB = findViewById<TextView>(R.id.tvShowing)
        var tvShowing = findViewById<TextView>(R.id.tvRGB)
        var btn1 = findViewById<Button>(R.id.bt1)
        var btn2 = findViewById<Button>(R.id.bt2)
        var btn3 = findViewById<Button>(R.id.bt3)
        var btn4 = findViewById<Button>(R.id.bt4)
        var btn5 = findViewById<Button>(R.id.bt5)
        var btn6 = findViewById<Button>(R.id.bt6)

        btn1.setOnClickListener {
            tvShowing.text = "235-255-221"
            tvShowing.setBackgroundColor(Color.parseColor("#FFE9E1DE"))
        }

        btn2.setOnClickListener {
            tvShowing.text = "236-203-202"
            tvShowing.setBackgroundColor(Color.parseColor("#ecbec4"))
        }

        btn3.setOnClickListener {
            tvShowing.text = "106-121-148"
            tvShowing.setBackgroundColor(Color.parseColor("#6a7994"))
        }

        btn4.setOnClickListener {
            tvShowing.text = "153-169-191"
            tvShowing.setBackgroundColor(Color.parseColor("#8fa1b8"))
        }

        btn5.setOnClickListener {
            tvShowing.text = "195-204-216"
            tvShowing.setBackgroundColor(Color.parseColor("#bcc7d1"))
        }

        btn6.setOnClickListener {
            tvShowing.text = "221-226-269"
            tvShowing.setBackgroundColor(Color.parseColor("#dadfe3"))
        }

    }
}
