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

public class MigratoryBirds {


    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
    	
    	Map<Integer, Integer> dictionary = new HashMap<Integer, Integer>();
    	for(int key: arr)
    		if(!dictionary.containsKey(key))
    			dictionary.put(key, 1);
    		else
    			dictionary.replace(key, dictionary.get(key)+1);
    	List<Integer> max = new ArrayList<Integer>();
    	int maxOcurrency = 0;
    	for(int key: dictionary.keySet())
    		if(dictionary.get(key)>maxOcurrency) {
    			max.clear();
    			max.add(key);
    			maxOcurrency = dictionary.get(key);
    		}else if(dictionary.get(key) == maxOcurrency)
    			max.add(key);
    	Collections.sort(max);
    	return max.get(0);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = migratoryBirds(arr);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();
        System.out.println(result);

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
/*
11
1 2 3 4 5 4 3 2 1 3 4

*/
