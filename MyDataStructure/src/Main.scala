object Main {
  def main(args: Array[String]): Unit = {
    var list: LinkedList = new LinkedList;
    list.addLast("1");
    list.addFirst("4"); list.addFirst("14"); list.addFirst("24");
    list.addLast("5");
    println(s"List $list with size ${list.size}")
    var stack: IStack = new Stack
    stack.push("1");  stack.push("4"); stack.push("14"); stack.push("24")
    stack.pop()
    println(s"Stack $stack with size ${stack.size}")
    var stack2: IStack = new Stack2
    stack2.push("1");  stack2.push("4"); stack2.push("14"); stack2.push("24")
    stack2.pop()
    println(s"Stack $stack2 with size ${stack2.size}")
    var Queue: IQueue = new Queue;
    Queue.Enqueue("1"); Queue.Enqueue("4");Queue.Enqueue("14");Queue.Enqueue("24");
    Queue.Dequeue()
    println(s"Queue $Queue with size ${Queue.size}")
    var Queue2: IQueue = new Queue2;
    Queue2.Enqueue("1"); Queue2.Enqueue("4");Queue2.Enqueue("14");Queue2.Enqueue("24");
    Queue2.Dequeue()
    println(s"Queue $Queue2 with size ${Queue2.size}")
  }
}
