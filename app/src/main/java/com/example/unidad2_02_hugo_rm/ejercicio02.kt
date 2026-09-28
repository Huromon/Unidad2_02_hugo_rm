package com.example.unidad2_02_hugo_rm
var lista = mutableListOf<String>()
fun main () {
var fin = false
    while (!fin) {
        println("1- añadir\n2- completar \n3- listar\n4- pendientes")
        var resp = readLine()?.toIntOrNull()?:0
        when (resp){
            1 -> {

                println("nombre de la tarea")
                 var tarea = readLine().orEmpty()
                anadir(tarea)
            }
            2-> {
                println("indice de la tarea a completar")
                var indi = readLine()?.toIntOrNull()?:0
                completar(indi)
            }
            3 -> listar()
            4 -> pendientes()

            else -> fin = true
        }







    }

}
fun completar(indice : Int){

    if(lista.get(indice).contains("[X]")){
        println("ya esta completa")
    }else{

        lista[indice]= ("[X] "+ lista.get(indice))


    }
}
fun anadir(tarea: String){
lista.add(tarea)
}
fun listar(){

    for (x in lista){
        println(x)
    }
}
fun pendientes(){
var cont = 0
    for (x in lista){
        if (!lista.get(cont).contains("[X]")){
            println(lista.get(cont))
        }
        cont++
    }
}

