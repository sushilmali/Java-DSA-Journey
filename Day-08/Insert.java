public class Insert {
    public static void main(String[] args) {
       // Start with the word "Tond"
        StringBuilder sb = new StringBuilder("Tond");
        System.out.println(sb); // 👉 Tond

        // Change "Tond" to "Tony" (replace 'd' with 'y')
        sb.setCharAt(3, 'y');
        System.out.println(sb); // 👉 Tony

        // Insert "Hi, " at the beginning
        sb.insert(0, "Hi, ");
        System.out.println(sb); // 👉 Hi, Tony

        // Delete first 4 characters ("Hi, ")
        sb.delete(0, 4);
        System.out.println(sb); // 👉 Tony

        sb.append(" Tony");
        sb.append(" Stark");
        System.out.println(sb);
    }
}
    