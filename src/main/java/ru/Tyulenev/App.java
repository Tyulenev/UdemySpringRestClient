package ru.Tyulenev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.Tyulenev.Configuration.MyConfig;


public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication"
                , Communication.class);

        communication.showAllQueues();
        communication.getAllTickets();

    }

}
