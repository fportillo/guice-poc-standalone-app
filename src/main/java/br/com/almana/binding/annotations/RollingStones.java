package br.com.almana.binding.annotations;

import com.google.inject.BindingAnnotation;

import static java.lang.annotation.ElementType.*;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@BindingAnnotation
@Target({ FIELD, PARAMETER, METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface RollingStones {
}
