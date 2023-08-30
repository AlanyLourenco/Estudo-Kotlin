package com.example.inicial.dao

import com.example.inicial.model.Produto

class ProdutosDao {

    fun adiciona(produto: Produto){
        Companion.produtos.add(produto)
    }

    fun buscaTodos() : List<Produto>{
        return Companion.produtos.toList()
    }

    companion object {
        private val produtos = mutableListOf<Produto>()
    }
}