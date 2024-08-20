class Operaciones (var n1:Double, var n2:Double){

    fun suma(){
        var rtaSuma =  n1 + n2
        println("La suma es: $rtaSuma")
    }
    fun resta() : Double{
        return n1 - n2
    }
    fun multiplicacion(n1: Double, n2: Double) {
        println("La multiplicacion es: ${n1 * n2}")
    }
    fun division(n1: Double, n2: Double): Double {
        return n1 / n2
    }

    override fun toString(): String {
        return "Operaciones(n1=$n1, n2=$n2)"
    }

}