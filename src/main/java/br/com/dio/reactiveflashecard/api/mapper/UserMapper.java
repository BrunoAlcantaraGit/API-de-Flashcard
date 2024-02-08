package br.com.dio.reactiveflashecard.api.mapper;


import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public @interface UserMapper {
    String componentModel();
}
