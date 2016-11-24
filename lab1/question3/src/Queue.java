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

        //checks if queue is empty
        /*if (!empty()){

            //check if rear is null (should only happen once)
            if (rear == null){
                //if rear is empty
                front.setNext(newNode); //set front's 'next' to new node
                rear = newNode; //set rear to new node
            }

            //if queue not empty and rear not null, set current rear's 'next' to new node
            rear.setNext(newNode);
            //set rear to new node
            rear = newNode;
        }else{
            //if queue is empty, set front to new node
            front = newNode;
        }*/
    }

    //removes node from the front
    public Object dequeue(){

        Object x;

        if (front != null){
            x = front.getItem();
            front = front.getNext();

            if (front == null){
                rear = null;
            }
            return x;

        }
        return null;

        //checks if front's 'next' exists
        /*if (front.getNext() != null){
            //if 'next' exists set front to 'next'
            Node r = front;
            front = front.getNext();
            return r;
        }else{
            if (rear != null){
                Node r = rear;
                rear = null;
                return r;
            }
            return null;
        }*/
    }

    /*public void display(){
        while (rear != null){
            System.out.println(dequeue().getItem());
        }
    }*/

}