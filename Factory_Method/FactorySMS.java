package Factory_Method;

public class FactorySMS implements FactoryNotificacoes {
    @Override
    public IntNotificacoes criarNotificacao() {
        return new EnvioSMS();
    }
}
