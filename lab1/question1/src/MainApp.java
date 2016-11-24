import java.util.*;

/**
 * Created by Steven on 23/11/2016.
 */
public class MainApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean run = true;
        Stack s = new Stack();

        while (run){

            System.out.println("Enter item");
            String input = in.nextLine();

            if (!input.equals("end")){

                s.push(input);

            }else{

                run = false;
                break;

            }

        }

        while(!s.empty()){
            System.out.println(s.pop());
        }

    }
}
