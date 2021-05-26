package com.example.drawingapp

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drawingView= findViewById<DrawingView>(R.id.drawing_view)
        drawingView.setSizeForBrush(20.toFloat())

        findViewById<ImageButton>(R.id.ib_brush).setOnClickListener{

            showBrushSizeChooserDialog()
        }
        }


    private fun showBrushSizeChooserDialog(){
        val brushDialog= Dialog(this)
        brushDialog.setContentView(R.layout.select_size)
        brushDialog.setTitle("Brush Size:")
        val smallBtn= brushDialog.findViewById<ImageButton>(R.id.small_brush)
        smallBtn.setOnClickListener{
            val drawingView= findViewById<DrawingView>(R.id.drawing_view)
            drawingView.setSizeForBrush(10.toFloat())
            brushDialog.dismiss()
        }
        val medBtn= brushDialog.findViewById<ImageButton>(R.id.medium_brush)
        medBtn.setOnClickListener{
            val drawingView= findViewById<DrawingView>(R.id.drawing_view)
            drawingView.setSizeForBrush(20.toFloat())
            brushDialog.dismiss()
        }
        val largeBtn= brushDialog.findViewById<ImageButton>(R.id.large_brush)
        largeBtn.setOnClickListener{
            val drawingView= findViewById<DrawingView>(R.id.drawing_view)
            drawingView.setSizeForBrush(30.toFloat())
            brushDialog.dismiss()
        }
        brushDialog.show()
    }
}