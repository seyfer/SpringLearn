package seed.seyfer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import seed.seyfer.spring.Printer;

/**
 * Created by seyfer on 3/14/16.
 */
@Configuration
@ComponentScan
public class MainInt {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainInt.class);

        Printer printer = context.getBean(Printer.class);
        printer.printMessage();
    }
}
