package quoters;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * @author Ben Novikov on December 2017
 */
@ComponentScan
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
//        while (true) {
//            Thread.sleep(500);
//            context.getBean(Quoter.class).sayQuote();
//        }
    }
}
