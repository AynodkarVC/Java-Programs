package Spring.SpringEx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class LaunchTraining {
    public static void main(String args[]) throws Exception {
        ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\aynod\\Code\\Java Programs\\Assignment\\Spring\\SpringEx\\TrainingConfig.xml");
        Workshop trainingWorkshop = (Workshop) context.getBean("trainingWorkshop");
        trainingWorkshop.conductWorkshop();
    }
}
