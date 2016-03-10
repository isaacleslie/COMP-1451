/**
 * Class Book is a child class of Item. It has an Author, a publishing date, title, and genre. 
 * It also uses class Item's unique ID as an ISBN.
 */
class Book extends Item
{
    private Author author;
    private Date datePublished;
    private String title;
    private BookType genre;

    /**
     * Initializes the Item parameters, then the Author parameters, a publishing Date, a title and a genre.
     *
     * @param weightInKg weight
     * @param manufacturingPriceDollars manufacturing price in dollars
     * @param suggestedRetailPriceDollars suggested retail price in dollars
     * @param uniqueID unique String identifier for the Item
     * @param author an Author object
     * @param datePublished book's date of publishing
     * @param title the title of the book
     * @param bookType the genre of the book
     */
    public Book(double weightInKg, double manufacturingPriceDollars,
    double suggestedRetailPriceDollars, String uniqueID, 
    Author author, Date datePublished, String title, BookType bookType) {
        super(weightInKg, manufacturingPriceDollars, suggestedRetailPriceDollars, uniqueID);
        setAuthor(author);
        setDatePublished(datePublished);
        setTitle(title);
        this.genre = bookType;
    }

    /**
     * Accessor for the author's object.
     *
     * @return the author object of the book
     */
    public Author getAuthor() {
        return author;
    }
    
    /**
     * Returns the last name of the author using the Author class's getLastName() method.
     *
     * @return last name of the author
     */
    public String getAuthorLastName() {
        return author.getLastName();
    }

    /**
     * Accessor for a Date of the date the book was published.
     *
     * @return a Date object of the date the book was published
     */
    public Date getDatePublished() {
        return datePublished;
    }

    /**
     * Accessor for the title of the book.
     *
     * @return title of the book
     */
    public String getTitle() {
        return title;
    }

    /**
     * Accessor for the genre of the book.
     *
     * @return genre of the book
     */
    public BookType getGenre() {
        return genre;
    }

    /**
     * Mutator for the Author of the book.
     *
     * @param author an Author object
     */
    public void setAuthor(Author author) {
        if  (author != null) {
            this.author = author;
        }
    }

    /**
     * Mutator for the date of publication.
     *
     * @param datePublished a Date object
     */
    public void setDatePublished(Date datePublished) {
        if  (datePublished != null) {
            this.datePublished = datePublished;
        }
    }

    /**
     * Mutator for the title of the book.
     *
     * @param title title of the book
     */
    public void setTitle(String title) {
        if  (title != null) {
            this.title = title;
        }
        else{
            System.out.println("Not a valid title");
        }
    }

    /**
     * Mutator for the genre of the book.
     *
     */
    public void setGenre() {
        this.genre = genre;
    }

    /**
     * Accessor for the full name of the author, uses the Author class's method of returning a full name.
     *
     * @return author's full name
     */
    public String getAuthorFullName() {
        String fullAuthorName = "";

        fullAuthorName = author.getAuthorFullName();
        return fullAuthorName;
    }

    /**
     * Accessor for year of publication, as opposed to the full date.
     *
     * @return year of publication
     */
    public int getYearPublished() {
        int yearPublished = 0;

        yearPublished = datePublished.getYear();
        return yearPublished;
    }

    /**
     * Mutator for the ISBN of the book, which uses the superclass Item's uniqueID.
     *
     * @param uniqueID unique ID of the book
     */
    public void setISBN(String uniqueID) {
        super.setUniqueID(uniqueID);
    }

    /**
     * Acessor for the ISBN of the book, which uses the superclass Item's unique ID.
     *
     * @return unique ID of the book
     */
    public String getISBN() {
        return super.getUniqueID();
    }

    /**
     * Returns the genre of the book as a string rather than a BookType.
     *
     * @return string of the book's genre
     */
    public String getGenreString() {
        return genre.getTheBookType();
    }
    
    /**
     * Accessor for the author's pseudonym, which is needed for the BookStore.
     *
     * @return author's stage name
     */
    public String getAuthorPseudonym() {
        return author.getPseudonym();
    }
    
    /**
     * Accessor for the author's birth date as a Date object. Needed for BookStore.
     *
     * @return author's birth date
     */
    public Date getAuthorBirthDate() {
        return author.getBirthDate();
    }
    
    /**
     * Accessor for the day of the week the author's birthday is on. Needed for BookStore.
     *
     * @return day of the week
     */
    public String getAuthorBirthDayOfWeek() {
        return author.getBirthDayOfWeek();
    }
    
    /**
     * Uses the Author class's getBirthYear() method to return the author's year of birth only.
     *
     * @return author's year of birth
     */
    public int getAuthorBirthYear(){
        return author.getBirthYear();
    }
}