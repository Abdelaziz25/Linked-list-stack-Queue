class Stack2 extends IStack{

  private val linkedList = new LinkedList();
  override def push(x: String): Unit = linkedList.addFirst(x);
  override def pop(): String = linkedList.deleteNode;
  override def size(): Int = linkedList.size;
  override def toString: String = "" + linkedList
}
