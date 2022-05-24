class LinkedList {
  var size = 0
  private var head: Node = null
  private var tail: Node = null
  case class Node(value: String, var next: Node = null) {
    size = size + 1
    override def toString: String = s"($value)->$next"
  }
  def deleteNode:String= {
    val temp:Node=head;
    head = head.next
    size=size-1;
    s"($temp)"
  }
  def removelast():String={
    var temp: Node = head;
    var temp2: Node = head;
    size=size-1
    while (temp.value!=tail.value )
    {
        temp2=temp
        temp=temp.next
    }
    tail=temp2
    tail.next=null
    s"(${temp.value})"
  }
  def addFirst(v: String) = {
    head = new Node(v, head)
    if (tail == null) tail = head
  }
  def addLast(v: String) = {
    if (tail == null) addFirst(v)
    else tail.next = new Node(v)
  }
  override def toString: String = "" + head
}
