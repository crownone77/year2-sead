/**
 * Created by Steven on 23/11/2016.
 */
public class Stack {

    public Node top;

    public void initialise(){
        top = null;
    }

    public boolean empty(){
        return (top == null);
    }

    public void push(Object newNode){

        Node n = new Node(newNode);
        n.setNext(top);
        top = n;
    }

    public Object pop(){

        Node x = null;

        if (!empty()){
            x = top;
            top = top.getNext();
        }

        return x.getItem();
        //test
    }
}
