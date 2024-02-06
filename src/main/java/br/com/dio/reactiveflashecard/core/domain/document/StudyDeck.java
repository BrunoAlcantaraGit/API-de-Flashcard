package br.com.dio.reactiveflashecard.core.domain.document;

import lombok.Builder;

public record StudyDeck() {
    @Builder(toBuilder = true)
    public StudyDeck{}
}
