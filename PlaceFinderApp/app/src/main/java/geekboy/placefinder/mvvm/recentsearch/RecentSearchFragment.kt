package geekboy.placefinder.mvvm.recentsearch

import android.content.Context
import androidx.lifecycle.ViewModelProviders

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.android.support.AndroidSupportInjection

import geekboy.placefinder.R

class RecentSearchFragment : Fragment() {

    companion object {
        fun newInstance() = RecentSearchFragment()
    }

    private lateinit var viewModel: RecentSearchViewModel

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        AndroidSupportInjection.inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.recent_search_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(RecentSearchViewModel::class.java)
        // TODO: Use the ViewModel
    }

}