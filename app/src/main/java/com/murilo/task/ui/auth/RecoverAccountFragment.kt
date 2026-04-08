package com.murilo.task.ui.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.murilo.task.R
import com.murilo.task.databinding.FragmentRecoverAccountBinding
import com.murilo.task.util.initToolbar
import com.murilo.task.util.showBottomSheet

class RecoverAccountFragment : Fragment() {

    private var _binding: FragmentRecoverAccountBinding?=null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentRecoverAccountBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initToolbar(binding.toolbar)
        initListener()
    }

    private fun initListener() {
        binding.buttonEnviar.setOnClickListener() {
            validateData()
        }
    }

    private fun validateData() {
        val email = binding.edtTextEmail.text.toString().trim()

        if (email.isNotBlank()) {
            Toast.makeText(requireContext(), "Tudo OK!", Toast.LENGTH_SHORT).show()
        }
        else {
            showBottomSheet(message = getString(R.string.email_empty))
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}