package br.com.dio.reactiveflashecard.api.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

public record UserRequest(
        @JsonProperty("name")
        String name,
        @JsonProperty("email")
        String email
) {
    @Builder(toBuilder = true)
    public UserRequest{}
}