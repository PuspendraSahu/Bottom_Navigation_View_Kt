package com.psdevelop.botomnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(HomeFragment())

        val banNav = findViewById<BottomNavigationView>(R.id.bottomNavView)
        banNav.setOnItemSelectedListener {
            when (it.itemId){

                R.id.home -> replaceFragment(HomeFragment())
                R.id.post -> replaceFragment(PostFragment())
                R.id.qna -> replaceFragment(QNAFragment())
                R.id.profile -> replaceFragment(ProfileFragment())
            }

            true

        }




    }
    private fun replaceFragment(fragment : Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,fragment)
        fragmentTransaction.commit()

    }

}