import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program_3 {
    public static List<Integer> output(int a) {
        int num = 1;  
        List<Integer> series = new ArrayList<>(); 
        
        for (int i = 1; i <= a; i++) {
            series.add(num); 
            num += 2;  
        }
        
        return series;
    }
    
    public static void main(String[] args) {
    	int a;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of 'a': ");
        int x = in.nextInt();
        
        if(x%2==0)
        {
        	 a=x-1;
        }
        else
        {
        	a=x;
        }
        in.close();
        
        List<Integer> result = output(a);
        System.out.println(result);
    }
}
