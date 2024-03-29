package br.com.dio.reactiveflashecard.core.domain.document;

import lombok.Builder;

import java.util.Set;

public record StudyDeck(

        String deckId,
        Set<StudyCard> cards) {
    @Builder(toBuilder = true)
    public StudyDeck{}
}
