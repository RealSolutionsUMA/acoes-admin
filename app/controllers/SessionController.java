package controllers;

import models.entities.Usuario;
import models.management.JPAUsuarioRepository;
import play.data.Form;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Action;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.login;

import javax.inject.Inject;

public class SessionController extends Controller {

    private final FormFactory formFactory;
    private final JPAUsuarioRepository usuarioRepository;
    private final HttpExecutionContext ec;

    @Inject
    public SessionController(FormFactory formFactory, JPAUsuarioRepository usuarioRepository, HttpExecutionContext ec){
        this.formFactory = formFactory;
        this.usuarioRepository = usuarioRepository;
        this.ec = ec;
    }

    public Result index(){
        Form<Usuario> userForm = formFactory.form(Usuario.class);
        return ok(login.render(userForm));
    }

    public Result login(){
        Usuario usuario = formFactory.form(Usuario.class).bindFromRequest("email", "password").get();
        Usuario databaseUser = usuarioRepository.findByEmail(usuario.getEmail())
              .thenApplyAsync(u -> u, ec);
    }
}
