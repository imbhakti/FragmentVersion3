package com.test.fragmentversion3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.test.fragmentversion3.databinding.DataFragmentBinding

class DataFragment : Fragment() {
    private lateinit var binding: DataFragmentBinding

    var data: String = ""
        set(value) {
            field = value
            binding.txtData.text = field
        }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataFragmentBinding.inflate(inflater)
        binding.btnUpdateData.setOnClickListener {
            (activity as MainActivity).sendDataToFormFragment("update data -- $data")
        }
        return binding.root
    }

}

        //way -1 through main activity
        /*  binding.btnUpdateData.setOnClickListener {
            (activity as MainActivity).sendDataToFormFragment("updated data --$data")

        }
        // way -2 direct communication between two fragment
        binding.btnUpdateData.setOnClickListener {
            (parentFragmentManager.findFragmentById(R.id.formFragment)
                    as FormFragment).updateData = "$data -- updated"

        }
        return binding.root
    }

    override fun onData(data: String) {

        this.data = data

    }
}
}
         */