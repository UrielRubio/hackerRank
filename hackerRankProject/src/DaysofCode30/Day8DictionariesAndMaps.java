package DaysofCode30;
import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Day8DictionariesAndMaps {
	static Scanner scan = new Scanner(System.in);
	static int i;
	
	public static void main(String []argh){
		int n = scan.nextInt();
		//Declarate my dictionary
		Map<String, String> phoneBook = new HashMap<String, String>();
		for(i = 0; i<n; i++) {
			phoneBook.put(scan.next(), scan.next());
		}
		//scan.close();
		StringTokenizer token = new StringTokenizer(" ");
		String query;
		//System.out.println(phoneBook.keySet());
		while(scan.hasNextLine()) {
			query = scan.next();
			if(phoneBook.containsKey(query)) {
				System.out.println(query + "="+phoneBook.get(query));
			}else
				System.out.println("Not found");
		}
		
		
		
	}

}

/*//

3
sam 99912222
tom 11122222
harry 12299933
sam
edward
harry

*/