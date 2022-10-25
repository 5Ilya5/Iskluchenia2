import java.util.Scanner;

class InputRead {

    public static void main(String[] args){
        System.out.println("UserNumber entered:" + userNumber());
    }

    public static Float userNumber(){

        Scanner input = new Scanner(System.in);

        float n = 0;

        while(n <= 0){
            try{
                System.out.println("Please enter a float");
                String read = input.next();
                n = Integer.parseInt(read);
            } catch(NumberFormatException e){
                //ignore
            }
        }

        input.close();
        return n;
    }
}