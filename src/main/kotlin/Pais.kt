class Pais(val paisOrigem: String) {
    fun validarPais() {
        if (this.paisOrigem == "Brasil" || this.paisOrigem == "Argentina") {

            println("Informe o valor da transação: R$")
            val valorTransacao = readLine()!!.toDouble()

            println("Informe o tipo de transação: 1 - Débito | 2 - Crédito | 3 - Tarja")
            val tipoTransacao = readLine()!!.toInt()

            val userTransaction = Transacao(
                operacao = validarTarja(
                    this.paisOrigem, tipoTransacao
                ), valor = valorTransacao
            )
            userTransaction.notaFiscal()
        } else {
            println("Sistema inválido no seu país!")
        }
    }

    fun validarTarja(pais: String, tipo: Int): Int {
        if (pais == "Argentina" && tipo == 3) {
            println("Informe o seu CVV | DNI")
            val cvvDni = readLine().toString()
            return tipo
        } else {
            var verificadorOperacao = tipo

            while (verificadorOperacao == 3) {
                println("Opção inválida pro seu país, tente outra opção!")
                verificadorOperacao = readLine()!!.toInt()
            }
            return verificadorOperacao
        }
    }
}