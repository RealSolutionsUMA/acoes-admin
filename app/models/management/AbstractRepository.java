package models.management;

import com.google.inject.ImplementedBy;
import models.entities.Sede;

import java.util.concurrent.CompletionStage;
import java.util.stream.Stream;

@ImplementedBy(JPASedeRepository.class)
public interface AbstractRepository<T> {

    CompletionStage<T> add(T sede);

    CompletionStage<Stream<T>> list();
}
