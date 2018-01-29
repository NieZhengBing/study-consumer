package main.java.com.nzb.service.topic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Component;

/**
 * @author M
 * @create 2018/1/29
 */
@Component
public class EmailErrorTopicService implements MessageListener {
    private Logger logger = LoggerFactory.getLogger(EmailErrorTopicService.class);

    public void onMessage(Message message) {
        logger.info("Get message: " + new String(message.getBody()));
    }
}
