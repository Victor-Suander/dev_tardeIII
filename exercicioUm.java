/**1. Um caixa eletrônico permite 3 tentativas para digitar a senha correta (4321).
      Caso erre 3 vezes, a conta será bloqueada.

      Resultado Esperado:
      Se acertar exibir na tela 'acesso liberado'
      Se errar 3 vezes exibir na tela 'conta bloqueada'
*/

import static java.lang.IO.readln;

void main() {
    int tentativas = 0;
    boolean autenticado = false;

    do {
        IO.print("Usuário: ");
        String user = readln();

        IO.print("Senha: ");
        String password = readln();

        // Verifica se as credenciais estão corretas
        if (user.equals("admin") && password.equals("4321")) {
            autenticado = true;
            IO.println("acesso liberado");
        } else {
            tentativas++;
            IO.println("senha incorreta");
        }
    } while (!autenticado && tentativas < 3);

    // Se não autenticou após 3 tentativas, bloqueia a conta
    if (!autenticado) {
        IO.println("conta bloqueada");
    }
}