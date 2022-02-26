package com.frogobox.appuikit.recycler

import android.os.Bundle
import com.frogobox.appuikit.core.BaseActivity
import com.frogobox.appuikit.core.BasePagerAdapter
import com.frogobox.appuikit.databinding.ActivityRecyclerViewBinding

class RecyclerViewActivity : BaseActivity<ActivityRecyclerViewBinding>() {

    override fun setupViewBinding(): ActivityRecyclerViewBinding {
        return ActivityRecyclerViewBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupDetailActivity("List UI RecyclerView")
        setupViewPager()
    }

    private fun setupViewPager() {
        val pagerAdapter = BasePagerAdapter(this)
        pagerAdapter.setupPagerFragment(RecyclerListFragment(), "List")
        pagerAdapter.setupPagerFragment(RecyclerGridFragment(),"Grid")

        binding.apply {
            viewpager.adapter = pagerAdapter
            setupTabTitles(tablayout, viewpager, pagerAdapter.titles)
        }
    }

}