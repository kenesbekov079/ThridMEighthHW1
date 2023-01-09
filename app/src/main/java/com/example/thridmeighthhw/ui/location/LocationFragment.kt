package com.example.thridmeighthhw.ui.location

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.thridmeighthhw.Location
import com.example.thridmeighthhw.LocationAdapter
import com.example.thridmeighthhw.databinding.FragmentLocationBinding

class LocationFragment : Fragment() {

    private var _binding: FragmentLocationBinding? = null
    private val data = arrayListOf<Location>()
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLocationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        val adapter = LocationAdapter(data,this::onClick)
        binding.recyclerview.layoutManager = GridLayoutManager(requireContext(),2)
        binding.recyclerview.adapter = adapter
    }

    private fun loadData() {
        data.add(Location("Planet","Earth (C-137)"))
        data.add(Location("Cluster","Abadango"))
        data.add(Location("Space station","Citadet of Ricks"))
        data.add(Location("Planet","Worldender's lair"))
        data.add(Location("Microverse","Anatomy Park"))
        data.add(Location("TV","Interdimensional"))
        data.add(Location("Resort","Immoratality Field Resort"))
        data.add(Location("Planet","Post-Apocalyptic Earth"))
        data.add(Location("Planet","Purge Planet"))
        data.add(Location("Planet","Venzenulon 7"))
        data.add(Location("Planet","Bepis 9"))
        data.add(Location("Planet","Cronenberg Earth"))
        data.add(Location("Planet","Nuptia 4"))
        data.add(Location("Fantasy town","Giant's Town"))
        data.add(Location("Planet","Bird World"))
        data.add(Location("Space station","St.Gloopy Noops Hospital"))
        data.add(Location("Planet","Earth (5-126)"))
        data.add(Location("Dream","Mr.Goldenfold's dream"))
        data.add(Location("Planet","GromflomPrime"))
        data.add(Location("Planet","Earth (Rpl.Dimension)"))
    }

    private fun onClick(pos:Int){
        Toast.makeText(requireContext(), data[pos].location + " " + data[pos].name,Toast.LENGTH_SHORT).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}