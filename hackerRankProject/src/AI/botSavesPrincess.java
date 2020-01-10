package AI;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class botSavesPrincess {

	static void displayPathtoPrincess(int n, String [] grid){
		//find princess
		int x=0,y;
		y = grid[0].indexOf("p",0);
		if(y<0) {
			x = n-1;
			y = grid[n-1].indexOf("p",0);
		}
		//saving
		int aux = n/2+1;
		while(aux<n) {
			if(x<n/2)
				System.out.println("UP");
			else
				System.out.println("DOWN");
			if(y<n/2)
				System.out.println("LEFT");
			else
				System.out.println("RIGHT");
			aux++;
		}
		
		//System.out.println(x+" "+y);
		
		
		
	  }

	public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int m;
	        m = in.nextInt();
	        String grid[] = new String[m];
	        for(int i = 0; i < m; i++) {
	            grid[i] = in.next();
	        }

	    displayPathtoPrincess(m,grid);
	    }
	}

/*
 5
p----
-----
--m--
-----
-----

5
-----
-----
--m--
-----
----p
 * */
