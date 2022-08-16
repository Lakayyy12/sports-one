package com.application.betlivescore

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.application.betlivescore.Navigator.Companion.openPage
import kotlinx.android.synthetic.main.activity_sports_guide.*

class SportsActivity : AppCompatActivity(), View.OnClickListener{

    private var btn1 : Button? = null
    private var btn2 : Button? = null
    private var btn3 : Button? = null
    private var btn4 : Button? = null
    private var btn5 : Button? = null
    private var btn6 : Button? = null
    private var btn7 : Button? = null
    private var btn8 : Button? = null
    private var btn9 : Button? = null
    private var btn10 : Button? = null
    private var btn11 : Button? = null

    private var btnc : ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sports)
        initComponents()
        initListener()

        btnc = findViewById(R.id.back)
        btnc?.setOnClickListener {
            onBackPressed()
        }
     }
    private fun initComponents() {
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        btn5 = findViewById(R.id.btn5)
        btn6 = findViewById(R.id.btn6)
        btn7 = findViewById(R.id.btn7)
        btn8 = findViewById(R.id.btn8)
        btn9 = findViewById(R.id.btn9)
        btn10 = findViewById(R.id.btn10)
        btn11 = findViewById(R.id.fact)
    }
    private fun initListener() {
        btn1?.setOnClickListener(this)
        btn2?.setOnClickListener(this)
        btn3?.setOnClickListener(this)
        btn4?.setOnClickListener(this)
        btn5?.setOnClickListener(this)
        btn6?.setOnClickListener(this)
        btn7?.setOnClickListener(this)
        btn8?.setOnClickListener(this)
        btn9?.setOnClickListener(this)
        btn10?.setOnClickListener(this)
        btn11?.setOnClickListener(this)
    }
    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.btn1 -> openPage(this, SportsGuide::class.java, btn1?.text.toString(), "${getString(R.string.blt1)} ${getString(R.string.bl1)}")
            R.id.btn2 -> openPage(this, SportsGuide::class.java, btn2?.text.toString(), "${getString(R.string.blt2)} ${getString(R.string.bl2)}")
            R.id.btn3 -> openPage(this, SportsGuide::class.java, btn3?.text.toString(), "${getString(R.string.blt3)} ${getString(R.string.bl3)}")
            R.id.btn4 -> openPage(this, SportsGuide::class.java, btn4?.text.toString(), "${getString(R.string.blt4)} ${getString(R.string.bl4)}")
            R.id.btn5 -> openPage(this, SportsGuide::class.java, btn5?.text.toString(), "${getString(R.string.blt5)} ${getString(R.string.bl5)}")
            R.id.btn6 -> openPage(this, SportsGuide::class.java, btn6?.text.toString(), "${getString(R.string.blt6)} ${getString(R.string.bl6)}")
            R.id.btn7 -> openPage(this, SportsGuide::class.java, btn7?.text.toString(), "${getString(R.string.blt7)} ${getString(R.string.bl7)}")
            R.id.btn8 -> openPage(this, SportsGuide::class.java, btn8?.text.toString(), "${getString(R.string.blt8)} ${getString(R.string.bl8)}")
            R.id.btn9 -> openPage(this, SportsGuide::class.java, btn9?.text.toString(), "${getString(R.string.blt9)} ${getString(R.string.bl9)}")
            R.id.btn10 -> openPage(this, SportsGuide::class.java, btn10?.text.toString(), "${getString(R.string.blt10)} ${getString(R.string.bl10)}")
            R.id.fact -> openPage(this, SportsGuide::class.java, btn11?.text.toString(), "${getString(R.string.about2)}")
        }
    }
}


