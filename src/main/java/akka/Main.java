package akka;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

public class Main {

    public static void main(String[] args) {

        ActorSystem system = ActorSystem.create("mySystem");
        ActorRef myActor = system.actorOf(Props.create(MyActor.class), "myActor");
        myActor.tell("my",myActor);
        myActor.tell("my1",myActor);
        ActorRef anotherActor = system.actorOf(Props.create(AnotherActor.class), "anotherActor");
        anotherActor.tell("another",anotherActor);
        ActorRef anotherActor1 = system.actorOf(Props.create(AnotherActor.class), "anotherActor1");
        anotherActor1.tell("another1",anotherActor1);
        system.terminate();
    }
}
