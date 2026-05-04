/**

 2. Peça 4 notas (nota1, nota2, nota3, nota4) de  4 alunos (aluno1, aluno2, aluno3, aluno4), calcule a média final (mf) de cada um e exiba na tela a sua situação escolar:

       Média final >= 7 → Aprovado
       Média final entre 5 e 6.9 → Recuperação
       Média final < 5 → Reprovado
 **/

void main() {
    // Inicializa o contador que vai controlar o loop (de 1 a 4 alunos)
    int contador = 1;

    // Array com os nomes dos 4 alunos
    String[] alunos = {"Aluno 1", "Aluno 2", "Aluno 3", "Aluno 4"};

    // Estrutura do-while para processar cada aluno até o 4º
    do {
        // Exibe qual aluno está sendo processado
        IO.println("\n" + alunos[contador - 1]);

        // Lê a primeira nota do aluno
        float nota1 = Float.parseFloat(IO.readln("Digite a 1ª nota: "));

        // Lê a segunda nota do aluno
        float nota2 = Float.parseFloat(IO.readln("Digite a 2ª nota: "));

        // Lê a terceira nota do aluno
        float nota3 = Float.parseFloat(IO.readln("Digite a 3ª nota: "));

        // Lê a quarta nota do aluno
        float nota4 = Float.parseFloat(IO.readln("Digite a 4ª nota: "));

        // Calcula a média final: soma das 4 notas dividida por 4
        float media = (nota1 + nota2 + nota3 + nota4) / 4;

        // Variável para armazenar a situação escolar do aluno
        String situacao;

        // Estrutura if-else para determinar a situação escolar baseada na média final
        // Se a média for maior ou igual a 7: Aprovado
        if (media >= 7) {
            situacao = "Aprovado";
        }
        // Se a média for entre 5 e 6.9: Recuperação
        else if (media >= 5 && media < 7) {
            situacao = "Recuperação";
        }
        // Se a média for menor que 5: Reprovado
        else {
            situacao = "Reprovado";
        }

        // Exibe a média final do aluno formatada com 2 casas decimais
        IO.println(String.format("Média: %.2f", media));

        // Exibe a situação escolar (Aprovado, Recuperação ou Reprovado)
        IO.println("Situação: " + situacao);

        // Incrementa o contador para passar ao próximo aluno
        contador++;

        // Condição: continua o loop enquanto contador <= 4
    } while (contador <= 4);

}
