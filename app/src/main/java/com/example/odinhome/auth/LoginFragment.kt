package com.example.odinhome.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odinhome.R
import com.example.odinhome.databinding.FragmentLoginBinding

class loginFragment : Fragment() {

    lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.longinButton.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.action_loginFragment_to_listFragment) //TODO edit with Auth
        }
    }

}