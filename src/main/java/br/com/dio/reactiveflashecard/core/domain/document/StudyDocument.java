package br.com.dio.reactiveflashecard.core.domain.document;

import lombok.Builder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.OffsetDateTime;
import java.util.List;

@Document(collation = "studies")
public record StudyDocument(
        String id,
        String userId,
        StudyDeck studyDeck,
        List<Question> questions,
        @CreatedDate
        @Field("created_At")
        OffsetDateTime createdAt,
        @LastModifiedDate
        @Field("update_At")
        OffsetDateTime updatedAt
) {
    @Builder(toBuilder = true)
    public StudyDocument {
    }
}
