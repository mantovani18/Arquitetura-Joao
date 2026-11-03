package Factory_Method;

public class AplicacaoNotificacoes {

    private final FactoryNotificacoes factory;

    public AplicacaoNotificacoes(FactoryNotificacoes factory) {
        this.factory = factory;
    }

    public void enviar() {
        IntNotificacoes notificacao = factory.criarNotificacao();
        notificacao.enviar();
    }
}