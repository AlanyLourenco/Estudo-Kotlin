package com.example.inicial.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.inicial.R
import com.example.inicial.dao.ProdutosDao
import com.example.inicial.model.Produto
import java.math.BigDecimal

class FormularioProdutoActivity :
    AppCompatActivity(R.layout.activity_formulario_produto) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        configuraBotaoSalvar()

    }

    private fun configuraBotaoSalvar() {
        var botaoSalvar = findViewById<Button>(R.id.produto_item_botao_salvar)
        val dao = ProdutosDao()
        botaoSalvar.setOnClickListener {
            var produtoNovo = criaProduto()
            dao.adiciona(produtoNovo)
            finish()
        }
    }

    private fun criaProduto(): Produto {
        val campoNome = findViewById<EditText>(R.id.produto_item_nome)
        var nome = campoNome.text.toString()

        val campoDescricao = findViewById<EditText>(R.id.produto_item_descricao)
        var descricao = campoDescricao.text.toString()

        val campoValor = findViewById<EditText>(R.id.produto_item_valor)
        var valorEmText = campoValor.text.toString()

        var valor = if (valorEmText.isBlank()) {
            BigDecimal.ZERO
        } else {
            BigDecimal(valorEmText)
        }

        return Produto(
            nome = nome,
            descricao = descricao,
            valor = valor
        )

    }

}