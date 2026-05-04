/**

 4. Somar e exibir todos os múltiplos de 3 entre 1 e 100.

  */


void main() {
    // Variável que armazenará a soma de todos os múltiplos de 3 entre 1 e 100
    int soma = 0;

    // Loop for que itera de 1 até 100 (incrementando de 3 em 3 para
    // pegar apenas múltiplos)
    for (int i = 3; i <= 100; i += 3) {
        // Adiciona o múltiplo à soma total
        soma += i;
    }

    // Exibe na tela a soma de todos os múltiplos de 3 entre 1 e 100
    IO.println("Soma dos múltiplos de 3 entre 1 e 100: " + soma);
}