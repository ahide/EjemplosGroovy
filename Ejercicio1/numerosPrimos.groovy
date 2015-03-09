/**
 * Created by SULBAH on 6/03/15.
 */

Long time_end
Long time_start
time_start= System.currentTimeMillis()

def rango= 2..100
def a=[]

rango.each { it -> (2..it).each { numero -> if (it % numero == 0 && it != numero) a.add(it)}
}
println rango - a

time_end= System.currentTimeMillis()
println ("Time :" + (time_end - time_start))





