class Comisario(private val superior: Jurado) : Jurado() {
    private var mensaje: String? = null
    override fun evaluar(tipo: String, evento: String): String {
        if (tipo == "Infraccion") {

            suceso = "Se esta revisando la infraccion "
            mensaje = evento

        } else {
            return superior.evaluar(tipo, evento)

        }
        return suceso as String
    }
}