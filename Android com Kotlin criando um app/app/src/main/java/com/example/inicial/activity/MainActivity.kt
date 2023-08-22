package com.example.inicial.activity

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.inicial.R
import com.example.inicial.model.Produto
import com.example.inicial.ui.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

class MainActivity : AppCompatActivity(R.layout.activity_main){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView01)
        recyclerView.adapter = ListaProdutosAdapter(context = this, produtos = listOf(
            Produto(nome = "teste",
                descricao = "test desc",
                valor = BigDecimal("15.96")
            ),
            Produto(nome = "teste1",
                descricao = "test desc 1",
                valor = BigDecimal("19.96")
            )
        ))

//        recyclerView.layoutManager = LinearLayoutManager(this)
    }

}