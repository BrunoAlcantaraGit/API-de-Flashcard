package br.com.dio.reactiveflashecard.api.controller;

import br.com.dio.reactiveflashecard.api.controller.request.UserRequest;
import br.com.dio.reactiveflashecard.api.controller.response.UserResponse;
import br.com.dio.reactiveflashecard.api.mapper.UserMapper;
import br.com.dio.reactiveflashecard.core.domain.service.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Validated
@RestController
@RequestMapping("users")
@Slf4j
@AllArgsConstructor
public class UserController {

    private final UserService userService;
    private final UserMapper userMapper;

    @PostMapping(consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(CREATED)

    public Mono<UserResponse> save(@Valid @RequestBody final UserRequest request){
        return userService.save(userMapper.toDocument(request))
                .doFirst(()-> log.info("===Saving a user with follow date {}", request))
                .map(userMapper::toResponse);

    }
}
