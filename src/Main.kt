
fun main() {

    var n1Teclado : Double
    var n2Teclado : Double

    println("Digite el primer numero")
    n1Teclado = readln().toDouble()
    println("Digite el segundo numero")
    n2Teclado = readln().toDouble()

    val op = Operaciones(n1Teclado, n2Teclado)
    op.suma()
    println("La resta es: ${op.resta()}")
    println(op.multiplicacion(n1Teclado, n2Teclado))
    println("La division es: ${op.division(n1Teclado, n2Teclado)}")

}