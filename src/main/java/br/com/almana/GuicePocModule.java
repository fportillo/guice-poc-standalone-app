package br.com.almana;

import br.com.almana.binding.annotations.JdbcUrl;
import br.com.almana.binding.annotations.RollingStones;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Names;

public class GuicePocModule extends AbstractModule {

    @Override protected void configure() {
        // Classic binding example
        bind(RockPhrase.class).to(Champions.class);

        // Bindind annotation example
        bind(RockPhrase.class).annotatedWith(RollingStones.class).to(Satisfaction.class);

        // Default annotation by Guice
        bind(RockPhrase.class).annotatedWith(Names.named("Pink Floyd")).to(TheWall.class);

        // Binding to fixed prop values
        bind(String.class).annotatedWith(JdbcUrl.class).toInstance("jdbc:mysql://localhost/rocknroll");
        bind(Integer.class).annotatedWith(Names.named("containerPort")).toInstance(8080);
    }

    @Provides
    ComplexObject provideComplexObject() {
        return new ComplexObject();
    }
}
