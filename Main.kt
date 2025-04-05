fun main() {
    var saldo = 0.0

    while (true) {
        println("\n=== MENU DO CAIXA ELETRÔNICO ===")
        println("1. Depositar")
        println("2. Sacar")
        println("3. Consultar saldo")
        println("4. Sair")
        print("Escolha uma opção: ")

        when (readLine()?.toIntOrNull()) {
            1 -> {
                print("Digite o valor para depósito: ")
                val valor = readLine()?.toDoubleOrNull()
                if (valor != null && valor > 0) {
                    saldo += valor
                    println("✅ Depósito de R$ $valor realizado com sucesso!")
                } else {
                    println("❌ Valor inválido.")
                }
            }

            2 -> {
                print("Digite o valor para saque: ")
                val valor = readLine()?.toDoubleOrNull()
                if (valor != null && valor > 0) {
                    if (valor <= saldo) {
                        saldo -= valor
                        println("✅ Saque de R$ $valor realizado com sucesso!")
                    } else {
                        println("❌ Saldo insuficiente.")
                    }
                } else {
                    println("❌ Valor inválido.")
                }
            }

            3 -> {
                println("💰 Saldo atual: R$ $saldo")
            }

            4 -> {
                println("👋 Obrigado por usar o Caixa Eletrônico. Até mais!")
                break
            }

            else -> println("❌ Opção inválida. Tente novamente.")
        }
    }
}
