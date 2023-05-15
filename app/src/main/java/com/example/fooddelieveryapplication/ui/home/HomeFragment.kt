package com.example.fooddelieveryapplication.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fooddelieveryapplication.R
import com.example.fooddelieveryapplication.adapters.HomeHorAdapter
import com.example.fooddelieveryapplication.databinding.FragmentHomeBinding
import com.example.fooddelieveryapplication.models.HomeHorModel

class HomeFragment : Fragment() {
    lateinit var homeHorizontalRec:RecyclerView;
    lateinit var homeHorModelList: ArrayList<HomeHorModel>
    lateinit var homeHorAdapter: HomeHorAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var root= inflater.inflate(R.layout.fragment_home, container, false)
        homeHorizontalRec=root.findViewById(R.id.hom_hor_rec)

        homeHorModelList.add(HomeHorModel(R.drawable.pizza,"Pizza"))
        homeHorModelList.add(HomeHorModel(R.drawable.hamburger,"HamBurger"))
        homeHorModelList.add(HomeHorModel(R.drawable.fried_potatoes,"Fries"))
        homeHorModelList.add(HomeHorModel(R.drawable.ice_cream,"Ice Cream"))
        homeHorModelList.add(HomeHorModel(R.drawable.sandwich,"Sandwich"))

        homeHorizontalRec.adapter=homeHorAdapter
       // homeHorizontalRec.layoutManager=LinearLayoutManager(this)
        homeHorizontalRec.layoutManager=LinearLayoutManager(activity,RecyclerView.HORIZONTAL,false)
            // homeHorizontalRec.setHasFixedSize(true)

        return root;
    }
}

