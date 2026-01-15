public class StringExample {


    static void demonstrateStringImmutability() {
        System.out.println("=== String Immutability ===");
        String s1 = "Hello";
        System.out.println("Original String: " + s1);

        String s2 = s1.concat(" World");
        System.out.println("After Concatenation: " + s2);

        // Comparing the references
        if (s1 == s2) {
            System.out.println("Both references point to the same object (Mutable)");
        } else {
            System.out.println("Different objects created (Immutable)");
        }
        System.out.println();
    }


    static void demonstrateStringMethods() {
        System.out.println("=== Common String Methods ===");
        String str = "JavaProgramming";

        System.out.println("String: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Character at index 4: " + str.charAt(4));
        System.out.println("Substring (0,4): " + str.substring(0, 4));
        System.out.println("Equals 'JavaProgramming'? " + str.equals("JavaProgramming"));
        System.out.println("Replace 'Java' with 'Python': " + str.replace("Java", "Python"));
        System.out.println();
    }

   
    static void demonstrateStringBuffer() {
        System.out.println("=== StringBuffer Mutability ===");
        StringBuffer sb = new StringBuffer("Hello");

        System.out.println("Original StringBuffer: " + sb);
        sb.append(" World");
        System.out.println("After append: " + sb);

        sb.insert(5, ",");
        System.out.println("After insert: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

        sb.delete(0, 6);
        System.out.println("After delete: " + sb);
        System.out.println("Changes made to the same object (Mutable)");
        System.out.println();
    }

   
    static void demonstrateStringBuilder() {
        System.out.println("=== StringBuilder Mutability ===");
        StringBuilder sb = new StringBuilder("Java");

        System.out.println("Original StringBuilder: " + sb);
        sb.append(" Rocks");
        System.out.println("After append: " + sb);

        sb.insert(4, " Programming");
        System.out.println("After insert: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

        sb.delete(0, 5);
        System.out.println("After delete: " + sb);
        System.out.println("Changes made to the same object (Mutable)");
        System.out.println();
    }

   
    public static void main(String[] args) {
        demonstrateStringImmutability();
        demonstrateStringMethods();
        demonstrateStringBuffer();
        demonstrateStringBuilder();
    }
}

