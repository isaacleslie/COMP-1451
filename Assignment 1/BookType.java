import java.util.Map;
import java.util.HashMap;

/**
 * Enum for genre of a Book
 * 
 * @author (IsaacL)
 * @version (18-02-2016)
 */
public enum BookType 
{
    FICTION("fiction"), 


    NONFICTION("nonfiction"), 


    SCIENCEFICTION("sciencefiction"),

    REFERENCE("reference");
    private String theBookType;
    private static Map<String, BookType> lookup = new HashMap<String, BookType>();
    static{
        for (BookType b : BookType.values()){
            lookup.put(b.getTheBookType(), b);
        }
    }
    /**
     * BookType Constructor
     *
     * @param theBookType book's genre
     */
    private BookType(String theBookType) {
        this.theBookType = theBookType;
    }

    /**
     * returns the book's genre
     *
     * @return genre of book
     */
    public String getTheBookType() {
        return theBookType;
    }

    // the following method allows me to create a BookType enum from a String!
    // e.g. in the Book class, I could set the BookType instance variable to:
    // bookType = BookType.get(“fiction”);
    /**
     * Allows you to create a Material enum from a String input
     *
     * @param theBookType A parameter
     * @return The return value
     */
    public static BookType get(String theBookType) {
        return lookup.get(theBookType);
    }
}