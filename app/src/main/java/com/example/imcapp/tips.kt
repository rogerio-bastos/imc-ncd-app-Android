package com.example.imcapp

import java.util.*

fun getTipDay() : List<String> {

    val tips = listOf(
        listOf("Alimente-se Melhor", "Reduza alimentos com gordura, açúcar e sal. Tenha sempre frutas, verduras e legumes na alimentação diária."),
        listOf("Movimente-se ", "Inicie uma atividade física. Evite escadas rolantes e elevadores e suba a pé."),
        listOf("Beba Água", "Não espere ter sede para beber água. Quando você tem sede, significa que o corpo já está desidratado."),
        listOf("Durma Bem", "Crie um ritual, deixe o ambiente escuro e silencioso. Quem dorme pouco e tem uma qualidade de sono ruim, tem mais chances de aumentar o peso."),
        listOf("Hábitos Saudáveis", "Jamais fique em jejum. Coma a cada 3 a 4 horas."),
        listOf("Evite!", "Evite açúcar e farinha branca."),
        listOf("Água É vida!", "Beba muita água durante o dia, mas não durante as refeições, pois atrapalha a digestão e distende o abdômen."),
        listOf("Gordura Não!", "Retire toda a gordura visível das carnes antes de cozinhá-las."),
        listOf("Comece Pela Salada", "Pessoas que comem saladas antes do almoço consomem 12% menos de calorias do que se fossem direto ao prato principal."),
        listOf("Frutas Grelhadas", "Para uma sobremesa deliciosa e de baixa caloria, grelhe suas frutas favoritas e acrescente canela."),
        listOf("Consuma Alimentos Integrais", "São ricos em fibras, retardam a absorção dos carboidratos e são mais nutritivos que os refinados."),
        listOf("Quando sair para comer fora", "Escolher pratos que acompanhem legumes e usar bebida alcoólica com moderação intercalada com 1 copo de água"),
        listOf("Evite Doces", "Na sobremesa, substitua por frutas.")
    )

    val prizeDraw = Random()
    val tipDay = prizeDraw.nextInt(tips.size)

    return tips[tipDay]
}
