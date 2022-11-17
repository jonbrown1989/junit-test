/**
 * Simple Invoice class to represent an invoice
 *
 * @author jon.brown
 */
public class Invoice {
    //initiate attributes to empty LineItem objects to avoid null values
    Product product = new Product(0, " ", 0);
    LineItem item = new LineItem(product, 0);

    private LineItem lineItem1 = item;
    private LineItem lineItem2 = item;
    private LineItem lineItem3 = item;

    /**
     * Get the specified line's LineItem from the invoice
     * @return lineItem1/lineItem2/lineItem3
     */
    public LineItem getLineItem(int line) {
        if (line == 2) {
            return this.lineItem2;
        }
        else if (line == 3) {
            return this.lineItem3;
        }
        else { //Return lineItem1 as default value in case of error
            return this.lineItem1;
        }
    }

    /**
     * Set new lineitem to the specified line of the Invoice object
     * @param line invoice line number to which the lineitem is added
     * @param lineitem lineitem to be added to invoice
     */
    public void setLineItem(int line, LineItem lineitem){
            if (line == 2) {
                this.lineItem2 = lineitem;
            } else if (line == 3) {
                this.lineItem3 = lineitem;
            } else {
                this.lineItem1 = lineitem;
            }
    }

    /**
     * Method sums the total from each line of the
     * invoice together and returns the value
     */
    public double getTotal(){
        return lineItem1.getTotal()+ lineItem2.getTotal()+ lineItem3.getTotal();
    }
}
