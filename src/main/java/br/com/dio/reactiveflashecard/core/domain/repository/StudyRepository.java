package br.com.dio.reactiveflashecard.core.domain.repository;

import br.com.dio.reactiveflashecard.core.domain.document.StudyDocument;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface StudyRepository extends ReactiveMongoRepository<StudyDocument,String> {
}
