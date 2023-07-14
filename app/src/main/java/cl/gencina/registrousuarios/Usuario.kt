package cl.gencina.registrousuarios

data class Usuario (
    val nombre:String,
    val apellido:String,
    val edad:Int,
    val correo:String,
    val sistemaSalud:String)

fun insertUsuario(): Usuario {
    var nombre = ""
    println("Ingrese nombre:")
    while(!validarNombre(nombre)) nombre = readln()

    println("Ingrese apellido:")
    var apellido = ""
    while (!validarApellido(apellido)) apellido = readln()

    println("Ingrese edad:")
    var edad = 0
    while(!validarEdad(edad)) edad = readln().toInt()

    println("Ingrese correo:")
    var correo = "a"
    while (!validarEmail(correo)) correo = readln()

    println("Ingrese sistema de salud (Fonasa /Isapre / Particular): ")
    var sistemaSalud = ""
    while (!validarSistemaSalud(sistemaSalud)) sistemaSalud = readln()

    return Usuario(nombre,apellido,edad,correo,sistemaSalud)
}