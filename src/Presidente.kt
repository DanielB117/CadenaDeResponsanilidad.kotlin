class Presidente : Jurado() {
    private val mensaje: String? = null


    override fun evaluar(tipo: String, evento: String): String {
        suceso = "El problema se evaluara de inmediato"
        return suceso as String
    }
}