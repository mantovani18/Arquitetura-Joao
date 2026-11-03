package Factory_Method;

public class Main {
    public static void main(String[] args) {
        new AplicacaoNotificacoes(new FactoryEmail()).enviar();
        new AplicacaoNotificacoes(new FactorySMS()).enviar();
    }
}
