package models.management;

import com.google.inject.ImplementedBy;
import models.entities.Sede;

import java.util.concurrent.CompletionStage;
import java.util.stream.Stream;

public interface AbstractRepository<T> {

    CompletionStage<T> add(T entity);

    CompletionStage<T> delete(T entity);

    CompletionStage<T> update(T entity);

    CompletionStage<Stream<T>> list();
}
