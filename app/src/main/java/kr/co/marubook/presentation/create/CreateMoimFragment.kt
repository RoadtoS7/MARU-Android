package kr.co.marubook.presentation.create

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import kr.co.marubook.R
import kr.co.marubook.base.BindingFragment
import kr.co.marubook.databinding.FragmentCreateMoimBinding
import kr.co.marubook.databinding.FragmentSearchBinding
import kr.co.marubook.presentation.search.SearchViewModel

@AndroidEntryPoint
class CreateMoimFragment : BindingFragment<FragmentCreateMoimBinding>(R.layout.fragment_create_moim) {
//    private val screateMoimViewModel by viewModels<SearchViewModel>()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }
}