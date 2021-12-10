package sophos.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.questions.Text;
import org.openqa.selenium.Keys;
import sophos.test.interactions.PrintWork;
import sophos.test.userinterfaces.Work;

import java.security.Principal;
import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class WorkWithUs implements Task {

    private List<String> job;
    private String work1;
    private String work2;

    public  WorkWithUs (List<String> job,String work1,String work2) {
        this.job = job;
        this.work1 = work1;
        this.work2 = work2;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(Work.POP_UP),
                Click.on(Work.WORK_ENTER),
                PrintWork.printJobNames(job)
        );
        int size = Work.TEXT.resolveAllFor(actor).size();

        for (int i = 0; i < size; i++) {
            System.out.println(Work.TEXT.resolveAllFor(actor).get(i).getText());
        }
        actor.attemptsTo(
                Click.on(Work.JOB), Enter.theValue(work1).into(Work.JOB), Hit.the(Keys.ENTER).into(Work.JOB),
                Click.on(Work.JOB), Enter.theValue(work2).into(Work.JOB), Hit.the(Keys.ENTER).into(Work.JOB)
        );

    }
    public static WorkWithUs WorkWithUs( List<String> job,String work1, String work2)
    {
        return instrumented(WorkWithUs.class,job,work1,work2);
    }
}
