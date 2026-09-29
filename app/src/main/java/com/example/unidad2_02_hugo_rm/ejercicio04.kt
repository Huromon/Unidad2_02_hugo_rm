package com.example.unidad2_02_hugo_rm

fun main(){
    var correcto = false
    var error = false
    while (!correcto){
        error = false
        println("Introduzca una contraseña valida")
        var contra = readLine()?.orEmpty()?:""
       if (contra.length < 8){
           error = true
           println("minimo 8 caracteres")
       }
        if (!contra.any{ it.isUpperCase()}){
            error = true
            println("minimo una mayuscula")
        }
        if (!contra.any{ it.isLowerCase()}){
            error = true
            println("minimo una minuscula")
        }
        if (!contra.any{ it.isDigit()}){
            error = true
            println("minimo una minuscula")
        }
        if (contra.all {it.isLetterOrDigit()}){
            error = true
            println("minimo un caracter especial")
        }
        if (contra.any {it.isWhitespace()}){
            error = true
            println("sin espacios")
        }
        if(!error){
            println("contraseña valida")
            correcto=true
        }







    }



}