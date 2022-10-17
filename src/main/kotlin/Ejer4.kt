fun main() {
    val asignaturas = arrayOf<String>(
        "Logica Matematica", "Conmutacion y enrutamiento deredes", "Porgramacion Logica y funcional",
        "Programación movil", "Ingles"
    )
    val notas = arrayOf<Int>(69, 99, 77, 70, 100)
    calificaciones(asignaturas, notas)
}

fun resultados(nota: Int): String {
    if (nota <= 100 && nota >= 95) {
        return ": Excelente"
    } else if (nota <= 94 && nota >= 85) {
        return ": Notable"
    } else if (nota <= 84 && nota >= 75) {
        return ": Bueno"
    } else if (nota <= 74 && nota >= 70) {
        return ": Suficiente"
    } else return ": Desempeño insuficiente"
}
fun calificaciones(asignaturas: Array<String>, notas: Array<Int>) {
    for (i in 0..asignaturas.size - 1) {
        println(asignaturas.get(i).toUpperCase() + " " + resultados(notas.get(i)))
    }
}