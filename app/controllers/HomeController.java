package controllers;

import models.entities.Sede;
import models.management.JPASedeRepository;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.hello;
import views.html.index;

import javax.inject.Inject;

import java.util.concurrent.CompletionStage;

import static play.libs.Json.toJson;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    private final JPASedeRepository sedeRepository;
    private final HttpExecutionContext ec;

    @Inject
    public HomeController(JPASedeRepository sedeRepository, HttpExecutionContext ec){
        this.sedeRepository = sedeRepository;
        this.ec = ec;
    }
    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public Result hello() {
        return ok(hello.render());
    }

    public CompletionStage<Result> newSede() {
        Sede sede = new Sede();
        sede.setRegion(Sede.Region.Espana);
        return sedeRepository.add(sede)
              .thenApplyAsync(s -> ok(toJson(s)), ec.current());
    }
}
