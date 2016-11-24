import java.util.Scanner;

/**
 * Created by Steven on 23/11/2016.
 */
public class MainApp {
    public static void main(String[] args) {

        boolean run = true;
        Node n = new Node("");
        Queue q = new Queue();
        q.initialise();

        Scanner in = new Scanner(System.in);

        //while user hasn't entered 'end'
        while (run){

            System.out.println("Enter item");
            String input = in.nextLine();

            //checks if user inputs 'end'
            if (!input.equals("end")){

                //if not 'end', enqueue new node
                q.enqueue(new Node(input));

            }else{

                run = false;
                break;

            }
        }

        //dequeue until nothing left in queue
        while (q.rear != null){
            System.out.println(q.dequeue());
        }

    }
}
