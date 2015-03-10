/**
 * Created by SULBAH on 7/03/15.
 */

    convertir(10)


    def convertir(int numero){
        String romanoRes = ""
        def mapaR=[I:1, IV:4, V:5, IX:9, X:10, XL:40, L:50, XC:90, C:100, CD:400, D:500, CM:900, M:1000]

        if (mapaR.any {it.value == numero}) {
            romanoRes += mapaR.find {it.value == numero}.key
        } else {
            mapaR.findAll {numero / it.value > 1 && numero / it.value < 4}.each { romano, arabigo ->
                def division = numero / arabigo
                int residuo = numero % arabigo

                println "${numero} / ${arabigo} = ${numero / arabigo} ----- ${numero} % ${arabigo} = ${numero % arabigo}"
                division.times {
                    romanoRes += romano
                }
                /*if (residuo != 0)
                    convertir(residuo)*/

            }
        }

        println romanoRes
    }


