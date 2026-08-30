public class Compare {
    public static void main(String[] args) {
        String Name1 = "tony";
        String Name2 = "tony2";
        if (Name1.compareTo(Name2) == 0) { // also we can use "==" but in some case it dose not work
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}
