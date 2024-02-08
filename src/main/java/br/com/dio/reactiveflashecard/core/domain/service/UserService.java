package br.com.dio.reactiveflashecard.core.domain.service;

import br.com.dio.reactiveflashecard.core.domain.document.UserDocument;
import br.com.dio.reactiveflashecard.core.domain.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.experimental.NonFinal;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;


@AllArgsConstructor
@Slf4j
@Service
public class UserService {
    @Autowired
    private final UserRepository userRepository;

    public Mono<UserDocument>sava( final UserDocument document){
        return userRepository.save(document)
                .doFirst(()->log.info("==try to save follow document {}",document));//Retorna log de persistência na operação
    }
}
