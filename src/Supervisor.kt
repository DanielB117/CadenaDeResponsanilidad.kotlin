class Supervisor(private val superior: Jurado) : Jurado() {
    private var mensaje: String? = null
    override fun evaluar(tipo: String, evento: String): String {
        if (tipo == "herido") {

            suceso = "en camino con ayuda medica"
            mensaje = evento

        } else {
            return superior.evaluar(tipo, evento)

        }
        return suceso as String
    }
}