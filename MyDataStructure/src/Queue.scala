class Queue extends IQueue {
  private val linkedList = new LinkedList();

  override def Enqueue(x: String): Unit =linkedList.addFirst(x)

  override def Dequeue(): String = linkedList.removelast

  override def size(): Int = linkedList.size
  override def toString: String = "" + linkedList

}
