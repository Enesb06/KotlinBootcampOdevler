package com.example.navigationcomponentodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponentodev.databinding.FragmentSayfaYBinding


class SayfaYFragment : Fragment() {

private lateinit var biding: FragmentSayfaYBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        biding= FragmentSayfaYBinding.inflate(inflater,container,false)
        biding.buttonGeri.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_sayfaYFragment_to_anasayfaFragment)
        }

        return biding.root
    }


    }
