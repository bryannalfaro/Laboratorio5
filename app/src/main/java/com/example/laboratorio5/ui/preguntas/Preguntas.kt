package com.example.laboratorio5.ui.preguntas

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.laboratorio5.R


class Preguntas : Fragment() {

    companion object {
        fun newInstance() = Preguntas()
    }

    private lateinit var viewModel: PreguntasViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.preguntas_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(PreguntasViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
