/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
imports for BufferedReader*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility  classes
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
		System.out.println("Enter a number");
        int N = Integer.parseInt(line);
        List<Integer> primeNumbers = new ArrayList<Integer>();
        
        for (int i = 2; i < N; i++) {
           boolean isPrime=true;
           int x=i/2;
           for(int y=2;y<=x;y++)
           {
               if(i%y==0) 
               {  isPrime=false;
                  break;
               }
           }
            if(isPrime)
                primeNumbers.add(i);
        }
        String sp ="";
        for(int i=0; i<primeNumbers.size();i++)
        {
            sp = sp+primeNumbers.get(i)+" ";
        }
        System.out.println(sp.trim());
        
        
        //System.out.println("Hello World!");
    }
}
