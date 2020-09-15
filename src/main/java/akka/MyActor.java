package akka;

import akka.actor.UntypedAbstractActor;

public class MyActor extends UntypedAbstractActor {

    int count = 0;
    @Override
    public void onReceive(Object message) throws Throwable {
        System.out.println("MyActor receive: " + message.toString() + count);
        count = 1;
    }
}
