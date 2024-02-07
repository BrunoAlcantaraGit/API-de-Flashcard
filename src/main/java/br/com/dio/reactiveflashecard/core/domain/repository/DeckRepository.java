package br.com.dio.reactiveflashecard.core.domain.repository;

import br.com.dio.reactiveflashecard.core.domain.document.DeckDocument;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface DeckRepository extends ReactiveMongoRepository<DeckDocument,String> {
}
