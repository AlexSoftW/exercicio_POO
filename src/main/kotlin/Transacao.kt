import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class Transacao(
    var operacao: Int,
    private val valor: Double
) {

    fun operacaoEscolhida() {
        when (this.operacao) {
            1 -> Debito(operacao = Operacao()).print()
            2 -> Credito(operacao = Operacao()).print()
            3 -> Tarja(operacao = Operacao()).print()
        }
    }

    fun notaFiscal() {
        val getDataHora =
            LocalDateTime.now().format(
                DateTimeFormatter.ofPattern(
                    "MMM dd yyyy, hh:mm"
                )
            )

        println(
            "Título: Compra aprovada com sucesso\n" +
                    "Valor da transação ${this.valor}\n" +
                    "Data e Hora da transação: $getDataHora"
        )
        operacaoEscolhida()
    }
}