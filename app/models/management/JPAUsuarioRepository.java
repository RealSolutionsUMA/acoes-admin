package models.management;

import models.ResultHelpers.JpaResultHelper;
import models.entities.Sede;
import models.entities.Usuario;
import play.db.jpa.JPAApi;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.stream.Stream;

import static java.util.concurrent.CompletableFuture.supplyAsync;

public class JPAUsuarioRepository extends JPAAbstractRepository<Usuario> {
    @Inject
    public JPAUsuarioRepository(JPAApi jpaApi, DatabaseExecutionContext executionContext) {
        super(jpaApi, executionContext);
    }

    @Override
    public CompletionStage<Stream<Usuario>> list() {
        return supplyAsync(() -> wrap(this::list), executionContext);
    }

    public CompletionStage<Usuario> findByEmail(String email){
        return supplyAsync(() -> wrap(em -> findByEmail(email, em)), executionContext);
    }

    private Stream<Usuario> list(EntityManager em) {
        List<Usuario> usuarios = em.createNamedQuery("Usuario.findAll", Usuario.class).getResultList();
        return usuarios.stream();
    }

    private Usuario findByEmail(String email, EntityManager em) {
        return (Usuario) JpaResultHelper.getSingleResultOrNull
              (
                    em.createNamedQuery("Usuario.findByEmail", Usuario.class)
                          .setParameter("email", email)
              );
    }
}
