import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> demo = new HashMap<>();
        demo.put("a", 10);
        demo.put("b", 3);
        demo.put("c", 88);

        System.out.println(demo);
        System.out.println(demo.get("c"));

        HashMap<String, String> users = new HashMap<>();
        users.put("aaa", "aaa111");
        users.put("bbb", "bbb222");
        users.put("ccc", "ccc333");

        users.remove("bbb");

        System.out.println(users);
        System.out.println(users.size());
        System.out.println(users.containsKey("bbb"));
        System.out.println(users.containsValue("ccc333"));
        System.out.println(users.replace("aaa", "aaa111replaced"));
        System.out.println(users);
        System.out.println(users.values());
        System.out.println(users.keySet());
    }
}
