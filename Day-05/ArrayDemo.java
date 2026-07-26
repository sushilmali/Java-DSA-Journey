public class ArrayDemo {
    public static void main(String[] args) {
       int [] marks = new int[3];
       marks[0] = 97; // phy
       marks[1] = 98; // chem
       marks[2] = 99; // maths
       
       for(int i=0; i<marks.length; i++){
           System.out.println(marks[i]);
       }
    }
}
