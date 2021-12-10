package sophos.test.interactions;

import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Interaction;
import sophos.test.userinterfaces.Work;

import java.util.ArrayList;
import java.util.List;

public class PrintWork implements Interaction {
      private  List<String> job;


      public  PrintWork (List<String> job) {
          this.job = job;
      }
    public static PrintWork printJobNames(List<String> job) {
        return new PrintWork(job);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        int size = Work.PRINT_WORK.resolveAllFor(actor).size();

        for (int i = 0; i < size; i++) {
            job.add(Work.PRINT_WORK.resolveAllFor(actor).get(i).getText());
        }

    }
}
