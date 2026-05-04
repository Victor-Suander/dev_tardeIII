/**

 3. O sistema de um caixa eletrônico de uma loja recebe produtos
 até digitar 0 para finalizar a compra.
 Durante a compra: somar os valores do produtos
 Após ser finalizada: Exibir na tela o valor total da compra.


 */


void main() {
    // Variável que armazena a soma total dos produtos
    double totalCompra = 0.0;

    // Loop que continua até o usuário digitar 0 para finalizar a compra
    while (true) {
        // Solicita ao usuário digitar o valor do produto (ou 0 para sair)
        double valorProduto = Double.parseDouble(IO.readln("Digite o valor do produto (0 para finalizar): R$ "));

        // Se o valor digitado é 0, finaliza o loop
        if (valorProduto == 0) {
            // Interrompe a execução do while
            break;
        }

        // Adiciona o valor do produto ao total da compra
        totalCompra += valorProduto;
    }

    // Exibe na tela o valor total da compra formatado com 2 casas decimais
    IO.println(String.format("Total da compra: R$ %.2f", totalCompra));
}