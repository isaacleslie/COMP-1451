import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 * The BookStore class is a child of Store, it has a specialty and adds books to its parent's HashMap.
 */
class BookStore extends Store
{
    private BookType specialty;
    /**
     * Initializes the bookstore's address, specialty (as a BookType), and adds a list of anonymous books to the parent's HashMap.
     *
     * @param address an Address object
     * @param name name of the bookstore
     * @param specialty genre the bookstore mainly sells
     */
    public BookStore(Address address, String name, BookType specialty){
        super(address, name);
        this.specialty = specialty;
        addBooks();
    }

    /**
     * Initializes the bookstore's address, specialty (as a String), and adds a list of anonymous books to the parent's HashMap.
     *
     * @param address an Address object
     * @param name name of the bookstore
     * @param specialty genre the bookstore mainly sells
     */
    public BookStore(Address address, String name, String specialty){
        super(address, name);
        this.specialty = BookType.get(specialty);
        addBooks();
    }

    /**
     * Adds a list of predetermined objects into the parent's HashMap.
     *
     */
    private void addBooks(){
        Date birthDate = new Date(1919, 1, 1);
        Name name = new Name("Jerome", "David", "Salinger");
        BookType genre = BookType.get("fiction");
        Author author = new Author(birthDate, name, genre, "JD");
        Date datePublished = new Date(1951, 5, 14);
        String title = "The Catcher in the Rye";
        Book b = new Book(0.4, 2.0, 4.0, "1234", author, datePublished, title, genre);
        addItem(b);

        datePublished = new Date(1948, 1, 31);
        title = "A Perfect Day for Bananafish";
        genre = BookType.get("fiction");
        b = new Book(1, 11, 12, "2345", author, datePublished, title, genre);
        addItem(b);

        datePublished = new Date(1945, 12, 12);
        title = "A Boy in France";
        genre = BookType.get("fiction");
        b = new Book(2, 33, 35, "3456", author, datePublished, title, genre);
        addItem(b);

        birthDate = new Date(1963, 9, 3);
        name = new Name("Malcolm", "Gladwell");
        genre = BookType.get("nonfiction");
        author = new Author(birthDate, name, genre, "") ;
        datePublished = new Date(2008, 11, 18);
        title = "Outliers";
        b = new Book(2.1, 2, 6, "4567", author, datePublished, title, genre);
        addItem(b);

        datePublished = new Date(2000, 3, 1);
        title = "The Tipping Point";
        genre = BookType.get("nonfiction");
        b = new Book(0.5, 3, 5, "5678", author, datePublished, title, genre);
        addItem(b);

        birthDate = new Date(1919, 11, 26);
        name = new Name("Frederik", "Pohl");
        genre = BookType.get("sciencefiction");
        author = new Author(birthDate, name, genre, "Paul Dennis Lavond") ;
        datePublished = new Date(1977, 7, 4);
        title = "Gateway";
        b = new Book(0.01, 4, 4, "6789", author, datePublished, title, genre);
        addItem(b);

        datePublished = new Date(1937, 10, 6);
        title = "Elegy to a Dead Planet: Luna";
        genre = BookType.get("sciencefiction");
        b = new Book(0.1, 5, 11, "abcd", author, datePublished, title, genre);
        addItem(b) ;

        birthDate = new Date(1918, 5, 11);
        name = new Name("Richard", "Phillips", "Feynman");
        genre = BookType.get("reference");
        author = new Author(birthDate, name, genre, "") ;
        datePublished = new Date(1942, 5, 20);
        title = "Principle of Least Action in Quantum Mechanics";
        b = new Book(0.8, 15, 30, "efgh", author, datePublished, title, genre);
        addItem(b);

        datePublished = new Date(1964, 6, 30);
        title = "The Messenger Lectures";
        genre = BookType.get("reference");
        b = new Book(0.6, 44, 45.5, "ijkl", author, datePublished, title, genre);
        addItem(b);

        datePublished = new Date(1985, 11, 1);
        title = "Surely You're Joking Mr. Feynman";
        genre = BookType.get("nonfiction");
        b = new Book(1.0, 3, 13, "mnop", author, datePublished, title, genre);
        addItem(b);
    }

    /**
     * Method displayAllBooksWrittenByAuthorsOverThisAge
     *
     * @param ageInYears minimum age of authors to be searched
     */
    public void displayAllBooksWrittenByAuthorsOverThisAge(int ageInYears){
        Collection<Book> books = getCollectionOfItems(); // From the Store class
        Iterator<Book> it = books.iterator();
        boolean displayedSome = false;
        while(it.hasNext()){
            Book b = it.next();
            int ageYears = b.getDatePublished().getYear() - b.getAuthor().getBirthDate().getYear();
            if(ageYears > ageInYears){
                System.out.println(b.getTitle() + " was written by " + b.getAuthor().getName().getLastName() + " at age " + ageYears +
                    ", which is more than " + ageInYears);
                displayedSome = true;
            }
        }
        if(displayedSome == false){
            System.out.println("No books by authors over age " + ageInYears);
        }
    }

    /**
     * Prints a list of every single book the store has.
     *
     */
    public void displayAllBooksByEveryAuthor(){
        Collection<Book> books = getCollectionOfItems(); 
        Iterator<Book> it = books.iterator();

        while(it.hasNext()){
            Book b = it.next();
            System.out.println(b.getAuthorLastName() + " wrote " + b.getTitle() + " in " + b.getYearPublished());
        }
    }

    /**
     * Prints a list of all the books by a single author.
     *
     * @param lastName author's last name
     */
    public void displayAllBooksByAuthor(String lastName) {
        Collection<Book> books = getCollectionOfItems(); 
        Iterator<Book> it = books.iterator();

        while(it.hasNext()) {
            Book b = it.next();
            if(b.getAuthorLastName().equalsIgnoreCase(lastName)) {
                System.out.println(b.getAuthorLastName() + " wrote " + b.getTitle());
            }
        }
    }

    /**
     * Prints a list of all the books that were published before a given year.
     *
     * @param year the lastest year that should be displayed
     */
    public void displayAllBooksWrittenBefore(int year) {
        Collection<Book> books = getCollectionOfItems(); 
        Iterator<Book> it = books.iterator();

        while(it.hasNext()) {
            Book b = it.next();
            if(b.getYearPublished() < year) {
                System.out.println(b.getTitle() + " was published in " + b.getYearPublished() + ", which is before " + year);
            }
        }
    }

    /**
     * Prints all the books written by an author's given pseudonym.
     *
     * @param pseudonym author's stage name
     */
    public void displayTitlesOfBooksWrittenBy(String pseudonym) {
        Collection<Book> books = getCollectionOfItems(); 
        Iterator<Book> it = books.iterator();
        
        while(it.hasNext()) {
            Book b = it.next();
            if(b.getAuthorPseudonym().equalsIgnoreCase(pseudonym)) {
                System.out.println(b.getAuthorLastName() + " wrote " + b.getTitle() + " as " + b.getAuthorPseudonym());
                
            }
        }
    }

    /**
     * Prints all the books of a given genre. These are "fiction", "nonfiction", "reference" and "sciencefiction".
     *
     * @param genre genre of the book
     */
    public void displayAllBooksForGenre(String genre) {
        Collection<Book> books = getCollectionOfItems(); 
        Iterator<Book> it = books.iterator();

        while(it.hasNext()) {
            Book b = it.next();
            if(b.getGenreString().equalsIgnoreCase(genre)) {
                System.out.println(b.getTitle() + " is a " + b.getGenreString() + " book written by " + b.getAuthorLastName());
            }
        }
    }
    
    /**
     * Prints out the sum of the weight of every book.
     *
     */
    public void displayTotalWeightKgOfAllBooks() {
        Collection<Book> books = getCollectionOfItems(); 
        Iterator<Book> it = books.iterator();

        double weightOfBooks = 0;
        while(it.hasNext()) {
            Book b = it.next();
            weightOfBooks = weightOfBooks + b.getWeightInKg();
        }
        System.out.println("total kg of books: " + weightOfBooks);
    }
    
    /**
     * Prints all the books written by an author born on a certain day of the week.
     *
     * @param dayOfTheWeek author's birth day of the week
     */
    public void displayAllBooksWrittenByAuthorsBornOn(String dayOfTheWeek){
        Collection<Book> books = getCollectionOfItems(); 
        Iterator<Book> it = books.iterator();
        
        boolean displayedSome = false;
        while(it.hasNext()) {
            Book b = it.next();
            if(b.getAuthorBirthDayOfWeek().equalsIgnoreCase(dayOfTheWeek)) {
                System.out.println(b.getTitle() + " was written by " + b.getAuthorLastName() + ", who was born on a " + b.getAuthorBirthDayOfWeek());
                displayedSome = true;
            }
        }
        if(displayedSome == false) {
            System.out.println("No authors were born on a " + dayOfTheWeek);
        }
    }
    
    /**
     * Prints all the books published on a given day of the week.
     *
     * @param dayOfTheWeek certain day of the week.
     */
    public void displayAllBooksPublishedOn(String dayOfTheWeek) {
        Collection<Book> books = getCollectionOfItems(); 
        Iterator<Book> it = books.iterator();

        boolean displayedSome = false;
        while(it.hasNext()) {
            Book b = it.next();
            if(b.getDatePublished().getDayOfTheWeek().equalsIgnoreCase(dayOfTheWeek)) {
                System.out.println(b.getTitle() + " was written by " + b.getAuthorLastName() + ", which was published on a " + dayOfTheWeek);
                displayedSome = true;
            }
        }
        if(displayedSome == false) {
            System.out.println("No books were published on a " + dayOfTheWeek);
        }
    }
    
    /**
     * Prints all the books written by authors that have a pseudonym.
     *
     */
    public void displayAllBooksWrittenByAuthorsWithAPseudonym() {
        Collection<Book> books = getCollectionOfItems(); 
        Iterator<Book> it = books.iterator();

        while(it.hasNext()) {
            Book b = it.next();
            if(b.getAuthor().getPseudonym() != null && b.getAuthor().getPseudonym().trim().length() > 0) {
                System.out.println(b.getAuthorLastName() + " wrote " + b.getTitle() + " as " + b.getAuthor().getPseudonym());
            }
        }
    }
    
    public void displayBookWithBiggestPercentageMarkup() {
        Collection<Book> books = getCollectionOfItems(); 
        Iterator<Book> it = books.iterator();
        
        double priceMarkup = 0.0;

        while(it.hasNext()) {
            Book b = it.next();
            System.out.println("");
        }
    }
    
    /**
     * Prints all books that have been written by authors outside of their main genre.
     *
     */
    public void displayAllBooksWrittenOutsideSpecialty() {
        Collection<Book> books = getCollectionOfItems(); 
        Iterator<Book> it = books.iterator();

        while(it.hasNext()) {
            Book b = it.next();
            if(b.getAuthor().getGenre() != b.getGenre()) {
                System.out.println(b.getAuthor().getLastName() + " usually wrote " + b.getAuthor().getGenre().getTheBookType() + 
                " but wrote " + b.getTitle() + " which is " + b.getGenre().getTheBookType());
            }
        }
    }
}