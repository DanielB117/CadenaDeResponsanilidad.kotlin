class MesaJurado : Jurado() {
    private var superior: Jurado? = null

    override fun evaluar(tipo: String, evento: String): String {
        val presidente = Presidente()
        val comisario = Comisario(presidente)
        val juezdellegada = JuezDeLlegada(comisario)
        val supervisor = Supervisor(juezdellegada)
        superior = supervisor
        return superior!!.evaluar(tipo, evento)

    }
}