package br.com.dio.reactiveflashecard.core.mongo;


import br.com.dio.reactiveflashecard.core.mongo.converter.DateToOffsetDateTImeConverter;
import br.com.dio.reactiveflashecard.core.mongo.converter.OffsetDateTimeToDateConverter;
import org.springframework.core.convert.converter.Converter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.core.convert.MongoCustomConversions;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableMongoAuditing(dateTimeProviderRef = "dateTimeProviderRef")
public class MongoConfig {
    @Bean
    MongoCustomConversions mongoCustomConversions(){
        final List<Converter<?,?>> converter = new ArrayList<>();
        converter.add(new OffsetDateTimeToDateConverter());
        converter.add(new DateToOffsetDateTImeConverter());
        return new MongoCustomConversions(converter);
    }
}
