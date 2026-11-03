package Abstract_Factory;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.function.Supplier;

public class FactoryRegistry {

    private final Map<String, Supplier<Factory>> factories = new HashMap<>();

    public void registrar(String plataforma, Supplier<Factory> criador) {
        factories.put(normalizar(plataforma), criador);
    }

    public Factory obterFactory(String plataforma) {
        Supplier<Factory> criador = factories.get(normalizar(plataforma));

        return java.util.Objects.requireNonNull(
                criador,
                "Plataforma não registrada: " + plataforma
        ).get();
    }

    private String normalizar(String plataforma) {
        return plataforma.toLowerCase(Locale.ROOT);
    }
}