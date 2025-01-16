/*swap two numbers
class Main{
    public static void main(String args[]){
        int a=10;
        int b=20;
        
        a=a+b;
        b=a-b;
        a=a-b;
        
        System.out.println("a: "+a+"b: "+b);
      
    }
}*/
/* 
printing number until 0 is typed
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        while(true){
            n=sc.nextInt();
            if(n==0){
                System.out.println("stop");
                break;
            }
           
                System.out.println(n);
                
            
        }
        
    }
}*/
/* counting numbers and character and special character
class Count{
    public static void main(String args[]){
        String input="Hello123!";
        int alphabets=0;
        int digits=0;
        int sc=0;
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(Character.isLetter(ch)){
                alphabets++;
            }
            else if(Character.isDigit(ch)){
                digits++;
            }
            else{
                sc++;
            }
        }
        System.out.println("character: "+alphabets+"digit: "+digits+"sc: "+sc);
    }
}






