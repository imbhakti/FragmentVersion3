package com.test.fragmentversion3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.test.fragmentversion3.databinding.FormFragmentBinding
import java.text.Normalizer.Form

class FormFragment : Fragment(){
    private lateinit var binding: FormFragmentBinding

    var updateData : String = ""
        set(value){
            field = value
            binding.edtData.setText(field)
        }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FormFragmentBinding.inflate(inflater)
        binding.btnSendData.setOnClickListener {
            (activity as MainActivity).sendDataToDataFragment(binding.edtData.text.toString())
        }
        return binding.root
    }


   /* //by creating interface

    interface OnDataListener {
        fun onData(data: String)
    }

        var onDataListener : OnDataListener? = null


    var updateData : String = ""
    set(value){
        field = value
        binding.edtData.setText(field)
    }

    override fun onCreateView(

        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FormFragmentBinding.inflate(inflater)

        //way1
       /* binding.btnSendData.setOnClickListener {
            (activity as MainActivity).sendDataToDataFragment(binding.edtData.text.toString())
        }*/

        //way2
        /*binding.btnSendData.setOnClickListener {
            (parentFragmentManager.findFragmentById(R.id.dataFragment) as DataFragment)
                .data = binding.edtData.text.toString()
        }*/
        binding.btnSendData.setOnClickListener {
           onDataListener!!.onData (binding.edtData.text.toString())
        }

        return binding.root
    }*/
}