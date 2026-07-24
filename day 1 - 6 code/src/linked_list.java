import java.util.LinkedList ;

public class linked_list {

    public static void  main(String[] args){
        LinkedList<String> Names = new LinkedList<>();
        Names.add("ram");
        Names.add("sam");
        Names.add("priya");
        Names.add("Mohan");
        String s = Names.get(2);
        System.out.println(s);
        Names.addFirst("sonam");
        Names.clear();
        //Names.remove(2);
        System.out.println(Names);
    }



}
