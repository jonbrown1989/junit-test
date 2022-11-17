/**
 * Simple LineItem class to represent a line item containing
 * quantity of product
 * @author jon.brown
 */
public class LineItem {
    private Product product;
    private int quantity;

    /**
     * Constructor for the LineItem class
     * @param product - object of the class Product
     * @param quantity- number of products to be included in the line item
     */
    public LineItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    /**
     * Get the Product object
     * @return product
     */
    public Product getProduct() {
        return this.product;
    }

    /**
     * Set the Product object
     * @param product product specified in the lineitem
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /** Get the product's quantity
     * @return quantity
     */
    public int getQuantity() {
        return this.quantity;
    }

    /**
     * Set the product's quantity
     * The setting value must be more than 0
     * @param quantity quantity of the product in the line item
     */
    public void setQuantity(int quantity) {
        //Ensure value is greater than 0
        if (quantity >= 0) {
            this.quantity = quantity;
        }
        else {
            System.out.println("Quantity should be more than 0");
        }
    }

    /**
     * Method returns total price based on the quantity
     * of product in the LineItem
     * @return product.getPrice() * this.quantity
     */
    public double getTotal(){
        Product product = this.getProduct();
        return product.getPrice() * this.quantity;
    }
}
