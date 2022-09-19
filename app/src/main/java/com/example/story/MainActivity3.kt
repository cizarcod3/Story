package com.example.story

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity3 : AppCompatActivity() {
//    lateinit var te:TextView
    lateinit var d: DrawerLayout
    lateinit var t: Toolbar
    lateinit var n: NavigationView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        aa()
        setSupportActionBar(t)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Story"
        kad()
    }


    private fun aa(){
//        te = findViewById(R.id.im)
        d = findViewById(R.id.dr)
        t = findViewById(R.id.ta)
        n = findViewById(R.id.na)
//        var f = intent
//        var r = f.extras?.getString("emi")
//        te.text = r
        var x = ActionBarDrawerToggle(this,d,t,R.string.open,R.string.close)
        d.addDrawerListener(x)
        x.syncState()


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            android.R.id.home ->{
                d.openDrawer(GravityCompat.START)
                true
            }
            else -> true

        }
    }
    private fun kad(){
        n.setNavigationItemSelectedListener {
        when(it.itemId){
            R.id.home1 ->{
                Toast.makeText(this,"Hod",Toast.LENGTH_LONG).show()
                d.closeDrawer(GravityCompat.START)
                true
            }
            else ->{
                true
            }

        }

        }
    }

    override fun onBackPressed() {
        if(d.isDrawerOpen(GravityCompat.START)){
            d.closeDrawer(GravityCompat.START)

        }
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"تم اغلاق التطبيق",Toast.LENGTH_LONG).show()
    }

}