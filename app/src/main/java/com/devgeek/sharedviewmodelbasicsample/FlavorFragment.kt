package com.devgeek.sharedviewmodelbasicsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.devgeek.sharedviewmodelbasicsample.databinding.FragmentFlavorBinding
import com.devgeek.sharedviewmodelbasicsample.viewModel.OrderViewModel

/**
 * [FlavorFragment] allows a user to choose a cupcake flavor for the order
 */
class FlavorFragment : Fragment() {

    /**
     * Binding object instance corresponding to the fragment_flavor.xml layout
     * This property is not-null between the onCreateView() and onDestroyView() lifcycle callbacks,
     * when the view hierarchy is attached to the fragment.
     */
    private var binding: FragmentFlavorBinding? = null

    /** Use the by activityViewModels()` Kotlin property delegate from the fragment-ktx artifact */
    private val sharedViewModel: OrderViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentBinding = FragmentFlavorBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            // Specify the fragment as the lifecycle owner
            lifecycleOwner = viewLifecycleOwner

            // Assign the view model to a property in the binding class
            viewModel = sharedViewModel

            // Assign the fragment
            flavorFragment = this@FlavorFragment
        }
    }

    /**
     * Navigate to the next screen to choose pickup date
     */
    fun goToNextScreen(){
        findNavController().navigate(R.id.action_flavorFragment_to_pickupFragment)
    }

    /**
     * Cancel the order and start over
     */
    fun cancelOrder(){
        // Reset order in viewModel
        sharedViewModel.resetOrder()

        // Navigate back to the [StartFragment] to start over
        findNavController().navigate(R.id.action_flavorFragment_to_startFragment)
    }

    /**
     * This fragment lifecycle method is called when the view hierarchy associated with the fragment
     * is being remove. As a result, clear out the binding object
     */
    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}