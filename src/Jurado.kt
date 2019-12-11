abstract class Jurado {
    protected var suceso: String? = null

    abstract fun evaluar(tipo: String, evento: String): String

}