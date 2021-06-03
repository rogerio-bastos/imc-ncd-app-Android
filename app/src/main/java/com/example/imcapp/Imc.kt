package com.example.imcapp

fun imcCalculate(weight: Double, height: Double) = weight / (height * height)

fun getStatus(imc: Double): List<String> {
    var results = emptyList<String>()

    if (imc < 18.5) {
        results = listOf("Abaixo do Peso", "Risco de fadiga, estresse e ansiedade.")
    } else if (imc < 25) {
        results = listOf("Peso Ideal","Menor risco de doenças cardíacas.")
    } else if (imc < 30) {
        results = listOf("Acima Do Peso","Risco de má circulação, fadiga e varizes.")
    } else if (imc < 35){
        results = listOf("Obesidade Grau I","Risco de diabetes, infarto e aterosclerose.")
    } else if (imc < 40){
        results = listOf("Obesidade Grau II","Risco de apneia do sono e falta de ar.")
    }else{
        results = listOf("Obesidade Grau III","Risco de refluxo, mobilidade reduzida, escaras, diabetes, infarto e AVC")
    }

    return results
}


