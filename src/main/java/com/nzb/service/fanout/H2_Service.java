package main.java.com.nzb.service.fanout;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

/**
 * @author M
 * @create 2018/1/29
 */
public class H2_Service implements MessageListener {

    private Logger logger = LoggerFactory.getLogger(H2_Service.class);

    public void onMessage(Message message) {
        logger.info("Get message: " + new String(message.getBody()));
    }
}
