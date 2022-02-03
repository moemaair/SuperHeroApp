import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class App{

    public static void main(String[] args) {

        ProcessBuilder process = new ProcessBuilder();
        Integer port;
        if (process.environment().get("PORT") != null) {
            port = Integer.parseInt(process.environment().get("PORT"));
        } else {
            port = 4567;
        }

        port(port);

        staticFileLocation("/public");


        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "form.hbs");
        },new HandlebarsTemplateEngine());


        post("/getSquad/new", (request, response) -> { //URL to make new post on POST route
            Map<String, Object> model = new HashMap<String, Object>();
            String name = request.queryParams("name");
            String cause = request.queryParams("cause");
            int maxMembers = Integer.parseInt(request.queryParams("maxMembers"));
            Squad squad = new Squad(name, cause, maxMembers);
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());



        get("squad", (request, response) -> { // URL to show the post form data of squad generated
            Map<String, Object> model = new HashMap<>();
            ArrayList<Squad> teams = Squad.getInstances();
            model.put("teams", teams);
            return new ModelAndView(model, "squadList.hbs");
        }, new HandlebarsTemplateEngine());

        get("/hero/form", (request, response)->{
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "heroForm.hbs");
        },new HandlebarsTemplateEngine());

        post("/getHero/new", (request, response) -> { //URL to make new post on POST route
            Map<String, Object> model = new HashMap<String, Object>();
            String name = request.queryParams("name");
            int age = Integer.parseInt(request.queryParams("age"));
            String specialPower = request.queryParams("specialPower");
            String weakness = request.queryParams("weakness");
            Hero squad = new Hero(name, age, specialPower, weakness);
            return new ModelAndView(model, "successhero.hbs");
        }, new HandlebarsTemplateEngine());

        get("hero", (request, response) -> { // URL to show the post form data of squad generated
            Map<String, Object> model = new HashMap<>();
            ArrayList<Hero> hero = Hero.all();
            model.put("heros", hero);
            return new ModelAndView(model, "heroList.hbs");
        }, new HandlebarsTemplateEngine());











    }
}