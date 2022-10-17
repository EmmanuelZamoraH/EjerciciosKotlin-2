fun main(args: Array<String>) {
    val resultados= listOf<Int>(88,100,49,60,92,70,30,77,91)
    var a= mutableListOf<String>()
    for (i in resultados)
    {
        if (i <=100 && i >=95){
            a.add(i.toString())
            a.add("Excelente")
        }else if (i <=94 && i >=85){
            a.add(i.toString())
            a.add("Notable")
        }
        else if (i <=84 && i >=75){
            a.add(i.toString())
            a.add("Bueno")
        }
        else if (i <=74 && i >=70){
            a.add(i.toString())
            a.add("Suficiente")
        } else if (i<70){
            a.add(i.toString())
            a.add("Insuficiente")
        }
    }
    println(a)
}