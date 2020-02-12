package DaysofCode30;
import java.util.*;
import java.io.*;
class Nodee{
    Nodee left,right;
    int data;
    Nodee(int data){
        this.data=data;
        left=right=null;
    }
}

public class Day22BinarySearchTrees {


	public static int getHeight(Nodee root){
	//Write your code here
		if (root==null)
			return -1;
		int left = 1 + getHeight(root.left);
		int rigth = 1 + getHeight(root.right);
		return Math.max(left, rigth);
			
    }

    public static Nodee insert(Nodee root,int data){
        if(root==null){
            return new Nodee(data);
        }
        else{
            Nodee cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
	 public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Nodee root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
        sc.close();
    }
}

/*
7
3
5
2
1
4
6
7


*/