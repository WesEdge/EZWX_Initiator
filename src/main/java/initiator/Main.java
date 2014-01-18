package initiator;

import EZWX.core.ErrorHandler;
import com.rabbitmq.client.ShutdownSignalException;

public class Main {

    public static void main(String[] args) {

        try{
            new Initiator().send();
        }
        catch (ShutdownSignalException ex){
            // rabbitmq socket has unexpectedly closed
            ErrorHandler.handle(ex);
        }
        catch (Exception ex){
            ErrorHandler.handle(ex);
        }

    }


}
