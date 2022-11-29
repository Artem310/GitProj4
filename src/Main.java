
public class Main {
    public static void main(String[] args) {

        String string = "12345";
        StringBuilder str = new StringBuilder(string);
        str.reverse();

        for (int i = 3; i < str.length(); i+=4) {
            str.insert(i, ",");
        }
        str.reverse();
        string = str.toString();
        System.out.println(string);





    }
}