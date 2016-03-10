import java.util.HashMap;
import java.util.Collection;
import java.util.Set;
/**
 * Write a description of class Store here.
 * 
 * @author IsaacL 
 * @version 02-03-2016
 */
public class Store
{
    private Address streetAddress;
    private String name;
    private HashMap<String, Item> itemsForSale;
    
    /**
     * Initializes an Address for the streetAddress, a String for the store's name, and a HashMap of the items for sale.
     *
     * @param streetAddress an Address object
     * @param name name of the store
     */
    public Store(Address streetAddress, String name) {
        setStreetAddress(streetAddress);
        setName(name);
        itemsForSale = new HashMap<String, Item> ();
    }
    
    /**
     * Mutator for the address of the store. This is held in an Address object.
     *
     * @param streetAddress an Address object
     */
    public void setStreetAddress(Address streetAddress) {
        if  (streetAddress != null) {
            this.streetAddress = streetAddress;
        }
    }
    /**
     * Mutator for the name of the store. This is held in a single String as opposed to a Name object.
     *
     * @param name name of the store
     */
    public void setName(String name){
        if  (name != null) {
            this.name = name;
        }
        else{
            System.out.println("Not a valid name");
        }
    }
    
    /**
     * Accessor for the address of the store. Returns an Address object.
     *
     * @return the address
     */
    public Address getStreetAddress() {
        return streetAddress;
    }
    /**
     * Accessor for the name of the store. This is held in a single String as opposed to a Name object.
     *
     * @return the name of the store
     */
    public String getName() {
        return name;
    }
    /**
     * Accessor for the HashMap of the items for sale.
     *
     * @return a HashMap of items for sale
     */
    public HashMap getItemsForSale() {
        return itemsForSale;
    }
    
    /**
     * Adds an Item object to the HashMap of items for sale.
     *
     * @param item an item for sale
     */
    public void addItem(Item item){
        itemsForSale.put(item.getUniqueID(), item);
    }
    /**
     * Returns an item from the HashMap of items for sale if the key matches the input parameter.
     *
     * @param key item's key
     * @return item for sale
     */
    public Item getItemByKey(String key){
        return itemsForSale.get(key);
    }
    /**
     * Returns a collection of all of the items for sale.
     *
     * @return the items for sale
     */
    public Collection getCollectionOfItems(){
        return itemsForSale.values();
    }
}
