package Abstract_Factory;

public class Main {
    public static void main(String[] args) {
        FactoryRegistry registry = new FactoryRegistry();
        registry.registrar("android", FactoryANDROID::new);
        registry.registrar("ios", FactoryIOS::new);

        Factory factory = registry.obterFactory("ANDROID");

        Aplicacao app = new Aplicacao(factory);

        app.renderizar();
    }
}