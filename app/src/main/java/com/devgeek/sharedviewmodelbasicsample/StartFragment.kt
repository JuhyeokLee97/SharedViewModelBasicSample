package com.devgeek.sharedviewmodelbasicsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.devgeek.sharedviewmodelbasicsample.databinding.FragmentStartBinding
import com.devgeek.sharedviewmodelbasicsample.viewModel.OrderViewModel

/**
 * This is the first screen of the Cupcake app.
 * The user can choose how many cupcakes to order.
 */
class StartFragment : Fragment() {

    /**
     * Binding object instance corresponding to the fragment_start.xml layout
     * This property is non-null between the onCreateView(0) and onDestroyView() lifecycle callbacks,
     * when the view hierarchy is attached to the fragment
     */
    private var binding: FragmentStartBinding? = null

    /** Use the 'by activityViewModels()' Kotlin property delegate from the fragment-ktx artifact */
    private val sharedViewModel: OrderViewModel by activityViewModels()

    /** Inflate the layout for this fragment */
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = FragmentStartBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        /** 왜 layout에서 variable.type을 Fragment로 했을까...?? */
        binding?.startFragment = this
    }

    /**
     * Start on order with the desired quantity of cupcake and navigate to the next screen.
     */
    fun orderCupcake(quantity: Int){
        // Update the view model with the quantity
    }

    /**
     * This fragment lifecycle method is called when the view hierarchy associated with the fragment
     * is being removed. As a result, clear out the binding object
     */
    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}