package ua.sergeylevchenko.lesson4


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val greenButton: Button = findViewById(R.id.green_button)
        val rootLayout: ConstraintLayout = findViewById(R.id.root_layout)
        val textView: TextView = findViewById(R.id.text_view)
        val redButton: Button = findViewById(R.id.red_button)
        val yellowButton: Button = findViewById(R.id.yellow_button)

        greenButton.setOnClickListener {
            textView.text = "зеленый"
            rootLayout.setBackgroundColor(
                ContextCompat.getColor(this, R.color.greenColor)
            )
        }

        redButton.setOnClickListener {
            textView.text = "красный"
            rootLayout.setBackgroundColor(
                ContextCompat.getColor(this, R.color.redColor)
            )
        }

        yellowButton.setOnClickListener {
            textView.text = "желтый"
            rootLayout.setBackgroundColor(
                ContextCompat.getColor(this, R.color.yellowColor)
            )
        }
    }
}