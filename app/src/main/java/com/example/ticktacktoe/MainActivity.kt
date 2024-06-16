package com.example.ticktacktoe

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import com.example.ticktacktoe.databinding.ActivityMainBinding
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
    fun clickable(view:View){
        var bs=view as ImageButton
        var x=0
        when(bs.id){
            R.id.imageButton->x=1
            R.id.imageButton2->x=2
            R.id.imageButton3->x=3
            R.id.imageButton4->x=4
            R.id.imageButton5->x=5
            R.id.imageButton6->x=6
            R.id.imageButton7->x=7
            R.id.imageButton8->x=8
            R.id.imageButton9->x=9
            else-> println("Hola amigo")
        }
        play(x,bs)
        winner()

    }
fun winner(){
    var winner=0
    if(p1.contains(1) && p1.contains(2) && p1.contains(3)){
        winner=1
    }
    if(p1.contains(4) && p1.contains(5) && p1.contains(6)){
        winner=1
    }
    if(p1.contains(7) && p1.contains(8) && p1.contains(9)){
        winner=1
    }
    if(p1.contains(1) && p1.contains(5) && p1.contains(9)){
        winner=1
    }
    if(p1.contains(3) && p1.contains(5) && p1.contains(7)){
        winner=1
    }
    if(p1.contains(1) && p1.contains(4) && p1.contains(7)){
        winner=1
    }
    if(p1.contains(2) && p1.contains(5) && p1.contains(8)){
        winner=1
    }
    if(p1.contains(3) && p1.contains(6) && p1.contains(9)){
        winner=1
    }




    if(p2 .contains(1) && p2.contains(2) && p2.contains(3)){
        winner=2
    }
    if(p2.contains(4) && p2.contains(5) && p2.contains(6)){
        winner=2
    }
    if(p2.contains(7) && p2.contains(8) && p2.contains(9)){
        winner=2
    }
    if(p2.contains(1) && p2.contains(5) && p2.contains(9)){
        winner=2
    }
    if(p2.contains(3) && p2.contains(5) && p2.contains(7)){
        winner=2
    }
    if(p2.contains(1) && p2.contains(4) && p2.contains(7)){
        winner=2
    }
    if(p2.contains(2) && p2.contains(5) && p2.contains(8)){
        winner=2
    }
    if(p2.contains(3) && p2.contains(6) && p2.contains(9)){
        winner=2
    }
if(winner==1){
    Toast.makeText(this,"Player1 won",Toast.LENGTH_LONG).show()
recreate()
}
    if(winner==2){
        Toast.makeText(this,"Player2 won",Toast.LENGTH_LONG).show()
        recreate()
    }

}
    var cp=1
    var p1=ArrayList<Int>()
    var p2=ArrayList<Int>()
    fun play(x: Int, bs: ImageButton) {
        if(cp==1){
            bs.setBackgroundResource(R.drawable.circle)
            p1.add(x)
            cp=2
        }
        else{
            bs.setBackgroundResource(R.drawable.cross)
            p2.add(x)
            cp=1
        }

    }
}