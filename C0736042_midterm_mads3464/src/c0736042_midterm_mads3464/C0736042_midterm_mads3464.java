/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c0736042_midterm_mads3464;

/**
 *
 * @author pritesh.patel
 */
public class C0736042_midterm_mads3464 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //first_program
        String s ="Rajveer";
        
        char[] try1 = s.toCharArray();
 
        for (int i = try1.length-1; i>=0; i--)
            System.out.print(try1[i]);
        
    //second_program
    
        String s1="1111";  
int decimal=Integer.parseInt(s1,2);  
 System.out.println(decimal);
 
 //third program
 String s3 = "AaroN LANGille";

String initials = s3.substring(0, 1) + s3.substring(6, 7); 

		System.out.println(initials);
    
                // forth program
                String s7="Earth takes 24 hours to rotate"; 
char ch; 
int max=0,i,j,cn=0; 
for(i=0;i<s7.length();i++) 
{ 
cn=0; 
for(j=i;j<s7.length();j++) 
{ 
if(s7.charAt(i)==s7.charAt(j),cn++); 
} 
if(cn>max) 
{ 
max=cn; 
ch=s7.charAt(i); 
} 
} 
System.out.println(cn);
                

    

 //assertEquals(2, count);
                
   //fifth_program
   
       String s5 = new String("the dog jumped over the fence");

       System.out.print("String after replacing the with that :" );
       System.out.println(s5.replaceFirst("the", "that"));

       System.out.print("String after replacing the with this:" );
    
      System.out.println(s5.replace("the", "this"));
      
    }
    
             
}
    


