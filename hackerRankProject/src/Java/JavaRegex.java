package Java;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class JavaRegex {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here

class MyRegex{
	String number = "([0-9]|"
			+ 		"[0-9][0-9]|"
			+		"[0-1][0-9][0-9]|"
			+		"2[0-4][0-9]|"
			+		"25[0-5])";
	String pattern = "(" + this.number + "\\.){3}" + this.number;
	//Pattern pattern = Pattern.compile(this.regex);
	
}




/*
000.12.12.034
121.234.12.12
23.45.12.56
00.12.123.123123.123
122.23
Hello.IP


*/