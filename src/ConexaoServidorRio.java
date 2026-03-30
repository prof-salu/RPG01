public class ConexaoServidorRio {
    // ERRO: O sistema está instanciando várias conexões simultâneas com o servidor principal!
    public ConexaoServidorRio() {
        System.out.println("[REDE] Nova conexão pesada estabelecida com o servidor do Rio de Janeiro...");
    }

    public void sincronizarDados() {
        System.out.println("Dados sincronizados com o banco de dados do servidor.");
    }
}