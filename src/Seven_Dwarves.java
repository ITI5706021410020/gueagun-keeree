 import java.util.*; 
 import javax.swing.*;
 public class Seven_Dwarves {  
 public static void main(String[] args) { 	
	 int a1,a2,a3,a4,a5,a6,a7,a8,a9;
	 String s1,s2,s3,s4,s5,s6,s7,s8,s9;
	 int sum=0,over=0;  	
	 //เพิ่ม JOptionPane
	 Scanner scan=new Scanner(System.in); 	
do{ 			
	s1=JOptionPane.showInputDialog("Enter number 1.");
	a1=Integer.parseInt(s1);
	if(a1>99||a1<0) 	
		JOptionPane.showMessageDialog(null," ","number 1. Error! ", 0);	
	}while(a1>99||a1<0); 

do{ 			 
	s2=JOptionPane.showInputDialog("Enter number 2.");
	a2=Integer.parseInt(s2); 		
	if(a2>99||a2<0) 
		JOptionPane.showMessageDialog(null," ","number 2. Error! ", 0); 	
	}while(a2>99||a2<0); 	

do{ 
	s3=JOptionPane.showInputDialog("Enter number 3.");
	a3=Integer.parseInt(s3);		
	if(a3>99||a3<0) 	
		JOptionPane.showMessageDialog(null," ","number 3. Error! ", 0);
}while(a3>99||a3<0); 	

do{ 		
	s4=JOptionPane.showInputDialog("Enter number 4.");
	a4=Integer.parseInt(s4);
if(a4>99||a4<0) 	
	JOptionPane.showMessageDialog(null," ","number 4. Error! ", 0);	
}while(a4>99||a4<0); 	

do{ 	
	s5=JOptionPane.showInputDialog("Enter number 5.");
	a5=Integer.parseInt(s5);
	if(a5>99||a5<0) 
		JOptionPane.showMessageDialog(null," ","number 5. Error! ", 0); 
	}while(a5>99||a5<0); 

do{ 	
	s6=JOptionPane.showInputDialog("Enter number 6.");
	a6=Integer.parseInt(s6);
if(a6>99||a6<0) 	
	JOptionPane.showMessageDialog(null," ","number 6. Error! ", 0);
}while(a6>99||a6<0); 	


do{ 		
	s7=JOptionPane.showInputDialog("Enter number 7.");
	a7=Integer.parseInt(s7);
if(a7>99||a7<0) 	
	JOptionPane.showMessageDialog(null," ","number 7. Error! ", 0);	
}while(a7>99||a7<0); 	


do{ 		
	s8=JOptionPane.showInputDialog("Enter number 8.");
	a8=Integer.parseInt(s8);
if(a8>99||a8<0) 
	JOptionPane.showMessageDialog(null," ","number 8. Error! ", 0);	
}while(a8>99||a8<0); 

do{ 		
	s9=JOptionPane.showInputDialog("Enter number 9.");
	a9=Integer.parseInt(s9);
if(a9>99||a9<0) 	
	JOptionPane.showMessageDialog(null," ","number 9. Error! ", 0); 
}while(a9>99||a9<0); 	


sum=a1+a2+a3+a4+a5+a6+a7+a8+a9; 	
over=sum-100;  	


	if(a1+a2==over)a1=a2=0; 	
else if(a1+a3==over)a1=a3=0; 	
else if(a1+a4==over)a1=a4=0; 		
else if(a1+a5==over)a1=a5=0; 		
else if(a1+a6==over)a1=a6=0; 		
else if(a1+a7==over)a1=a7=0; 		
else if(a1+a8==over)a1=a8=0; 		
else if(a1+a9==over)a1=a9=0; 		 		
else if(a2+a3==over)a2=a3=0; 		
else if(a2+a4==over)a2=a4=0; 		
else if(a2+a5==over)a2=a5=0; 		
else if(a2+a6==over)a2=a6=0; 		
else if(a2+a7==over)a2=a7=0; 		
else if(a2+a8==over)a2=a8=0; 		
else if(a2+a9==over)a2=a9=0; 		 		
else if(a3+a4==over)a3=a4=0; 		
else if(a3+a5==over)a3=a5=0; 		
else if(a3+a6==over)a3=a6=0; 		
else if(a3+a7==over)a3=a7=0; 		
else if(a3+a8==over)a3=a8=0; 		
else if(a3+a9==over)a3=a9=0; 		 	
else if(a4+a5==over)a4=a5=0; 	
else if(a4+a6==over)a4=a6=0; 	
else if(a4+a7==over)a4=a7=0; 	
else if(a4+a8==over)a4=a8=0; 	
else if(a4+a9==over)a4=a9=0; 		
else if(a5+a6==over)a5=a6=0; 		
else if(a5+a7==over)a5=a7=0; 		
else if(a5+a8==over)a5=a8=0; 		
else if(a5+a9==over)a5=a9=0; 		
else if(a6+a7==over)a6=a7=0; 		
else if(a6+a8==over)a6=a8=0; 		
else if(a6+a9==over)a6=a9=0; 		
else if(a7+a8==over)a7=a8=0; 		
else if(a7+a9==over)a7=a9=0; 		
else if(a8+a9==over)a8=a9=0; 		
	
	
else { 	
	JOptionPane.showMessageDialog(null," ","You Enter number Error: ", 0); 		
	a1=a2=a3=a4=a5=a6=a7=a8=a9=0; 
	} 		 	
	if (a1!=0)JOptionPane.showMessageDialog(null,a1,"number 1.", 0); 
	if (a2!=0)JOptionPane.showMessageDialog(null,a2,"number 1.", 0);  	
	if (a3!=0)JOptionPane.showMessageDialog(null,a3,"number 1.", 0); 	
	if (a4!=0)JOptionPane.showMessageDialog(null,a4,"number 1.", 0); 	
	if (a5!=0)JOptionPane.showMessageDialog(null,a5,"number 1.", 0);  	
	if (a6!=0)JOptionPane.showMessageDialog(null,a6,"number 1.", 0); 	
	if (a7!=0)JOptionPane.showMessageDialog(null,a7,"number 1.", 0); 
	if (a8!=0)JOptionPane.showMessageDialog(null,a8,"number 1.", 0);  	
	if (a9!=0)JOptionPane.showMessageDialog(null,a9,"number 1.", 0); 		 		 
} 	 
}

 
