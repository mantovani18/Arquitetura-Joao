package Abstract_Factory;

public class Aplicacao {

    private final Botao botao;
    private final Input input;

    public Aplicacao(Factory factory) {
        this.botao = factory.criarBotao();
        this.input = factory.criarInput();
    }

    public void renderizar() {
        botao.renderizarBotao();
        input.renderizarInput();
    }
}