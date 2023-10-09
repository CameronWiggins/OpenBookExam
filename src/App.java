import java.util.HashMap;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Vector2 v1 = new Vector2(2, 2,"red");
        Vector2 v2 = new Vector2(2, 2,"red");
        Vector2 v3 = new Vector2(5, 6,"blue");
        System.out.println(v1.magnitude());
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v2.isEquals(v1));
        System.out.println(v2.isEquals(v3));
        Vector2 v4 = v1.combine(v2);
        System.out.println(v4);
        Vector2 v5 = v4.clone();
        System.out.println(v5);

        HashMap<String, MathObject> MathObjectDatabase = new HashMap<String, MathObject>();
        MathObjectDatabase.put(v1.getDescription(),v1);
        MathObjectDatabase.put(v3.getDescription(),v3);
        Scanner scan = new Scanner(System.in);
        System.out.println("Which vector are you look for? Tell me their description.");
        String id = scan.nextLine();
        if(MathObjectDatabase.get(id) == null)
            {
                System.out.println("description not found in database");
            }
            else
            {
                System.out.println(MathObjectDatabase.get(id));
            }
        System.out.println("Showing All in Vector Database");
        for (String description : MathObjectDatabase.keySet())
            {
                System.out.println(MathObjectDatabase.get(description));
            }
    }
}
