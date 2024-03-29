import scala.collection.immutable.List

@main def hello(): Unit =
  println("Example of an iterator below:")
  val list_iter = list.iterator
  while list_iter.hasNext do
    println(list_iter.next())
  println("Message from msg: " + msg.message)
  msg.message match
    case "Hello world!" => println("msg.message was \"Hello world!\"")
    case _ => println("msg.message was not \"Hello world!\"")

val list = List(1, 2, 3)

case class Message(message: String)

val msg = Message("Hello Shuttle!")
