public class InvoiceTest {
    public static void main(String[] args) {
        Product nickelCandy = new Product(-1, "Candy for 0.05", 0.05);
        Product dimeCandy = new Product(2, "Candy for 10 cents", 0.10);
        Product quarterCandy = new Product(3, "Candy for 25 cents", 0.25);
        Product loonyCandy = new Product(4, "Candy for 10 cents", 1.00);

        LineItem item = new LineItem(dimeCandy, 1);
        LineItem item2 = new LineItem(quarterCandy, 1);
        LineItem item3 = new LineItem(loonyCandy, 1);
        item3.setQuantity(-4);


        Invoice myInvoice = new Invoice();
        myInvoice.setLineItem(1, item);
        myInvoice.setLineItem(2, item2);
        myInvoice.setLineItem(3, item3);

        System.out.printf("%nLineitem details: %n    Product: %s%n    Price: %s each%n    Quantity: %s%n", item.getProduct().getDescription(), item.getProduct().getPrice(), item.getQuantity() );
        System.out.printf("%nInvoice details:%n%n");
        System.out.printf("Line 1:%n    Product: %s%n    Price: %s each%n    Quantity: %s%n%n", myInvoice.getLineItem(1).getProduct().getDescription(), myInvoice.getLineItem(1).getProduct().getPrice(), myInvoice.getLineItem(1).getQuantity() );
        System.out.printf("Line 2:%n    Product: %s%n    Price: %s each%n    Quantity: %s%n%n", myInvoice.getLineItem(2).getProduct().getDescription(), myInvoice.getLineItem(2).getProduct().getPrice(),myInvoice.getLineItem(2).getQuantity() );
        System.out.printf("Line 3:%n    Product: %s%n    Price: %s each%n    Quantity: %s%n%n", myInvoice.getLineItem(3).getProduct().getDescription(), myInvoice.getLineItem(3).getProduct().getPrice(),myInvoice.getLineItem(3).getQuantity() );
        System.out.printf("Invoice total = %s%n%n", myInvoice.getTotal());


    }
}

