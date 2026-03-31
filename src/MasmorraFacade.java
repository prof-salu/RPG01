public class MasmorraFacade {
    private MotorDeAudio audio;
    private CarregadorDeCenario cenario;
    private GeradorDeMonstros monstros;

    public MasmorraFacade() {
        this.audio = new MotorDeAudio();
        this.cenario = new CarregadorDeCenario();
        this.monstros = new GeradorDeMonstros();
    }

    public void iniciarMasmorra() {
        System.out.println("--- Iniciando Masmorra ---");
        audio.tocarMusica("boss_theme.mp3");
        cenario.carregar("Caverna do Dragão");
        monstros.invocar(10);
    }
}