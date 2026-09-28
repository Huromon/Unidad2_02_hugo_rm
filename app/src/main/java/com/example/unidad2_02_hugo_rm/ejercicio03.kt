package com.example.unidad2_02_hugo_rm

import androidx.lifecycle.viewmodel.CreationExtras
import java.sql.SQLOutput

fun main(){
    println("escribe un texto")
    var texto = readLine()?.orEmpty()?:""
    texto = texto.lowercase()
    var letras = mutableMapOf<Char, Int>()

    for (x in 0..texto.length-1){
        var cont = 0
        var let = texto.get(x)

        if (!letras.containsKey(let) && !let.isWhitespace()){
            letras.put(let,0)
            for (y in 0..texto.length-1){

                var let2 = texto.get(y)

                if (let.equals(let2)){cont++}

            }

           letras[let]= cont

        }

    }
    println(letras.toSortedMap())








}