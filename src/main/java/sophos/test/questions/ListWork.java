package sophos.test.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

public class ListWork implements Question {

    private List<String> job;

    public ListWork  (List<String> job) {
        this.job = job;
    }
    public  static  ListWork print (List<String> job){
        return  new ListWork(job);
    }
    @Override
    public Object answeredBy(Actor actor) {

        for (int i = 0; i < job.size() ; i++) {

            System.out.println(job.get(i));

        }
        return true;
    }
}
