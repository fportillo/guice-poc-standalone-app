package br.com.almana;

import br.com.almana.binding.annotations.RollingStones;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;
import com.google.inject.name.Named;

/**
 * Created by francisco on 8/1/15.
 */
public class GuiceHelloWorld {

    @Inject
    private Provider<ComplexObject> provider;

    private RockPhrase rockPhrase;
    private RockPhrase annotatedRockPhrase;
    private RockPhrase anotherPhrase;
    private ComplexObject reallyComplex;

    @Inject public GuiceHelloWorld(RockPhrase rockPhrase,
                    @RollingStones RockPhrase annotatedRockPhrase,
                    @Named("Pink Floyd") RockPhrase anotherPhrase,
                    ComplexObject reallyComplex) {
        this.rockPhrase = rockPhrase;
        this.annotatedRockPhrase = annotatedRockPhrase;
        this.anotherPhrase = anotherPhrase;
        this.reallyComplex = reallyComplex;
    }

    public String rockit() {
        return rockPhrase.quote();
    }

    public String annotateThis() {
        return annotatedRockPhrase.quote();
    }

    public String anotherPhrase() {
        return anotherPhrase.quote();
    }

    public String doComplexStuff() {
        return reallyComplex.pretend();
    }

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new GuicePocModule());
        GuiceHelloWorld guiceHelloWorld = injector.getInstance(GuiceHelloWorld.class);

        Params params = injector.getInstance(Params.class);

        // classic binding
        System.out.println("Classic phrase:" + guiceHelloWorld.rockit());

        // annotated binding
        System.out.println("Annotate this: " + guiceHelloWorld.annotateThis());

        // Default @Named binding. Not type safe!!!
        System.out.println("Another: " + guiceHelloWorld.anotherPhrase());

        // String and Integer binding examples
        System.out.println(String.format("Params: jdbc url => %s, containerPort => %d", params.getJdbcUrl(), params.getContainerPort()));

        // @Provides annotation in module class
        System.out.println("Complex output: " + guiceHelloWorld.doComplexStuff());
    }
}
