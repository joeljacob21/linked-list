/**
 * COMP 410
 *See inline comment descriptions for methods not described in interface.
 *
*/
package LinkedList_A1;

public class LinkedListImpl implements LIST_Interface {
  Node root;//this will be the entry point to your linked list (the head)
  int size = 0; //size of list
  
  public LinkedListImpl(){//this constructor is needed for testing purposes. Please don't modify!
    root=new Node(0); //Note that the root's data is not a true part of your data set!
  }
  
  //implement all methods in interface, and include the getRoot method we made for testing purposes. Feel free to implement private helper methods!
  
  public Node getRoot(){ //leave this method as is, used by the grader to grab your linkedList easily.
    return root;
  }

@Override
public boolean insert(Node n, int index) {
	Node temp = root;
	if(index <= size()) {
		for(int i = 0; i < index; i++) {
			temp = temp.next;
		}
		n.next = temp.next;
		temp.next = n;
		size++;
		return true;
	} else {
		return false;
	}
}

@Override
public boolean remove(int index) {
	Node temp = root;
	if(index <= size()) {
		for(int i = 0; i < index; i++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
		size--;
		return true;
	} else {
		return false;
	}
}

@Override
public Node get(int index) {
	if(index < 0 || index > size) {
		throw new IndexOutOfBoundsException();
	} else {
		Node temp = root;
		for(int i = -1; i < index; i++) {
			temp = temp.next;
		}
		return temp;
	}
}

@Override
public int size() {
	return size;
}

@Override
public boolean isEmpty() {
	return size == 0;
}

@Override
public void clear() {
	size = 0;
	root.next = null;
	}
}