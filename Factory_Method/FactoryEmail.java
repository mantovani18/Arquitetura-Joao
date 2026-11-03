package Factory_Method;

public class FactoryEmail implements FactoryNotificacoes {
    @Override
    public IntNotificacoes criarNotificacao() {
        return new EnvioEmail();
    }
}
