package spirals.kotlin_app.Activities

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import spirals.kotlin_app.Fragments.FragmentDashboard
import spirals.kotlin_app.Fragments.FragmentHome
import spirals.kotlin_app.Fragments.FragmentNotifications

import spirals.kotlin_app.R

class Home : AppCompatActivity() {
    private var fragment: Fragment? = null
    private var fragmentManager: FragmentManager? = null
    private var mTextMessage: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        fragment = FragmentHome()

        fragmentManager = supportFragmentManager
        val transaction = fragmentManager!!.beginTransaction()
        transaction.add(R.id.flHomeContainer, fragment).commit()

        val navigation = findViewById(R.id.navigation) as BottomNavigationView
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> fragment = FragmentHome()
            R.id.navigation_dashboard -> fragment = FragmentDashboard()
            R.id.navigation_notifications -> fragment = FragmentNotifications()
        }
        val transaction = fragmentManager!!.beginTransaction()
        transaction.replace(R.id.flHomeContainer, fragment).commit()
        false
    }



}
