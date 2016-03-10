import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.ArrayList;

/**
 * The ShoeStore class is a child of Store, it has a department and adds shoes to its parent's HashMap.
 */
class ShoeStore extends Store
{
    private ShoeType department;
    private ArrayList<Shoe> arrayListOfShoes;
    /**
     * Initializes the shoestore's address, department (as a ShoeType), and adds a list of anonymous shoes to the parent's HashMap.
     *
     * @param address an Address object
     * @param name name of the shoestore
     * @param department the kind of shoes the shoestore mainly sells
     */
    public ShoeStore(Address address, String name, ShoeType department){
        super(address, name);
        this.department = department;
        addShoes();

    }

    /**
     * Initializes the shoestore's address, department (as a String), and adds a list of shoes to the parent's HashMap.
     *
     * @param address an Address object
     * @param name name of the bookstore
     * @param department genre the bookstore mainly sells
     */
    public ShoeStore(Address address, String name, String department){
        super(address, name);
        this.department = ShoeType.get(department);
        addShoes();
    }

    /**
     * Adds a list of predetermined objects into the parent's HashMap.
     *
     */
    private void addShoes(){
        Name name = new Name("Skechers");
        Shoe s = new Shoe(1.0, 58.5, 90.0, "Diameter", Material.LEATHER, 10, name, ShoeType.MENS, java.awt.Color.DARK_GRAY);
        addItem(s);
        s = new Shoe(0.85, 32.5, 50, "Lite Kicks Rainbow Sprite", Material.PLASTIC, 10, name, ShoeType.CHILDREN, java.awt.Color.PINK);
        addItem(s);

        name = new Name("Robert", "Cobbler");
        s = new Shoe(1.15, 104, 160, "Wave", Material.LEATHER, 12, name, ShoeType.DRESS, java.awt.Color.BLACK);
        addItem(s);
        s = new Shoe(0.5, 39, 60, "Toachi", Material.CLOTH, 5, name, ShoeType.CHILDREN, java.awt.Color.BLUE);
        addItem(s);

        name = new Name("Geox");
        s = new Shoe(1, 110.5, 170, "Monet", Material.CLOTH, 7, name, ShoeType.MENS, java.awt.Color.BLUE);
        addItem(s);
        s = new Shoe(0.9, 97.5, 150, "Marieclaire", Material.PLASTIC, 10, name, ShoeType.WOMENS, java.awt.Color.GRAY);
        addItem(s);

        name = new Name("Nine", "West");
        s = new Shoe(0.85, 84.5, 130, "Camya Multi Glitter", Material.PLASTIC, 8, name, ShoeType.WOMENS, java.awt.Color.BLACK);
        addItem(s);

        name = new Name("Stride", "Rite");
        s = new Shoe(0.6, 45.5, 70, "Balance Of The Force", Material.RUBBER, 9, name, ShoeType.CHILDREN, java.awt.Color.GRAY);
        addItem(s);

        name = new Name("Sperry");
        s = new Shoe(0.7, 39, 60, "Top-Sider Unisex Bluefish H&L", Material.CLOTH, 9, name, ShoeType.CHILDREN, java.awt.Color.ORANGE);
        addItem(s);

        name = new Name("Nike");
        s = new Shoe(1.2, 117, 180, "Jordan Ace 23 II", Material.RUBBER, 13, name, ShoeType.SPORTS, java.awt.Color.WHITE);
        addItem(s);
    }

    /**
     * Prints a list of every single shoe the store has.
     *
     */
    public void displayAllShoesAndDesigners(){
        Collection<Shoe> shoes = getCollectionOfItems(); 
        Iterator<Shoe> it = shoes.iterator();

        while(it.hasNext()){
            Shoe s = it.next();
            System.out.println(s.getDesigner().getFullName() + "offers " +  s.getMaterial().getTheMaterial() + 
                " size-" + s.getSize() + " " + s.getShoeType().getTheShoeType() + " " + s.getDescription());
        }
    }

    /**
     * Prints a list of all the shoes by a single designer.
     *
     * @param designerName designers name
     */
    public void displayAllShoesByDesigner(String designerName) {
        Collection<Shoe> shoes = getCollectionOfItems(); 
        Iterator<Shoe> it = shoes.iterator();

        while(it.hasNext()){
            Shoe s = it.next();
            if(s.getDesigner().getFullName().trim().equalsIgnoreCase(designerName)) {
                System.out.println(s.getDesigner().getFullName() + "offers a size-" + s.getSize() + " " + s.getShoeType().getTheShoeType() + " " + s.getDescription());
            }
        }
    }

    /**
     * Prints a list of all the shoes made of a given material. The material parameter is a string. The material can be cloth, rubber, plastic or leather.
     * 
     * @param material      a string of the material
     */
    public void displayAllShoesMadeOf(String material){
        Collection<Shoe> shoes = getCollectionOfItems(); 
        Iterator<Shoe> it = shoes.iterator();

        while(it.hasNext()){
            Shoe s = it.next();
            if(s.getMaterial().getTheMaterial().equalsIgnoreCase(material)) {
                System.out.println("The size-" + s.getSize() + " " + s.getDescription() + " is made of " + material);
            }
        }
    }

    /**
     * Prints a list of all the shoes made of a given material. The material parameter is a ShoeType. The material can be cloth, rubber, plastic or leather.
     *
     * @param material      a ShoeType
     */
    public void displayAllShoesMadeOf(Material material){
        Collection<Shoe> shoes = getCollectionOfItems(); 
        Iterator<Shoe> it = shoes.iterator();

        while(it.hasNext()){
            Shoe s = it.next();
            if(s.getMaterial() == material) {
                System.out.println("The size-" + s.getSize() + " " + s.getDescription() + " is made of " + material.getTheMaterial());
            }
        }
    }

    /**
     * Prints the number of shoes designed by a single designer. Parameter is a Name object.
     *
     * @param designer Name object of the designer
     */
    public void displayNumberOfShoesDesignedBy(Name designer) {
        Collection<Shoe> shoes = getCollectionOfItems(); 
        Iterator<Shoe> it = shoes.iterator();

        int numberOfShoesByDesigner = 0;

        while(it.hasNext()){
            Shoe s = it.next();
            if(s.getDesigner().getFullName().trim().equalsIgnoreCase(designer.getFullName().trim())) {
                numberOfShoesByDesigner++;
            }
        }
        System.out.println("This store has " + numberOfShoesByDesigner + " shoes designed by " + designer.getFullName().trim());
    }

    /**
     * Prints the number of shoes designed by a single designer. Parameter is a string.
     *
     * @param designerLastName string of designer's last name
     */
    public void displayNumberOfShoesDesignedBy(String designerLastName) {
        Collection<Shoe> shoes = getCollectionOfItems(); 
        Iterator<Shoe> it = shoes.iterator();

        int numberOfShoesByDesigner = 0;

        while(it.hasNext()){
            Shoe s = it.next();
            if(s.getDesigner().getLastName() == designerLastName) {
                numberOfShoesByDesigner++;
            }
        }
        System.out.println("This store has " + numberOfShoesByDesigner + " shoes designed by " + designerLastName);
    }

    /**
     * Iterates through the Collection of shoes to print the smallest size available.
     *
     */
    public void displaySmallestShoeSize() {
        Collection<Shoe> shoes = getCollectionOfItems(); 
        Iterator<Shoe> it = shoes.iterator();

        Shoe firstShoe = it.next();
        int smallestSize = 0;

        while(it.hasNext()){
            smallestSize = it.next().getSize();
            if(firstShoe.getSize() < smallestSize) {
                smallestSize = firstShoe.getSize();
            }
        }
        System.out.println("smallest shoe size: " + smallestSize);
    }

    /**
     * Prints the sum of the weight of all the shoes in the Collection in kilograms.
     *
     */
    public void displayTotalWeightKgOfAllShoes() {
        Collection<Shoe> shoes = getCollectionOfItems(); 
        Iterator<Shoe> it = shoes.iterator();

        double totalKg = 0.0;

        while(it.hasNext()){
            Shoe s = it.next();
            totalKg = totalKg + s.getWeightInKg();
        }
        System.out.println("total kg of shoes: " + totalKg);
    }

    /**
     * Takes a Material enum and a Name of a designer and prints if it finds a match or not.
     *
     * @param m a Material enum
     * @param designer Name object of a designer
     */
    public void displayAllShoesOfThisMaterialMadeByThisDesigner(Material m, Name designer){
        Collection<Shoe> shoes = getCollectionOfItems(); 
        Iterator<Shoe> it = shoes.iterator();

        boolean noMatch = false;

        while(it.hasNext()){
            Shoe s = it.next();
            if(m == s.getMaterial()){
                if(s.getDesigner().getFullName().equalsIgnoreCase(designer.getFullName())) {
                    System.out.println("The " + s.getDescription() + " is a " + s.getMaterial().getTheMaterial() +
                        " shoe offered by " + s.getDesigner().getFullName().trim());
                    noMatch = true;
                }
            }
        }
        if(noMatch == false) {
            System.out.println("This store has no " + m.getTheMaterial() + " shoes designed by " + designer.getFullName().trim());
        }
    }
    
    public void displayAllShoesNotInMatchingStore(){
        Collection<Shoe> shoes = getCollectionOfItems(); 
        Iterator<Shoe> it = shoes.iterator();

        while(it.hasNext()){
            System.out.println("what is this even");
        }
    }
}