package models.management;

import play.db.jpa.JPAApi;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.concurrent.CompletionStage;
import java.util.function.Function;

import static java.util.concurrent.CompletableFuture.supplyAsync;

public abstract class JPAAbstractRepository<T> implements AbstractRepository<T> {
    private final JPAApi jpaApi;
    final DatabaseExecutionContext executionContext;

    @Inject
    public JPAAbstractRepository(JPAApi jpaApi, DatabaseExecutionContext executionContext) {
        this.jpaApi = jpaApi;
        this.executionContext = executionContext;
    }

    @Override
    public CompletionStage<T> add(T entity) {
        return supplyAsync(() -> wrap(em -> insert(em, entity)), executionContext);
    }

    @Override
    public CompletionStage<T> delete(T entity) {
        return supplyAsync(() -> wrap(em -> remove(em, entity)), executionContext);
    }

    @Override
    public CompletionStage<T> update(T entity) {
        return null;
    }

    <U> U wrap(Function<EntityManager, U> function) {
        return jpaApi.withTransaction(function);
    }

    private T insert(EntityManager em, T entity) {
        em.persist(entity);
        return entity;
    }

    private T remove(EntityManager em, T entity) {
        em.remove(entity);
        return entity;
    }
}
