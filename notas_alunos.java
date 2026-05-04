/** 2. Peça 4 notas (nota1, nota2, nota3, nota4) de  4 alunos (aluno1, aluno2, aluno3, aluno4), calcule a média final (mf) de cada um e exiba na tela a sua situação escolar:

       Média final >= 7 → Aprovado
       Média final entre 5 e 6.9 → Recuperação
       Média final < 5 → Reprovado
 **/

void main() {
    int contador = 1;
    String[] alunos = {"Aluno 1", "Aluno 2", "Aluno 3", "Aluno 4"};

    do {
        if (contador > 0) {IO.print(String.format("%nAluno: %s%n", alunos[contador -1]));}

    float n1 = Float.parseFloat(IO.readln("Digite a 1ª nota: "));
    float n2 = Float.parseFloat(IO.readln("Digite a 2ª nota: "));
    float n3 = Float.parseFloat(IO.readln("Digite a 3ª nota: "));
    float n4 = Float.parseFloat(IO.readln("Digite a 4ª nota : "));

    float media = (n1 + n2 + n3 + n4) / 4;

    char notas;
    if (media >= 9.0) {
        notas = 'A';
    } else if (media >= 7.5) {
        notas = 'B';
    } else if (media >= 6.0) {
        notas = 'C';
    } else if (media >= 4.0) {
        notas = 'D';
    } else {
        notas = 'E';
    }
    String situacao = (notas == 'A' || notas == 'B' || notas == 'C') ? "APROVADO" : "REPROVADO";

    IO.print(String.format("%nAluno: %s%n", alunos[contador -1]));
    IO.print(String.format("Notas: %.1f | %.1f | %.1f | %.1f%n", n1, n2, n3, n4));
    IO.print(String.format("Média final : %.2f%n", media));
    IO.print(String.format("Conceito    : %c%n", notas));
    IO.print(String.format("Situação    : %s%n", situacao));

    contador++;
    } while (contador <= 4);

}
