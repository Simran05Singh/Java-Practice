public class Q5_StringImmutable {
    public static void main(String[] args) {
        String s1 = "Hello";
        System.out.println(s1 + " " + System.identityHashCode(s1));
        s1 = s1 + "World";
        System.out.println(s1 + " " + System.identityHashCode(s1));

        String s2 = new String("Hello");
        System.out.println(s2 + " " + System.identityHashCode(s2));
        s2 = s2.concat("World");
        System.out.println(s2 + " " + System.identityHashCode(s2));

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb + " " + System.identityHashCode(sb));
        sb.append("World");
        System.out.println(sb + " " + System.identityHashCode(sb));
    }
}