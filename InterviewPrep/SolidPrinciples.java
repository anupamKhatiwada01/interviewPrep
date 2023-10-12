import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;




class Book{
    String name;
    int price;

    Book(String name, int price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString(){
        return "book: "+name;
    }

}


class Invoice{
    
    Book book;
	int quantity;
	double discountRate;
	double taxRate;
    double total;

    Invoice(Book book, int quantity, double discountRate, double taxRate, double total){
        this.book = book;
		this.quantity = quantity;
		this.discountRate = discountRate;
		this.taxRate = taxRate;
		this.total = this.calculateTotal();

    }

    Invoice(Book book){
        this(book,10,10,20,0);
    }

    @Override
    public String toString(){
        return "This is the invoice for book :"+book;
    }
    
    
    
    




    public double calculateTotal() {
	    double price = ((book.price - book.price * discountRate) * this.quantity);

		double priceWithTaxes = price * (1 + taxRate);

		return priceWithTaxes;
	}




    // Don't do the below work here because if you want to change the print format or save activity you will have to come and make changes here
    // public void printInvoice() {
    //         System.out.println(quantity + "x " + book.name + " " +          book.price + "$");
    //         System.out.println("Discount Rate: " + discountRate);
    //         System.out.println("Tax Rate: " + taxRate);
    //         System.out.println("Total: " + total);
	// }

    //     public void saveToFile(String filename) {
	// // Creates a file with given name and writes the invoice
	// }


}


class InvoicePrinter{
    private Invoice invoice;

    InvoicePrinter(Invoice invoice){
        this.invoice = invoice;
    }


    public void printInvoice() {
            System.out.println(invoice.quantity + "x " + invoice.book.name + " " +          invoice.book.price + "$");
            System.out.println("Discount Rate: " + invoice.discountRate);
            System.out.println("Tax Rate: " + invoice.taxRate);
            System.out.println("Total: " + invoice.total);
	}

}

// Let's create saver classes that implement InvoicePersistance 
// class InvoiceSaver{
//     private Invoice invoice;

//     InvoiceSaver(Invoice invoice){
//         this.invloice = invoice;
//     }

//     public void savePdf(){


//         System.out.println("Saving as pdf...");
//         // Save as pdf logic
//     }

//     // Doing this is a problem. Its not a technical problem, it's an engineering problem.
//     //  As the above code already works don't make changes to it. Keep clean working code clean so extensions will be easy.  
//     // public void saveToDatabase(){
//     //     // Save to database
//     //     System.out.println("Saving to database...");

//     // }
// }

// Rather, let's make an interface with a save method and extend it across all the formats for the save feature
// interface InvoicePersistance{
//     public void save();
// }

// Peristance interface. Persists both books and Invoices.
interface Persistance{
    public void save();

    default void print(){
        System.out.println("This is : "+this);

    }
}



class DatabaseInvoicePersistance implements Persistance{

    private Invoice invoice;


    DatabaseInvoicePersistance(Invoice invoice){
        this.invoice = invoice;
    }

    @Override
    public void save(){
        System.out.println("Saving "+this.invoice.book+" invoice to  database...");
    }


}


class FileInvoicePersistance implements Persistance{
    public Invoice invoice;

    FileInvoicePersistance(Invoice invoice){
        this.invoice = invoice;
    }
    @Override
    public void save(){
        System.out.println("Saving "+this.invoice.book+" invoice to file...");
    }
}





class DatabaseBookPersistance implements Persistance{

    private Book book;


    DatabaseBookPersistance(Book book){
        this.book = book;
    }

    @Override
    public void save(){
        System.out.println("Saving "+this.book+" book to  database...");
    }


}


class FileBookPersistance implements Persistance{
    public Book book;

    FileBookPersistance(Book book){
        this.book = book;
    }
    @Override
    public void save(){
        System.out.println("Saving "+this.book+" book to file...");
    }

    
}

// We can do all this because of polymorphism
class PersistanceManager{
    // This will have alist of persistance objects
    private List<Persistance> persistanceList;

    // This will take any number of persistance objects ie. both book and nvoice and any other new persistance objects we
    PersistanceManager(Persistance... persistanceObjects){
        persistanceList = new ArrayList<Persistance>(Arrays.asList(persistanceObjects));

        System.out.println("These are the persistance objects:");
        persistanceList.forEach(p->p.print());
    }
    
}










// This way of doing things makes the all our requirements seperate making it more viable to modify specific functionalities










public class SolidPrinciples{
    public static void main(String[] args){

        Book book = new Book("The picture of Dorian Gray",500);

        Invoice invoice = new Invoice(book);

        InvoicePrinter ip = new InvoicePrinter(invoice);
        ip.printInvoice();

        DatabaseInvoicePersistance dbip = new DatabaseInvoicePersistance(invoice);
        // dbip.save();

        FileInvoicePersistance fip = new FileInvoicePersistance(invoice);
        // fip.save();

        DatabaseBookPersistance dbbp = new DatabaseBookPersistance(book);
        // dbbp.save();

        FileBookPersistance fbp = new FileBookPersistance(book);
        // fbp.save();

        PersistanceManager pm = new PersistanceManager(dbip,dbbp,fip,fbp);





    }    
}