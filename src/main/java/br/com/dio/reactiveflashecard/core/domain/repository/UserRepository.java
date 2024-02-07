package br.com.dio.reactiveflashecard.core.domain.repository;

import br.com.dio.reactiveflashecard.core.domain.document.UserDocument;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface UserRepository extends ReactiveMongoRepository<UserDocument,String> {
}
