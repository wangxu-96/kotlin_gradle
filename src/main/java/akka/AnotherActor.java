package akka;

import akka.actor.ActorRef;
import akka.actor.UntypedAbstractActor;

public class AnotherActor extends UntypedAbstractActor {
    @Override
    public void onReceive(Object message) throws Throwable {
        System.out.println("sender:" + getSender());
        System.out.println("self:" + self());
        System.out.println("Another receive: " + message.toString() );
    }
}
