 import java.util.*; 
 import javax.swing.*;
 public class Trik {  	
	 public static void main(String[] args) { 
		 int ball1=1,ball2=0,ball3=0; 	
		 String result; 
		 Scanner scan=new Scanner (System.in); 
		//���� JOptionPane
		 do{ 	
			 result=JOptionPane.showInputDialog("Enter Charecter (A B C)");
			 
			// result=scan.nextLine(); 	
			 if(result.length()>49)System.out.println("result number overlond !"); 
		}while(result.length()>49); 	
		 
		 for(int i=0;i<result.length();i++){
			 if(result.charAt(i)=='B'){ 	
			if(ball1>ball2) {ball1=0; ball2=1;} 	
		 else if(ball2>ball1){ball1=1; ball2=0;} 	
		 else{ball1=0; ball2=0;} 		
		 } 			
	 if(result.charAt(i)=='B'){ 		
		 if(ball2>ball3){ball2=0; ball3=1;} 	
		 else if(ball3>ball2){ball2=1; ball3=0;} 	
		 else{ball2=0; ball3=0;} 			} 	
	 if(result.charAt(i)=='C'){ 		
		 if(ball1>ball3){ball3=1; ball1=0;} 	
		 else if(ball3>ball1){ball1=1; ball3=0;} 	
		 else{ball3=0; ball1=0;} 	
		 } 					
	 } 		 		if(ball1==1)JOptionPane.showMessageDialog(null,1,"Show number bell is : ", 3); 	
	 else if(ball2==1)JOptionPane.showMessageDialog(null,2,"Show number bell is : ", 3);  	
	 else if(ball3==1)JOptionPane.showMessageDialog(null,3,"Show number bell is : ", 3); 	
	 } 
	 }
