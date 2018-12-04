package models.management;

import models.entities.Sede;
import play.db.jpa.JPAApi;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.stream.Stream;

import static java.util.concurrent.CompletableFuture.supplyAsync;

public class JPASedeRepositoryImpl extends JPAAbstractRepository<Sede> {

    @Inject
    public JPASedeRepositoryImpl(JPAApi jpaApi, DatabaseExecutionContext executionContext) {
        super(jpaApi, executionContext);
    }

    @Override
    public CompletionStage<Stream<Sede>> list() {
        return supplyAsync(() -> wrap(this::list), executionContext);
    }

    public Stream<Sede> list(EntityManager em) {
        List<Sede> sedes = em.createNamedQuery("Sede.findAll", Sede.class).getResultList();
        return sedes.stream();
    }
}
