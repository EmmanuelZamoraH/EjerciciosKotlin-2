fun filtro(values: List<Int>, validate: (Int) -> Boolean): List<Pair<Int, Boolean>> {
    val numbers: MutableList<Pair<Int, Boolean>> = mutableListOf()
    for (i in values.indices) {
        numbers.add(Pair(values[i], validate(values[i])))
    }
    return numbers
}
fun validate(numero: Int): Boolean {
    if (numero % 2 == 0) {
        return true
    }
    return false
}

fun main() {
    val numeros = listOf(1, 2, 3, 4, 5, 6)
    println("False=impar\nTrue=par\n------------------")
    println(filtro(numeros) { a -> validate(a) })
}