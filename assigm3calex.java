import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class assigm3calex {

    public static void main (String [] args) {
        List<Integer> list = new ArrayList();
        list.add(1);
        List<Integer> list1 = new ArrayList();


        for (Integer lt : list) {
            Scanner scan = new Scanner(System.in);
            int item = scan.nextInt();
            list1.add(item);
            if(item == 0)
                break;
        }
    }

}
