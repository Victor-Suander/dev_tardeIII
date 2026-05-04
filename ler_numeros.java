/**
 5. Ler dez números e exibir na tela:
 a soma destes números;
 a média destes números;
 o maior número lido;
 o menor número lido;
 a soma de todos os números pares lidos;
 a soma de todos os números ímpares lidos;
 o número de ímpares;
 o número de pares.

 */


void main() {
    // Array para armazenar os 10 números lidos
    int[] numeros = new int[10];

    // Variáveis para armazenar os resultados das operações
    int soma = 0;              // Armazenará a soma total dos 10 números
    int somaPares = 0;         // Armazenará a soma dos números pares
    int somaImpares = 0;       // Armazenará a soma dos números ímpares
    int contadorPares = 0;     // Contará quantos números pares foram lidos
    int contadorImpares = 0;   // Contará quantos números ímpares foram lidos
    int maiorNumero = Integer.MIN_VALUE;  // Armazenará o maior número
    int menorNumero = Integer.MAX_VALUE;  // Armazenará o menor número

    // Loop for que lê 10 números
    for (int i = 0; i < 10; i++) {
        // Lê um número do usuário e armazena no array
        numeros[i] = Integer.parseInt(IO.readln("Digite o " + (i + 1) + "º número: "));

        // Adiciona o número à soma total
        soma += numeros[i];

        // Verifica se o número é par (resto da divisão por 2 é zero)
        if (numeros[i] % 2 == 0) {
            // Se for par, adiciona à soma de pares
            somaPares += numeros[i];
            // Incrementa o contador de pares
            contadorPares++;
        } else {
            // Se não for par, é ímpar, então adiciona à soma de ímpares
            somaImpares += numeros[i];
            // Incrementa o contador de ímpares
            contadorImpares++;
        }

        // Verifica se o número lido é maior que o maior número armazenado
        if (numeros[i] > maiorNumero) {
            // Se for, atualiza o maior número
            maiorNumero = numeros[i];
        }

        // Verifica se o número lido é menor que o menor número armazenado
        if (numeros[i] < menorNumero) {
            // Se for, atualiza o menor número
            menorNumero = numeros[i];
        }
    }

    // Calcula a média dos 10 números
    double media = soma / 10.0;

    // Exibe todos os resultados na tela
    IO.println("\n===== RESULTADOS =====");
    IO.println("Soma de todos os números: " + soma);
    IO.println("Média dos números: " + media);
    IO.println("Maior número: " + maiorNumero);
    IO.println("Menor número: " + menorNumero);
    IO.println("Soma dos números pares: " + somaPares);
    IO.println("Soma dos números ímpares: " + somaImpares);
    IO.println("Quantidade de números ímpares: " + contadorImpares);
    IO.println("Quantidade de números pares: " + contadorPares);
}