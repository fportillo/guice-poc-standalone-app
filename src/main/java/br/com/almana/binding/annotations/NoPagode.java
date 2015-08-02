package br.com.almana.binding.annotations;

import com.google.inject.BindingAnnotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;

@BindingAnnotation
@Target({ METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface NoPagode {
}
