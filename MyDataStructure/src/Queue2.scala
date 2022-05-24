class Queue2 extends LinkedList with IQueue {
  override def Enqueue(x: String): Unit = addFirst(x)

  override def Dequeue(): String = removelast
}
