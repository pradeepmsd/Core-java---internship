import java.util.ArrayList;
import java.util.List;
public class removeelement
{
  public static void main(String args[])
  {
List<Integer> a1=new ArrayList<>();
    a1.add(16);
    a1.add(17);
    a1.add(19);
    a1.add(23);
    a1.add(1);
    a1.add(2);
    System.out.println(a1);
    a1.remove(new Integer(1));
    a1.remove(new Integer(2));
    System.out.println(a1);
  }
}
