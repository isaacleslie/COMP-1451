/**
 * Class Item acts as the parent class for Items that Stores have for sale. It contains
 * a unique ID, a String that depends on the nature of the item.
 */
class Item
{
    private double weightInKg;
    private double manufacturingPriceDollars;
    private double suggestedRetailPriceDollars;
    private String uniqueID;
    
    /**
     * Initializes all instance variables.
     *
     * @param weightInKg weight
     * @param manufacturingPriceDollars manufacturing price in dollars
     * @param suggestedRetailPriceDollars suggested retail price in dollars
     * @param uniqueID unique String identifier for the Item
     */
    public Item(double weightInKg, double manufacturingPriceDollars,
    double suggestedRetailPriceDollars, String uniqueID) {
        setWeightInKg(weightInKg);
        setManufacturingPriceDollars(manufacturingPriceDollars);
        setSuggestedRetailPriceDollars(suggestedRetailPriceDollars);
        setUniqueID(uniqueID);
    }
    
    /**
     * Accessor for the item's weight in kilograms.
     *
     * @return weight in kilograms
     */
    public double getWeightInKg() {
        return weightInKg;
    }
    /**
     * Accessor for the manufacturing price of the item in dollars.
     *
     * @return manufacturing price in dollars
     */
    public double getManufacturingPriceDollars() {
        return manufacturingPriceDollars;
    }
    /**
     * Accessor for the suggested retail price of the item in dollars.
     *
     * @return the suggested retail price in dollars
     */
    public double getSuggestedRetailPriceDollars() {
        return suggestedRetailPriceDollars;
    }
    /**
     * Accessor for the unique ID of the item.
     *
     * @return the unique ID
     */
    public String getUniqueID() {
        return uniqueID;
    }
    
    /**
     * Mutator for the weight of the item.
     *
     * @param weight weight in kilograms
     */
    public void setWeightInKg(double weight) {
        if  (weight > 0) {
            weightInKg = weight;
        }
        else{
            System.out.println("Weight must be positive");
        }
    }
    /**
     * Mutator for the manufacturing price of the item in dollars.
     *
     * @param manufacturingPriceDollars manufacturing price in dollars
     */
    public void setManufacturingPriceDollars(double manufacturingPriceDollars) {
        if  (manufacturingPriceDollars > 0) {
            this.manufacturingPriceDollars = manufacturingPriceDollars;
        }
        else{
            System.out.println("Not a valid price");
        }
    }
    /**
     * Mutator for the suggested retail price of the item in dollars.
     *
     * @param suggestedRetailPriceDollars suggested retail price in dollars
     */
    public void setSuggestedRetailPriceDollars(double suggestedRetailPriceDollars) {
        if  (suggestedRetailPriceDollars > 0) {
            this.suggestedRetailPriceDollars = suggestedRetailPriceDollars;
        }
    }
    /**
     * Mutator for the unique ID of the item.
     *
     * @param uniqueID unique ID
     */
    public void setUniqueID(String uniqueID) {
        if  (uniqueID != null) {
            this.uniqueID = uniqueID;
        }
        else{
            System.out.println("Not a valid ID");
        }
    }
}