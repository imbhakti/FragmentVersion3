package com.test.fragmentversion3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private lateinit var formFragment : FormFragment
    private lateinit var dataFragment: DataFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initFragments()
       // iniListeners()
    }
    private fun initFragments(){

        formFragment = supportFragmentManager.findFragmentById(R.id.formFragment) as FormFragment
        dataFragment = supportFragmentManager.findFragmentById(R.id.dataFragment) as DataFragment
    }

    fun sendDataToFormFragment(data : String){
        dataFragment.data = data
    }

    fun sendDataToDataFragment(data : String){
        dataFragment.data = data

    }
    /*private fun iniListeners(){
        formFragment.onDataListener = dataFragment

    }*/
}