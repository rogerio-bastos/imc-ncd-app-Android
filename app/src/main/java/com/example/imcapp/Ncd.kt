package com.example.imcapp

fun ncdCalculate (weight: Double, age: Int, exerciseLevel: Int,  sex: Char ): Double {
    var ncd = 0.0

    if(sex == 'M'){
        if(age < 30){
            ncd = 15.3 * weight + 679
        }else if(age < 60){
            ncd = 11.6 * weight + 879
        }else{
            ncd = 13.5 * weight + 487
        }
    }else{
        if(age < 30){
            ncd = 14.7 * weight + 496
        }else if( age < 60){
            ncd = 8.7 * weight + 829
        }else{
            ncd = 10.5 * weight + 596
        }
    }

    if(sex == 'M'){
        if(exerciseLevel == 1){
            ncd *= 1.5
        }else if(exerciseLevel == 2){
            ncd *= 1.8
        }else if(exerciseLevel == 3){
            ncd *= 2.1
        }
    }else{
        if(exerciseLevel == 1 || exerciseLevel == 2){
            ncd *= 1.6
        }else if(exerciseLevel == 3){
            ncd *= 1.8
        }
    }

    return ncd
}