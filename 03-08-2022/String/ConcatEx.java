public class ConcatEx
{  
    public static void main(String[] args) 
    {      
        String s1 = "Rutuja";  
        String s2 = "Jaypal";  
        String s3 = "Kamble";    
        String s4 = s1.concat(s3);          
        System.out.println("\n" + s4);   
        String s5 = s1.concat(s2).concat(s3);  
        System.out.println("\n" + s5);  
    }  
}  
