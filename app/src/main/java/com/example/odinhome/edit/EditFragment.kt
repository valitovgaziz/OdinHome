package com.example.odinhome.edit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.odinhome.R
import com.example.odinhome.databinding.FragmentEditBinding
import com.example.odinhome.list.ListFragmentViewModel
import com.example.odinhome.room.InfoCardData

class editFragment : Fragment() {

    lateinit var binding: FragmentEditBinding
    lateinit var viewModel: ListFragmentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEditBinding.inflate(inflater)
        viewModel = ViewModelProvider(requireActivity())[ListFragmentViewModel::class.java]
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.insertToListButtion.setOnClickListener{
            val name = binding.nameOnEdit.text.toString()
            val description = binding.descriptionOnEdit.text.toString()

            val infoCardData = InfoCardData(name = name, description = description)
            viewModel.insert(infoCardData)
            Navigation.findNavController(it).navigate(R.id.action_editFragment_to_listFragment)
        }
    }

}