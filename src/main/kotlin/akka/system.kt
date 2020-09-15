package akka

import akka.actor.ActorRef
import akka.actor.ActorSystem
import akka.actor.Props


fun main(args: Array<String>) {
    val system = ActorSystem.create("mySystem")
    val myActor = system.actorOf(Props.create(MyActor::class.java), "myActor")
    myActor.tell("my", ActorRef.noSender())
    val anotherActor = system.actorOf(Props.create(AnotherActor::class.java), "anotherActor")
    anotherActor.tell("another", myActor)
}