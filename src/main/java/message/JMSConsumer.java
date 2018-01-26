package message;

import org.springframework.stereotype.Component;
import org.springframework.jms.annotation.JmsListener;

/**
 * Created by nayoung on 15/01/2018
 */
@Component
public class JMSConsumer {

    @JmsListener(destination = AppConfig.QUEUE_NAME)
    public void handleMessage(String message) { 
        System.out.println("received: "+message);
    }
    
}