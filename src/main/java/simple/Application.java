package simple;

import javax.jms.JMSException;

import org.apache.activemq.broker.BrokerService;

/**
 * Created by nayoung on 15/01/2018
 */
public class Application {
	
//	public static void main(String... args) throws JMSException {
//        System.out.println("Starting consumer...");
//        Consumer consumer = new Consumer();
//    }
	
	public static void main(String... args) throws Exception {

        Producer producer = new Producer();
        int x = 0;
        while(true) {
            Thread.sleep(2000);
            producer.produceMessage(x);
            x++;
        }
    }
	
}
