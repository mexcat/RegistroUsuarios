package cl.gencina.registrousuarios

import androidx.core.util.PatternsCompat
import java.util.Locale

    fun validarNombre(nombre: String): Boolean {
        return nombre.length in 1..20 && nombre.all { it.isLetter() }
    }
    fun validarApellido(apellido: String): Boolean {
        return apellido.length in 1..20 && apellido.all { it.isLetter() }
    }
    fun validarEdad(edad:Int):Boolean{
        return edad in 1..120 && edad.toString().all { it.isDigit() }
    }
    fun validarEmail(email:String):Boolean{
        if (email== "") return false
        val pattern = PatternsCompat.EMAIL_ADDRESS
        return pattern.matcher(email).matches()
    }
    fun validarSistemaSalud(sistemaSalud:String):Boolean{
        val listaSistemas = mutableListOf<String>("fonasa", "isapre", "particular")
        return sistemaSalud.lowercase(Locale.ROOT) in listaSistemas
    }


