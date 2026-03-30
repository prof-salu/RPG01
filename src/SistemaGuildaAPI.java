public class SistemaGuildaAPI {
    // ERRO: O nosso jogo espera chamar um método simples 'adicionarMembro(nome)',
    // mas essa API externa herdada exige o nome do servidor junto e usa inglês.
    public void addPlayerToGuildLegacy(String serverName, String playerName) {
        System.out.println("[API Antiga] " + playerName + " adicionado à guilda no servidor " + serverName);
    }
}