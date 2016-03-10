import java.awt.Color;
/**
 * Class Shoe is a child class of Item. It holds a generic Item's variables as well as the material, size, designer, and color of the shoe. The unique ID of a shoe is its description.
 * 
 */
class Shoe extends Item
{
    private Material material;
    private int size;
    private Name designer;
    private ShoeType shoeType;
    private Color color;
    /**
     * Initializes the Item parameters, then all other instance variables. Color is from Java's java.awt.Color.
     *
     * @param weightInKg A parameter
     * @param manufacturingPriceDollars A parameter
     * @param suggestedRetailPriceDollars A parameter
     * @param uniqueID A parameter
     * @param material A parameter
     * @param size A parameter
     * @param designerName A parameter
     * @param shoeType A parameter
     * @param color A parameter
     */
    public Shoe(double weightInKg, double manufacturingPriceDollars, double suggestedRetailPriceDollars, String uniqueID,
    Material material, int size, Name designerName, ShoeType shoeType, Color color) {
        super(weightInKg, manufacturingPriceDollars, suggestedRetailPriceDollars, uniqueID);
        setMaterial(material);
        setSize(size);
        setDesigner(designerName);
        setShoeType(shoeType);
        setColor(color);
    }

    /**
     * Mutator for the size of the shoe.
     *
     * @param size size of the shoe
     */
    public void setSize(int size) {
        if  (size >= 0 && size <= 20) {
            this.size = size;
        }
        else{
            System.out.println("Not a valid shoe size");
        }
    }

    /**
     * Mutator for the material of the shoe, between LEATHER, CLOTH, RUBBER and PLASTIC.
     *
     * @param material material of the shoe
     */
    public void setMaterial(Material material) {
        this.material = material;
    }

    /**
     * Mutator for the name of the shoe designer.
     *
     * @param designerName name of the designer of the shoe
     */
    public void setDesigner(Name designerName) {
        if  (designerName != null) {
            this.designer = designerName;
        }
    }

    /**
     * Mutator for the type of shoe, between MENS, WOMENS, CHILDRENS, SPORTS and DRESS.
     *
     * @param shoeType A parameter
     */
    public void setShoeType(ShoeType shoeType) {
        this.shoeType = shoeType;
    }

    /**
     * Mutator for the color of the shoe. Uses java.awt.Color.
     *
     * @param color color of the shoe
     */
    public void setColor(Color color) {
        if  (color != null) {
            this.color = color;
        }
    }

    /**
     * Accessor for the size of the shoe.
     *
     * @return size of the shoe
     */
    public int getSize() {
        return size;
    }

    /**
     * Accessor for the material of the shoe.
     *
     * @return materials of the shoe
     */
    public Material getMaterial() {
        return material;
    }

    /**
     * Accessor for the designer of the shoe.
     *
     * @return name of the shoe designer
     */
    public Name getDesigner() {
        return designer;
    }

    /**
     * Accessor for the type of shoe, MENS, WOMENS, CHILDRENS, SPORTS and DRESS.
     *
     * @return type of shoe
     */
    public ShoeType getShoeType() {
        return shoeType;
    }

    /**
     * Accessor for the color of the shoe.
     *
     * @return color of the shoe
     */
    public Color getColor() {
        return color;
    }

    /**
     * Accessor for the description of the shoe, which uses the parent class's uniqueID.
     *
     * @return description of the shoe
     */
    public String getDescription() {
        return super.getUniqueID();
    }

    /**
     * Mutator of the description of the shoe, which uses the parent class's uniqueID.
     *
     * @param description description of the shoe
     */
    public void setDescription(String description) {
        super.setUniqueID(description);
    }
    
    /**
     * Accessor for the weight of the shoe returned from the superclass Item.
     *
     * @return shoe's weight in kg
     */
    public double getWeightInKg() {
        return super.getWeightInKg();
    }
}