public class EqualsEx
{  
    public static void main(String[] args) {  
        String a = "Deeptech";    
        String b = "DEEPTECH";    
        String c = "Deeptech"; 
        System.out.println("\n1st Comparison"); 
        System.out.println(a.equals(b));
        System.out.println("String a (" + a + ") and String b (" + b + ") both strings are unequal");
        System.out.println("\n2nd Comparison");    
        if (a.equals(c)) 
        {  
            System.out.println("Stirng a (" + a + ") and String c (" + c + ") both strings are equal");  
        }
        else 
        {
            System.out.println("both strings are unequal");
        }     
    }  
}  