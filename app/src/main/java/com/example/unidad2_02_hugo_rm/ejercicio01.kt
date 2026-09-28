package com.example.unidad2_02_hugo_rm
fun main(){
    val csv = """nombre,nota1,nota2,nota3
        |Ana,7,8,9
        |Luis,5,6,4
        |Marta,9,10,8
    """.trimMargin()
    var lista = csv.split("\n")
    var encabezado = lista[0].split(",")
    var enc = ""
    for (f in encabezado){
        enc = enc + f + " - "
    }
    print( enc + "nota media - calificacion\n")
   var med = 0.0

    for (x in 1..lista.size -1){

       var alumn = lista[x].split(",")

        var notas = ""
        for(b in alumn){
            notas=notas + b + " - "
        }
        for (c in 1..alumn.size-1){
            med += alumn[c].toDouble()
        }
        med= med / (alumn.size-1)

        var cal = when {
          med >= 9 -> " - Sobresaliente"
            med < 9 && med >= 7 -> " - Notable"
            med < 7 && med >=5 -> " - Aprobado"
            med < 5 && med > 0 -> " - Suspenso"
            else -> " - error en las notas"
        }
        println( notas + med + cal)

        med = 0.0
    }



}
