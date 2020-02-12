package hackerRankSite;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Resultt {
	public Resultt(){
		
	}

	public static int pickingNumbers(List<Integer> a) {
		int[] count=new int[a.size()-1];
		a.sort(null);;
        for(int i=0;i<a.size()-1;i++){
        	ArrayList<Integer> arr = new ArrayList<Integer>();
            arr.add(a.get(i));
            for(int j=i+1;j<a.size();j++){
                if(Math.abs(a.get(i)-a.get(j))==0||Math.abs(a.get(i)-a.get(j))==1){
                    arr.add(a.get(j));                    
                }
                
            }
            count[i]=arr.size();
        }
        Arrays.sort(count);
        return count[count.length-1];

	}

}

public class PickingNumbers {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
				.collect(toList());
		int result = Resultt.pickingNumbers(a);
		System.out.println(result);
		/*
		 * bufferedWriter.write(String.valueOf(result)); bufferedWriter.newLine();
		 */
		bufferedReader.close();
		// bufferedWriter.close();
	}
}
/*
6
4 6 5 3 3 1
 
 6
1 2 2 3 1 2
 */