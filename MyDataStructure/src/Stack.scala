class Stack extends LinkedList with IStack{
  override def push(x: String): Unit =addFirst(x);
  override def pop(): String =deleteNode;
}
