import java.util.ArrayList;
import java.util.Iterator;
public class SearchString{
   public static void main(String[] args){
      ArrayList <String> list = new ArrayList<String>();
      //Instantiating an ArrayList object
      list.add("Java");
      list.add("SERVELET");
      list.add("JDBC");
      list.add("Angular");
      list.add("CSS");
      list.add("Hadoop");
      list.add("HTML");
      list.add("JavaScript");
      list.add("spring");
      list.add("aws");
      list.add("React");
      System.out.println("Contents of the array list: ");
      for (String element : list){
         if (element.contains("Java")){
               System.out.println(element);
         }
         else
        	 System.out.println("not found");
      }
   }
}