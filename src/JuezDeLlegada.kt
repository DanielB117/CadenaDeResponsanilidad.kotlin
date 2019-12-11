class JuezDeLlegada(private val superior: Jurado) : Jurado() {
    private var mensaje: String? = null
    override fun evaluar(tipo: String, evento: String): String {
        if (tipo == "meta") {

            suceso = "Termina la carrera y se procedera a la premiacion"
            mensaje = evento

        } else {
            return superior.evaluar(tipo, evento)

        }
        return suceso as String
    }
}