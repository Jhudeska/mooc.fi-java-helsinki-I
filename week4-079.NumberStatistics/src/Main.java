import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        NumberStatistics nsSum = new NumberStatistics();
        NumberStatistics nsEven = new NumberStatistics();
        NumberStatistics nsOdd = new NumberStatistics();
        
        System.out.println("Type numbers:");
        int inputNum = reader.nextInt();
        while (inputNum != -1) {
            nsSum.addNumber(inputNum);
            if (inputNum % 2 == 0) {
                nsEven.addNumber(inputNum);
            } else {
                nsOdd.addNumber(inputNum);
            }
            inputNum = reader.nextInt();
        }
        
        System.out.println("sum: " + nsSum.sum());
        System.out.println("sum of even: " + nsEven.sum());
        System.out.println("sum of odd: " + nsOdd.sum());
    }
}
