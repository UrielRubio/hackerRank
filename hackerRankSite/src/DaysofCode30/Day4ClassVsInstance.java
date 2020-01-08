package DaysofCode30;
import java.io.*;
import java.util.*;
public class Day4ClassVsInstance {

	 private int age;	
	  
		public Day4ClassVsInstance(int initialAge) {
	  		// Add some more code to run some checks on initialAge
			if(initialAge<0) {
				this.age = 0;
				System.out.println("Age is not valid, setting age to 0.");
			}
			else
				this.age = initialAge;
		}

		public void amIOld() {
	  		// Write code determining if this person's age is old and print the correct statement:
			String mesagge="";
			if(this.age<13)
				mesagge="You are young.";
			else if(this.age>=13 && this.age<18)
				mesagge="You are a teenager.";
			else
				mesagge="You are old.";
	        System.out.println(mesagge);
		}

		public void yearPasses() {
	  		// Increment this person's age.
			this.age += 1;
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int T = sc.nextInt();
			for (int i = 0; i < T; i++) {
				int age = sc.nextInt();
				Day4ClassVsInstance p = new Day4ClassVsInstance(age);
				p.amIOld();
				for (int j = 0; j < 3; j++) {
					p.yearPasses();
				}
				p.amIOld();
				System.out.println();
	        }
			sc.close();
	    }
	}
