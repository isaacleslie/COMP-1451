/**
 * Class Author holds various information about an Author from a Book.
 */
class Author
{
    private Date birthDate;
    private Name name;
    private BookType genre;
    private String pseudonym;

    /**
     * Initializes a Date as the birthdate, a Name for the author's name, the genre, 
     * and the author's pseudonym.
     *
     * @param birthDate author's date of birth
     * @param name author's name
     * @param bookType book's genre
     * @param pseudonym author's stage name
     */
    public Author(Date birthDate, Name name, BookType bookType, 
        String pseudonym) {
        setBirthDate(birthDate);
        setName(name);
        setGenre(bookType);
        setPseudonym(pseudonym);
    }

    /**
     * Mutator for the date of birth.
     *
     * @param birthDate author's date of birth
     */
    public void setBirthDate(Date birthDate) {
        if  (birthDate != null) {
            this.birthDate = birthDate;
        }
    }

    
    /**
     * Mutator for the name of the author.
     *
     * @param name name of author
     */
    public void setName(Name name) {
        if  (name != null) {
            this.name = name;
        }
    }

    /**
     * Mutator for the genre of the book.
     *
     * @param bookType book's genre
     */
    public void setGenre(BookType bookType) {
        this.genre      = bookType;
    }

    /**
     * Mutator for the pseudonym of the author.
     *
     * @param pseudonym author's stage name
     */
    public void setPseudonym(String pseudonym){
        if  (pseudonym != null) {
            this.pseudonym = pseudonym;
        }
        else{
            pseudonym = "";
        }
    }

    /**
     * Accessor for the date of birth.
     *
     * @return date of birth
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * Accessor for the name of the author.
     *
     * @return name of author
     */
    public Name getName() {
        return name;
    }

    /**
     * Returns only the last name of the author.
     *
     * @return last name of the author
     */
    public String getLastName() {
        return name.getLastName();
    }
    /**
     * Accessor for the author's main genre.
     *
     * @return author's genre
     */
    public BookType getGenre() {
        return genre;
    }

    /**
     * Accessor for the pseudonym of the author
     *
     * @return author's stage name
     */
    public String getPseudonym() {
        return pseudonym;
    }

    /**
     * Uses the Name class's getFullName() method to return the author's full name
     * in one String.
     *
     * @return author's full name
     */
    public String getAuthorFullName() {
        String authorFullName = "";

        authorFullName = name.getFullName();
        return authorFullName;
    }
    
    /**
     * Accessor that finds which day of the week the author's birthday is.
     *
     * @return day of the week
     */
    public String getBirthDayOfWeek() {
        return birthDate.getDayOfTheWeek();
    }
    
    /**
     * Accessor for the year of birth for an author.
     *
     * @return year of birth
     */
    public int getBirthYear() {
        return birthDate.getYear();
    }
}