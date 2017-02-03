package com.nayema;

// Yes, I did that, it's called "refactoring", it allows us to keep code organized.
// That's why Java has package names, so that we can move things around and reference
// other parts of code instead of keeping everything in one file.
import com.nayema.models.Invoice;
import java.util.*;
import java.util.stream.Stream;

// Here we have InvoiceStream, part of the package com.nayema because it is a main application file
public class InvoiceStream {
    public static void main(String[] args) {
        ArrayList<Invoice> invoicelist;
        invoicelist = new ArrayList<>();
        // Control + Click Invoice to go to the Invoice model class
        invoicelist.add(new Invoice(83, "Electric sander", 7, 57.98));
        invoicelist.add(new Invoice(24, "Power saw", 18, 99.99));
        invoicelist.add(new Invoice(7, "Sledge hammer", 11, 21.50));
        invoicelist.add(new Invoice(77, "Hammer", 76, 11.99));
        invoicelist.add(new Invoice(39, "Lawn mower", 3, 79.50));
        invoicelist.add(new Invoice(68, "Screwdriver", 106, 6.99));
        invoicelist.add(new Invoice(56, "Jig saw", 21, 11.00));
        invoicelist.add(new Invoice(3, "Wrench", 34, 7.50));
       // System.out.println(invoicelist.get(0).getNumber());
        System.out.println("Now the all the names of Invoice class will be printed in the alphabetical order! "+"\n");
        invoicelist
                .stream()
                .sorted((d1, d2) -> d1.getDescription()
                .compareTo(d2.getDescription()))
                .forEach(e -> System.out.println(e.getDescription()+"\n"));

        System.out.println("Now the all the prices of Invoice class will be printed in the ascending order! " +"\n");


        invoicelist
                .stream()                                                           //lambda stream starts from here, uses sorted to order Invoices alphabetically
                .sorted((p1, p2)-> Double.compare(p1.getPrice(),p2.getPrice()))
                .forEach(p -> System.out.println(p.getPrice()+"\n"));               //this lambda ends here


        System.out.println("Now the all the objects of Invoice class will be printed in the ascending order of number of purchase! "+"\n");


       // System.out.println("Latest");
        invoicelist
                .stream()                   //lambda stream starts from here, uses sorted to order Invoices alphabetically
                .sorted((c, c1)-> Integer.compare(c.getNumpurchase(),c1.getNumpurchase()))
                        .map((Invoice c)-> "PartDescription  "+ "  " +(c.getDescription()+ "  "+"Quantity is"+ "  "+ c.getNumpurchase()))
                .forEach(c -> System.out.println(c+"\n"));   //this lambda ends here

        System.out.println("Now the all the objects of Invoice class will be printed in the ascending order of value! "+"\n");

        invoicelist
                .stream()       //lambda stream starts from here, uses sorted to order Invoices alphabetically
                .sorted((c, c1)-> Double.compare(c.getValue(), c1.getValue()))
                .map((Invoice c)-> "PartDescription "+"  " +(c.getDescription()+"  "+ "Value is"+ "  "+ c.getValue()))
                .forEach(c -> System.out.println(c+"\n"));  //this lambda ends here

        System.out.println("Now the all the objects of Invoice class will be printed if their price is higher than $500 and less than $200! "+"\n");

        invoicelist
                .stream()       //lambda stream starts from here, uses sorted to order Invoices alphabetically
                .filter((c-> c.getValue()<500.00 || c.getValue()>200.00))
                .map((Invoice c)-> "PartDescription" +"  "+ (c.getDescription()+ "  "+"Value is"+ "  "+ c.getValue()))
                .forEach(c -> System.out.println(c)); //this lambda ends here

    }
}
