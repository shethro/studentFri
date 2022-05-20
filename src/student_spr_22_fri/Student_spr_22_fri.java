
package student_spr_22_fri;

import java.util.Scanner;


public class Student_spr_22_fri {

   //comments added from git hub for pull operation
   
   //comments added for fetch +merge
    public static void main(String[] args) {
        System.out.println("Enter your word");
        Scanner input = new Scanner(System.in);
        String myWord = input.nextLine();
        
        char[] myLetter = new char[myWord.length()];
        
        for(int i=0;i<myLetter.length;i++){
            myLetter[i]=myWord.charAt(i); 
        }
        for(int i=0;i<myLetter.length;i++){
            System.out.println(myLetter[i]);
        }
        System.out.println("Printing in reverse order...");
        for(int i=(myLetter.length)-1;i>=0;i--){
            System.out.println(myLetter[i]);
        }
    }
    
}
