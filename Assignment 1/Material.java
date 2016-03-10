import java.util.Map;
import java.util.HashMap;
/**
 * Enum for the type of material the shoe is made out of
 * 
 * @author (IsaacL)
 * @version (20-02-2016)
 */
public enum Material
{
    LEATHER("leather"),
    CLOTH("cloth"),
    RUBBER("rubber"),
    PLASTIC("plastic");
    
    private String theMaterial;
    private static Map<String, Material> lookup = new HashMap<String, Material> ();
    static{
        for (Material m : Material.values()) {
            lookup.put(m.getTheMaterial(), m);
        }
    }
    
    /**
     * Creates a Material object and assigns it to the String theMaterial
     * 
     * @param theMaterial a String of the material
     */
    private Material(String theMaterial) {
        this.theMaterial = theMaterial;
    }
    /**
     * Returns the Material
     * 
     * @return the material
     */
    public String getTheMaterial() {
        return theMaterial;
    }
    
    
    /**
     * Creates a Material enum from a String, allowing you to look up a Material
     * from a String
     *
     * @param theMaterial String of material
     * @return Material enum
     */
    public static Material get(String theMaterial) {
        return lookup.get(theMaterial);
    }
}
