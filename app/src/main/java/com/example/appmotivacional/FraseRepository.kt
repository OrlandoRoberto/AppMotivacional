package com.example.appmotivacional

import kotlin.random.Random

class FraseRepository {

    data class Frase(val descricao: String, val categoria: Int )
    val  all= 0;
    val happy = 1;
    val sunny = 2;
    private val listPhrases: List<Frase> = listOf(
        Frase("Não sabendo que era impossível, foi lá e fez.", happy),
        Frase("Você não é derrotado quando perde, você é derrotado quando desiste!", happy),
        Frase("Quando está mais escuro, vemos mais estrelas!", happy),
        Frase("Insanidade é fazer sempre a mesma coisa e esperar um resultado diferente.", happy),
        Frase("Não pare quando estiver cansado, pare quando tiver terminado.", happy),
        Frase("O que você pode fazer agora que tem o maior impacto sobre o seu sucesso?", happy),
        Frase("A melhor maneira de prever o futuro é inventá-lo.", sunny),
        Frase("Você perde todas as chances que você não aproveita.", sunny),
        Frase("Fracasso é o condimento que dá sabor ao sucesso.", sunny),
        Frase(" Enquanto não estivermos comprometidos, haverá hesitação!", sunny),
        Frase("Se você não sabe onde quer ir, qualquer caminho serve.", sunny),
        Frase("Se você acredita, faz toda a diferença.", sunny),
        Frase("Riscos devem ser corridos, porque o maior perigo é não arriscar nada!", sunny)
    )

    fun getFrase(valor : Int) : String {
        val fraseSorteada =listPhrases.filter { it.categoria == valor || valor == all}

        val ramdomIndex = Random.nextInt(fraseSorteada.size)

        return fraseSorteada[ramdomIndex].descricao


    }
}