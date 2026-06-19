import java.util.Scanner; 
class Books{
    private static String[] title= new String[10];
    private static int TotalBooks;
    
    
    Books(String title){
        Books.title[TotalBooks] =  title;
        System.out.println("New Book was Added");
        TotalBooks++;
    }
    public void display(){
        for(int i=0;i<TotalBooks;i++) System.out.println("Title = "+title[i]);
        System.out.println("Total Books= "+TotalBooks);
    }
    
}
public class Main {
    public static void main(String[] args) {
        
        Books B1 = new Books("Percy Jackson");
        Books B2 = new Books("Harry Potter");
        Books B3 = new Books("Atomic Habits");
        B3.display();
        
        
    }
}
/*OUTPUT
New Book was Added
New Book was Added
New Book was Added
Title = Percy Jackson
Title = Harry Potter
Title = Atomic Habits
Total Books= 3
*/
