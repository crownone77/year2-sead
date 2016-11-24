/**
 * Created by Steven on 23/11/2016.
 */
public class Queue {

    public Node front;
    public Node rear;

    //initialise queue
    public void initialise(){
        front = null;
        rear = null;
    }

    //check if queue is empty
    /*public boolean empty(){
        return (front == null);
    }*/

    //adds node to the rear of the queue
    public void enqueue(Node newNode){

        if (newNode != null){
            if (front == null){
                front = newNode;
                rear = newNode;
            }else{
                rear.setNext(newNode);
                rear = newNode;
            }
            newNode.setNext(null);

            System.out.println(front.getItem());
            System.out.println(rear.getItem());
        }

    }

    //removes node from the front
    public Object dequeue() {

        Object x;

        if (front != null) {
            x = front.getItem();
            front = front.getNext();

            if (front == null) {
                rear = null;
            }
            return x;

        }
        return null;
    }

}