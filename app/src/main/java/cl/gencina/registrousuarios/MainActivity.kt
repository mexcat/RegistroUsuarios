package cl.gencina.registrousuarios

fun main(){
    var listaUsuario = mutableListOf<Usuario>()
    println("Ingrese la cantidad de usuarios:")
    val cantUsuario = readln().toInt()
    for (i in 1..cantUsuario){
        println("ingrese usuario numero $i")
        val temp = insertUsuario()
        listaUsuario.add(temp)
    }
    for(u in listaUsuario.sortedBy { usuario ->  usuario.edad }){
        println(u.toString())
    }
}


