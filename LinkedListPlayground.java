package LinkedList_A1;

public class LinkedListPlayground {

  public static void main(String[] args) { 
    test1();
    test2();

  }
  
  public static void test1(){
        LinkedListImpl L= new LinkedListImpl();
    //System.out.println(L.isEmpty());
    //printList(L);
    //L.clear();
    //System.out.println(L.isEmpty());
    //printList(L);
    System.out.println(L.root.toString());
    L.insert(new Node(3.3),0);
    System.out.println(L.isEmpty());
    printList(L);
    System.out.println(L.root.next.toString());
    L.insert(new Node(3.4),0);
    L.insert(new Node(3.5),0);
    L.insert(new Node(3.67),1);
    L.insert(new Node(3.357),0);
    printList(L);
    L.insert(new Node(3.333),4);
    System.out.println(L.size());
    printList(L);
    L.remove(3);
    System.out.println(L.size());
    printList(L);
    L.clear();
    L.insert(new Node(3.4),0);
    L.insert(new Node(3.5),0);
    L.insert(new Node(3.67),1);
    L.insert(new Node(3.357),0);
    L.insert(new Node(3.333),3);
    L.remove(0);
    System.out.println(L.size());
    printList(L);
  }
  public static void test2(){
    LinkedListImpl L= new LinkedListImpl();
    L.insert(new Node(3.4),0);
    L.insert(new Node(3.5),1);
    L.insert(new Node(3.67),2);
    L.remove(0);
    System.out.println(L.size());
    printList(L);
  }
  
  public static void printList(LinkedListImpl L){ //note that this is a good example of how to iterate through your linked list
    Node curr=L.root;
    for(int i=-1; i<L.size(); i++) { //-1 b/c the 0th node in list is the one after root. Root is just the entry point!
      System.out.print(curr.data+" --> ");
      curr=curr.next;
    }
    System.out.println();
  }
}