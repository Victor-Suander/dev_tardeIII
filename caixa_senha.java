/**

 1. Um caixa eletrônico permite 3 tentativas para digitar a senha correta (4321).
      Caso erre 3 vezes, a conta será bloqueada.

      Resultado Esperado:
      Se acertar exibir na tela 'acesso liberado'
      Se errar 3 vezes exibir na tela 'conta bloqueada'
*/

import static java.lang.IO.readln;

void main() {
    // Contador de tentativas de acesso
    int tentativas = 0;

    // Flag para controlar se o usuário foi autenticado com sucesso
    boolean autenticado = false;

    // Loop do-while que executa até autenticar ou exceder 3 tentativas
    do {
        // Solicita o nome de usuário
        IO.print("Usuário: ");
        String user = readln();

        // Solicita a senha
        IO.print("Senha: ");
        String password = readln();

        // Verifica se o usuário é "admin" e a senha é "4321"
        if (user.equals("admin") && password.equals("4321")) {
            // Se credenciais corretas, marca como autenticado
            autenticado = true;
            // Exibe mensagem de sucesso
            IO.println("acesso liberado");
        } else {
            // Se credenciais incorretas, incrementa o contador de tentativas
            tentativas++;
            // Exibe mensagem de erro
            IO.println("senha incorreta");
        }

    // Continua o loop enquanto não autenticou E o número de tentativas é menor que 3
    } while (!autenticado && tentativas < 3);

    // Após sair do loop, verifica se o usuário não foi autenticado
    if (!autenticado) {
        // Se não autenticou após 3 tentativas, bloqueia a conta
        IO.println("conta bloqueada");
    }
}