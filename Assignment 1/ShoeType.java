import java.util.HashMap;
import java.util.Map;

/**
 * Contains the type of shoe, based on gender or sports/casual
 * 
 * @author (IsaacL)
 * @version (20-02-2016)
 */
public enum ShoeType 
{
    MENS("men's"),
    WOMENS("women's"),
    CHILDREN("children's"),
    SPORTS("sports"),
    DRESS("dress");
    private String theShoeType;
    private static Map<String, ShoeType> lookup = new HashMap<String, ShoeType> ();
    static{
        for(ShoeType s : ShoeType.values()) {
            lookup.put(s.getTheShoeType(), s);
        }
    }
    
    /**
     * ShoeType Constructor
     *
     * @param theShoeType A parameter
     */
    private ShoeType(String theShoeType) {
        this.theShoeType = theShoeType;
    }
    
    /**
     * Method getTheShoeType
     *
     * @return The return value
     */
    public String getTheShoeType() {
        return theShoeType;
    }
    
    // the following method allows me to create a ShoeType enum from a String!
    // e.g. in the Shoe class, I could set the ShoeType instance variable to:
    // shoeType = ShoeType.get(“men's”);
    /**
     * Method get
     *
     * @param theShoeType A parameter
     * @return The return value
     */
    public static ShoeType get(String theShoeType) {
        return lookup.get(theShoeType);
    }
}