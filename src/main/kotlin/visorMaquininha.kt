fun visorMaquininha() {
    println("Olá, informe o seu país de origem")
    val paisOrigem = readLine().toString()

    val userPais = Pais(paisOrigem = paisOrigem)
    userPais.validarPais()
}