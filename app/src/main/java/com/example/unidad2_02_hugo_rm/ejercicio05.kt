package com.example.unidad2_02_hugo_rm
var sala = mutableMapOf<String,Boolean>()
fun main() {

    for (x in 'A'..'E'){
        for (y in 1..5){
        var asiento = (x + "" + y)
        sala.put(asiento,false)
        }
    }
    println(sala)
    var fin = false
    while (!fin){

        println("1- mostrar\n2- reservar\n3- cancelar\n4- salir")
        var opt = readLine()?.toIntOrNull()?:0
        when(opt){
            1 -> mostrar()
            2 -> reservar()
            3 -> cancelar()
            4 -> fin = true
        }
    }
}
fun mostrar(){
    for ((asi,disp) in sala){

        when (disp) {
            false -> println("$asi - disponible")
             true -> println("$asi - reservado")
        }
    }

}

fun reservar(){
    println("asiento que desea reservar")
    var reser = readLine()?.orEmpty()?:""
    if (sala.containsKey(reser.uppercase())){
        var asien = sala.get(reser.uppercase())?:false
       if (asien){
           println("asiento ya esta reservado")
       }else{
           sala[reser.uppercase()] = true
           println("reserva realizada")
       }
    }else println("no existe este asiento")
}

fun cancelar(){
    println("asiento que desea cancelar su reserva")
    var reser = readLine()?.orEmpty()?:""


    if (sala.containsKey(reser.uppercase())){
        var asien = sala.get(reser.uppercase())?:false
        if (!asien){
            println("este asiento no esta reservado")
        }else{
            sala[reser.uppercase()] = false
            println("reserva cancelada")
        }
    }else println("no existe este asiento")
}
