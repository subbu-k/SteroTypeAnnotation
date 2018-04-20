import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sm.cab.car.Car;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ap= new ClassPathXmlApplicationContext("resource/Spring.xml");
		Car c= (Car)ap.getBean(Car.class);
				c.printData();
	}
}
