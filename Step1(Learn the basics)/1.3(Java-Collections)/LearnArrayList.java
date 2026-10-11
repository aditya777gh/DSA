import java.util.*;
public class LearnArrayList {
    public static void main(String[] args) {
        
    ArrayList<String> studentsName = new ArrayList<>();
    studentsName.add("Rakesh");

    List<Integer> list = new ArrayList(); 
    list.add(1);
    list.add(2);
    list.add(3);
    System.out.println(list);

    list.add(4);
    list.add(1,50);
    System.out.println(list);

    System.out.println(list.get(1));

    list.remove(1);
    list.remove(Integer.valueOf(30));

    list.set(2,1000);

    for(int i=0; i<list.size(); i++){
        System.out.println("the element is "+list.get(i));
    }

    System.out.println(list);

    Iterator<Integer> it= list.iterator();
    while(it.hasNext()){
       
            System.out.println("iterator"+it.next());
        
    }

    }   
}