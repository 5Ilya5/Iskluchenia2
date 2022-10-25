import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        string = string.trim();
        if(string.isEmpty())
            throw new IllegalArgumentException("Строка пустая!");
        else
            System.out.println(string);
    }
}
