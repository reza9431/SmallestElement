
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveElement {
    public static void main(String[] args) {

       ArrayList list = new ArrayList();
       list.add(45);
       list.add(78);
       list.add(12);
       list.add(37);

        System.out.println(list);
        int elpos = 37;
        int elindx = list.indexOf(elpos);
        list.remove(elindx);
        list.add(0 ,elpos);

        System.out.println(list);












    }

}
