/**
 * Created by Steven on 23/11/2016.
 */

//this is a linked list

//Class Node to construct a node
public class Node {

    private Object item;
    private Node next; //defines node at end of list

    //Constructor
    public Node(Object newItem){
        item = newItem;
        next = null;
    }

    //Constructor
    //Create 'normal' mode
    public Node(Object newItem, Node nextNode){
        item = newItem;
        next = nextNode;
    }

    //update item field of node
    public void setItem(Object newItem){
        item = newItem;
    }

    //read item field of node
    public Object getItem(){
        return item;
    }

    //read next field of node
    public Node getNext(){
        return next;
    }

    //update next field of node
    public void setNext(Node nextNode){
        next = nextNode;
    }

    //end class Node
}