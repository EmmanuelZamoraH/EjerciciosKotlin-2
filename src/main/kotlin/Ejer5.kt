fun main() {
    val casas = listOf(
        Casa(2000, 100, 3, true, 'A'),
        Casa(2005, 75, 3, true, 'B'),
        Casa(2015, 90, 2, false, 'A'),
        Casa(1980, 120, 4, false, 'A'),
        Casa(2000, 100, 3, true, 'A'),
        Casa(2011, 60, 2, true, 'B')
    )
    println(price(casas, 260000000.0))
}

class Casa(var y: Int, var m: Int, var h: Int, var g: Boolean, var z: Char)

fun price(casas: List<Casa>, price: Double): List<Pair<String, Double>> {
    val PrecioCasas: MutableList<Pair<String, Double>> = mutableListOf()
    var p = 0.0
    for (i in casas.indices) {
        if (casas[i].z == 'A') {
            p = if (casas[i].g) {
                ((casas[i].m * 1000 + casas[i].h * 5000 + 15000) * (2022 - casas[i].y / 100)).toDouble()
            } else {
                ((casas[i].m * 1000 + casas[i].h * 5000) * (2022 - casas[i].y / 100)).toDouble()
            }
        } else if (casas[i].z == 'B') {
            p = if (casas[i].g) {
                (casas[i].m * 1000 + casas[i].h * 5000 + 15000) * (2022 - casas[i].y / 100) * 1.5
            } else {
                (casas[i].m * 1000 + casas[i].h * 5000) * (2022 - casas[i].y / 100) * 1.5
            }
        }
        if (p <= price) {
            val cad= "Habitaciones: "+casas[i].h.toString()+", "+"Año: "+casas[i].y.toString()+", "+"Garage: "+casas[i].g.toString()+", "+"Zona: "+casas[i].z.toString()+", "+"Metros: "+casas[i].m.toString()+", Precio Total:"
            PrecioCasas.add(Pair(cad, p))
        }
    }
    return PrecioCasas
}