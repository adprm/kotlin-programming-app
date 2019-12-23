package com.example.codelang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvLang: RecyclerView
    private var list: ArrayList<Lang> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvLang = findViewById(R.id.rv_lang)
        rvLang.setHasFixedSize(true)

        list.addAll(LangData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvLang.layoutManager = LinearLayoutManager(this)
        val listLangAdapter = ListLangAdapter(list)
        rvLang.adapter = listLangAdapter
    }

    //ListMenu
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                showRecyclerList()

            }
            R.id.action_grid -> {
                showRecyclerGrid()

            }
            R.id.action_cardview -> {
                showRecyclerCardView()

            }
        }
    }

    private fun showRecyclerGrid() {
        rvLang.layoutManager = GridLayoutManager(this, 2)
        val gridLangAdapter = GridLangAdapter(list)
        rvLang.adapter = gridLangAdapter
    }

    private fun showRecyclerCardView() {
        rvLang.layoutManager = LinearLayoutManager(this)
        val cardViewLangAdapter = CardViewLangAdapter(list)
        rvLang.adapter = cardViewLangAdapter
    }
}
