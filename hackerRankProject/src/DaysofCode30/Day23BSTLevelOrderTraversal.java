package DaysofCode30;
import java.util.*;
import java.io.*;
class Nodeee{
    Nodeee left,right;
    int data;
    Nodeee(int data){
        this.data=data;
        left=right=null;
    }
}

public class Day23BSTLevelOrderTraversal {


static void levelOrder(Nodeee root){
	LinkedList<Nodeee> queue = new LinkedList<Nodeee>();
	queue.add(root);
	
	while(!queue.isEmpty()) {
		Nodeee actualNode = queue.poll();
		System.out.print(actualNode.data + " ");
		
		if(actualNode.left!=null)
			queue.add(actualNode.left);
		if(actualNode.right!=null)
			queue.add(actualNode.right);
	}
      
    }

public static Nodeee insert(Nodeee root,int data){
        if(root==null){
            return new Nodeee(data);
        }
        else{
            Nodeee cur;
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
            Nodeee root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}
/*
6
3
5
4
7
2
1


*/