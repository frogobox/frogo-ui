package com.frogobox.appuikit

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.frogobox.appuikit.core.BaseActivity
import com.frogobox.appuikit.databinding.ActivityMainBinding
import com.frogobox.appuikit.model.Main
import com.frogobox.appuikit.recycler.RecyclerViewActivity
import com.frogobox.recycler.core.FrogoRecyclerNotifyListener
import com.frogobox.recycler.core.IFrogoViewAdapter

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun setupViewBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupRecyclerView()
    }

    private fun data(): MutableList<Main> {
        val data = mutableListOf<Main>()
        data.add(Main("RecyclerView Layout", Intent(this, RecyclerViewActivity::class.java)))
        data.add(Main("Compose (Experimental)", Intent(this, ComposeActivity::class.java)))
        return data
    }

    private fun setupRecyclerView() {
        binding.frogoRv.injector<Main>()
            .addCustomView(R.layout.frogo_rv_list_type_1)
            .addData(data())
            .addCallback(object : IFrogoViewAdapter<Main> {
                override fun onItemClicked(
                    view: View,
                    data: Main,
                    position: Int,
                    notifyListener: FrogoRecyclerNotifyListener<Main>
                ) {
                    startActivity(data.intent)
                }

                override fun onItemLongClicked(
                    view: View,
                    data: Main,
                    position: Int,
                    notifyListener: FrogoRecyclerNotifyListener<Main>
                ) {
                }

                override fun setupInitComponent(
                    view: View,
                    data: Main,
                    position: Int,
                    notifyListener: FrogoRecyclerNotifyListener<Main>
                ) {
                    view.findViewById<TextView>(R.id.frogo_rv_list_type_1_tv_title).text = data.name
                }
            })
            .createLayoutLinearVertical(false)
            .build()
    }

}