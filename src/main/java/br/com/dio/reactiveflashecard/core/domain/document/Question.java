package br.com.dio.reactiveflashecard.core.domain.document;

public record Question(
        String asked,
        String answered,
        String expected
) {
}
