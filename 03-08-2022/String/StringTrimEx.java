public class StringTrimEx
{    
    public static void main(String[] args) 
    {    
        String s ="  Hello Good Afternoon!!  ";    
        System.out.println("\nWithout trim:");
        System.out.println(s.length());    
        System.out.println(s);    
        String tr = s.trim(); 
        System.out.println("\nWith trim:");   
        System.out.println(tr.length());    
        System.out.println(tr);     
    }    
} 