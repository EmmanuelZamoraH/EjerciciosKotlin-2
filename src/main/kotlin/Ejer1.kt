import kotlin.math.*
fun main() {

    print("Ingresa el valor a resolver: ")
    val n = readLine()!!.toInt()
    println()
    println("Ingresa la función a aplicar\n" +
            "Seno (1)\n" +
            "Coseno (2)\n" +
            "Tangente (3)\n" +
            "Exponencial (4)\n" +
            "Logaritmo (5)")
    val o = readLine().toString()

    calcular(o, n)
}

fun calcular(ope: String, value: Int) {

    for (i in 1..value) {
        val v=
            when (ope) {
                "1" -> sin(i.toDouble())
                "2" -> cos(i.toDouble())
                "3" -> tan(i.toDouble())
                "4" -> exp(i.toDouble())
                "5" -> ln(i.toDouble())
                else -> 0.0
            }
        if(v<0){
            println("$i -> $v")
        }else{
            println("$i ->  $v")
        }
    }
}