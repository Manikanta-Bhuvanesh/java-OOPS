public class UseBook {  
    public static void main(String[] args){
        Book b1,b2;
        b1=new Fiction("Spider man");
        System.out.println("price of " + b1.gettitle() + " book is " + b1.getPrice());
        b2=new NonFiction("A Brief History of Time");
        System.out.println("price of " + b2.gettitle() + " book is " + b2.getPrice());               
    }
}