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
    }
}
