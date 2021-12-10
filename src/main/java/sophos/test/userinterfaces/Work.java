package sophos.test.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class Work {

    public static final Target POP_UP = Target.the("Click pop up").
            located(By.id("sg-popup-content-wrapper-5998"));
    public static final Target WORK_ENTER = Target.the("Enter work").
            locatedBy("(//*/a[@class='mega-menu-link'])[5]");
    public static final Target PRINT_WORK = Target.the("print work").
            locatedBy("//*/h3[@class=contains(text(),\"\")]/a");
    public  static  final Target TEXT = Target.the("Text").
            locatedBy("(//*/div [@class=\"premium-blog-post-content\"])");
    public  static  final Target JOB = Target.the("Job").
            locatedBy("(//*/input[@class=\"field\"])");


}
