/**

 7. Desenvolver um aplicativo para um caixa eletrônico
 com saldo inicial de R$ 500,00 com as seguintes opções:

 1 Saque
 2 Depósito
 3 Saldo
 0 Sair

 Repetir até sair.

 Regras do negócio:
 Não sacar valor maior que o saldo
 Valor inválido não permitido (ex: -10)

 **/


void main() {
    // Saldo inicial da conta em reais
    double saldo = 500.0;

    // Opção escolhida pelo usuário no menu
    int opcao;

    // Loop do-while para exibir o menu e processar operações repetidamente
    do {
        // Exibe o menu de opções
        IO.println("\n===== CAIXA ELETRÔNICO =====");
        IO.println("1 - Saque");
        IO.println("2 - Depósito");
        IO.println("3 - Saldo");
        IO.println("0 - Sair");
        IO.println("===========================");

        // Lê a opção escolhida pelo usuário
        opcao = Integer.parseInt(IO.readln("Escolha uma opção: "));

        // Estrutura if-else para processar cada opção do menu
        if (opcao == 1) {
            // OPÇÃO 1: SAQUE
            // Solicita ao usuário o valor que deseja sacar
            double valorSaque = Double.parseDouble(IO.readln("\nDigite o valor do saque: R$ "));

            // Verifica se o valor de saque é negativo ou zero (valor inválido)
            if (valorSaque <= 0) {
                // Exibe mensagem de erro para valor inválido
                IO.println("Erro: Valor inválido! Digite um valor positivo.");
            }
            // Verifica se o valor de saque é maior que o saldo disponível
            else if (valorSaque > saldo) {
                // Exibe mensagem de erro - saldo insuficiente
                IO.println("Erro: Saldo insuficiente! Seu saldo é R$ " + saldo);
            }
            // Se passou nas verificações, realiza o saque
            else {
                // Subtrai o valor sacado do saldo
                saldo -= valorSaque;
                // Exibe mensagem de sucesso com o novo saldo
                IO.println("Saque realizado com sucesso! Novo saldo: R$ " + saldo);
            }
        }
        // Se a opção escolhida foi 2 (Depósito)
        else if (opcao == 2) {
            // OPÇÃO 2: DEPÓSITO
            // Solicita ao usuário o valor que deseja depositar
            double valorDeposito = Double.parseDouble(IO.readln("\nDigite o valor do depósito: R$ "));

            // Verifica se o valor de depósito é negativo ou zero (valor inválido)
            if (valorDeposito <= 0) {
                // Exibe mensagem de erro para valor inválido
                IO.println("Erro: Valor inválido! Digite um valor positivo.");
            }
            // Se passou na verificação, realiza o depósito
            else {
                // Adiciona o valor depositado ao saldo
                saldo += valorDeposito;
                // Exibe mensagem de sucesso com o novo saldo
                IO.println("Depósito realizado com sucesso! Novo saldo: R$ " + saldo);
            }
        }
        // Se a opção escolhida foi 3 (Saldo)
        else if (opcao == 3) {
            // OPÇÃO 3: VER SALDO
            // Exibe o saldo atual da conta
            IO.println("\nSeu saldo atual é: R$ " + saldo);
        }
        // Se a opção escolhida foi 0 (Sair)
        else if (opcao == 0) {
            // OPÇÃO 0: SAIR
            // Exibe mensagem de despedida
            IO.println("\nObrigado por usar nosso caixa eletrônico!");
        }
        // Se a opção não é nenhuma das válidas (0, 1, 2, 3)
        else {
            // Exibe mensagem de erro - opção inválida
            IO.println("Erro: Opção inválida! Digite uma opção válida (0, 1, 2 ou 3).");
        }

    // Continua o loop enquanto a opção não for 0 (sair)
    } while (opcao != 0);
}