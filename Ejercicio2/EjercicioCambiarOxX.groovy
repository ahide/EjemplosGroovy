/**
 * Created by SULBAH on 8/03/15.
 */


def contador=1
String frase = "ojos negros de oso"
String fraseconx= frase + " = " + " "

frase.each {cadena -> if(cadena.equals('o')){
        (contador++).times { fraseconx = (cadena.toString())? fraseconx + "x" : fraseconx}
    }else{
        fraseconx += cadena
    }
}
println (fraseconx)