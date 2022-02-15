package com.example.myapplication.feature

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.myapplication.R
import com.example.myapplication.URLImage
import com.example.myapplication.databinding.GeneralFragmentBinding
import com.example.myapplication.domain.GetUrlImagesUseCase
import kotlinx.coroutines.coroutineScope
import javax.inject.Inject
import javax.inject.Scope


class GeneralFragment : Fragment(R.layout.general_fragment) {
    private val viewBinding by viewBinding(GeneralFragmentBinding::bind)

    @Inject
    lateinit var getUrlImagesUseCase: GetUrlImagesUseCase

    lateinit var adapter: GeneralAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView()


    }

    private fun initRecyclerView() {
        viewBinding.rvGeneral.layoutManager = LinearLayoutManager(context)
        adapter = GeneralAdapter()
        viewBinding.rvGeneral.adapter = adapter
    }

    private suspend fun initListUrl() {
//        val urlList: List<URLImage> = listOf(URLImage( "1"), URLImage( "2"))
        adapter.submitList(getUrlImages())
    }

    private suspend fun getUrlImages(): List<URLImage> = getUrlImagesUseCase()


}