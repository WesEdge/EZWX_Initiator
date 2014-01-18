package initiator;

import EZWX.core.Properties;
import EZWX.mq.MQSender;
import EZWX.mq.MQArgs;

public class Initiator extends MQSender {

    public Initiator() throws Exception{
        super();
    }

    public MQArgs getMessage() throws Exception {

        MQArgs args = new MQArgs();
        args.setQueueHost(Properties.getValue("queueHost"));
        args.setQueueName(Properties.getValue("queueNameOut"));
        args.setMessage(Properties.getValue("ingestUrl"));
        return args;

    }

}
