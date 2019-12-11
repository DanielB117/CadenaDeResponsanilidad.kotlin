object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val mesaJurado = MesaJurado()

        println(mesaJurado.evaluar("", "Se cae un puente y no permite el paso"))
    }
}