import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Program_4 {
    public static Map<Integer, Integer> Output(List<Integer> numbers) 
    {
        Map<Integer, Integer> multiply = new HashMap<>();
        multiply.put(1, 0);
        multiply.put(2, 0);
        multiply.put(3, 0);
        multiply.put(4, 0);
        multiply.put(5, 0);
        multiply.put(6, 0);
        multiply.put(7, 0);
        multiply.put(8, 0);
        multiply.put(9, 0);

        for (int num : numbers) {
            for (int key : multiply.keySet()) {
                if (num % key == 0) {
                	multiply.put(key, multiply.get(key) + 1);
                }
            }
        }

        return multiply;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the numbers separated by commas: ");
        String x = in.nextLine();//Input by comma sepertaed values
        in.close();
        
        String[] arrayinput = x.split(",");//helps to take input with comma seperated values
        List<Integer> a = new ArrayList<>();
        for (String number : arrayinput) {
            a.add(Integer.parseInt(number.trim()));
        }
        
        Map<Integer, Integer> outputCount = Output(a);
        System.out.println(outputCount);
    }
}
