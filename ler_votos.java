/**

 6. Ler dez votos e exibir na tela o resultado
 da eleição para os seguintes candidatos:

 1 = João
 2 = Maria
 outro = nulo

 Exibir na tela quem venceu a eleição.
 **/

void main() {
    // Contadores para armazenar os votos de cada candidato
    int votosJoao = 0;     // Armazenará a quantidade de votos para João (voto = 1)
    int votosMaria = 0;    // Armazenará a quantidade de votos para Maria (voto = 2)
    int votosNulo = 0;     // Armazenará a quantidade de votos nulos (qualquer outro valor)

    // Loop for que lê 10 votos
    for (int i = 0; i < 10; i++) {
        // Lê o voto do eleitor
        int voto = Integer.parseInt(IO.readln("Eleitor " + (i + 1) + ": Digite 1 (João) ou 2 (Maria): "));

        // Verifica se o voto é para João (1)
        if (voto == 1) {
            // Incrementa o contador de votos para João
            votosJoao++;
        }
        // Verifica se o voto é para Maria (2)
        else if (voto == 2) {
            // Incrementa o contador de votos para Maria
            votosMaria++;
        }
        // Se não for 1 ou 2, é um voto nulo
        else {
            // Incrementa o contador de votos nulos
            votosNulo++;
        }
    }

    // Exibe os resultados da eleição
    IO.println("\n===== RESULTADO DA ELEIÇÃO =====");
    IO.println("João: " + votosJoao + " votos");
    IO.println("Maria: " + votosMaria + " votos");
    IO.println("Nulo: " + votosNulo + " votos");

    // Determina o vencedor da eleição
    IO.println("\n===== VENCEDOR =====");

    // Verifica se os votos são iguais (empate)
    if (votosJoao == votosMaria) {
        // Se há empate, exibe mensagem de empate
        IO.println("EMPATE! João e Maria ficaram empatados.");
    }
    // Verifica se João tem mais votos que Maria
    else if (votosJoao > votosMaria) {
        // Se João tem mais votos, ele venceu
        IO.println("VENCEDOR: João");
    }
    // Caso contrário, Maria tem mais votos
    else {
        // Se Maria tem mais votos, ela venceu
        IO.println("VENCEDOR: Maria");
    }
}