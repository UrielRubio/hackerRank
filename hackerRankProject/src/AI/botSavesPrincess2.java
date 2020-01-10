package AI;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class botSavesPrincess2 {

	static void nextMove(int n, int r, int c, String [] grid){
		//find princess
		int xP=-1,yP=-1;
		for(int i=0; i<n;i++) {
			yP=grid[i].indexOf("p",0);
			if(yP>-1) {
				//I find her
				xP=i;
				break;
			}
		}
		
		
		//saving
		int xB=r, yB=c;
		boolean xFind=false, yFind=false; 
		//while(!xFind || !yFind) {
			//System.out.println(xP+" "+yP + " "+xB+" "+yB);
			
			// UP DOWN  ----------------------
			if(xB-1>xP) {
				System.out.println("UP");
				xB--;
			}else if(xB+1<xP) {
				System.out.println("DOWN");
				xB++;
			}else if(yB+1<yP) {// LEFT, RIGHT  ----------------------
				System.out.println("RIGHT");
				yB++;
			}else if(yB-1>yP) {
				System.out.println("LEFT");
				yB--;
			}else
				yFind=true;
		//}
	 }

	public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n,r,c;
	        n = in.nextInt();
	        r = in.nextInt();
	        c = in.nextInt();
	        in.useDelimiter("\n");
	        String grid[] = new String[n];


	        for(int i = 0; i < n; i++) {
	            grid[i] = in.next();
	        }

	    nextMove(n,r,c,grid);

	    }
	}

/*
 5
1 2
p----
--m--
-----
-----
-----
 
5
2 2
p----
-----
--m--
-----
-----

5
2 2
-----
-----
--m--
-----
----p

5
2 3
-----
-----
p--m-
-----
-----

3
1 1
---
-m-
p--
* */
