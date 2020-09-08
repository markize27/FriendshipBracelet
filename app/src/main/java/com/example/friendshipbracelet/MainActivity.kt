package com.example.friendshipbracelet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val cellWidth = 30
    val cellHeight = 30
    var tableRowCount = 5
    var tableColumnsCount = 10




    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      //  val butToAddColums : Button = findViewById(R.id.buttToAddColums)
        //var tableLayout : TableLayout= findViewById(R.id.mainTable)

        buttToAddColums.setOnClickListener(){
            addRows()
        }
        buttToDeleteColums.setOnClickListener(){
            delRows()
        }

    }

    fun init(){
        for(i in 0 until tableRowCount){

            for(j in 0 until tableColumnsCoun)
        }
    }

    fun addRows(){
        var tbrow0 = TableRow(this)
        var tv0 = TextView(this)

        tv0.setText("Row "+tableRowCount + " Col "+ tableColumnsCount)
        count++
        tbrow0.id = tableRowCount
        tableRowCount++
        tbrow0.addView(tv0)
        mainTable.addView(tbrow0)
    }
    fun delRows(){

        mainTable.removeView(mainTable.getChildAt(tableRowCount))
        tableRowCount--
    }

}