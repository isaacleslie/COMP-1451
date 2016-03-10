/**
 * Class Name holds up to three names per Name object.
 */
class Name
{
    private String firstName;
    private String middleName;
    private String lastName;

    /**
     * Initializes the max of three names.
     *
     * @param firstName first name
     * @param middleName second name
     * @param lastName third name
     */
    public Name(String firstName, String middleName, String lastName) {
        setFirstName(firstName);
        setMiddleName(middleName);
        setLastName(lastName);
    }

    /**
     * Initializes two names.
     *
     * @param firstName first name
     * @param lastName second name
     */
    public Name(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }

    /**
     * Initializes a single name.
     *
     * @param firstName first name
     */
    public Name(String firstName) {
        setFirstName(firstName);
    }

    /**
     * Mutator to change the first name, which is mandatory and must be validated.
     *
     * @param firstName first name
     */
    public void setFirstName(String firstName) {
        if  (firstName != null) {
            this.firstName = firstName;
        }
        else{
            System.out.println("Name can't be null");
        }
    }

    /**
     * Mutator to change the second name, which doesn't need to be validated because it isn't mandatory.
     *
     * @param middleName second name
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * Mutator to change the last name, which doesn't need to be validated because it isn't mandatory.
     *
     * @param lastName third name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Accessor for the first name.
     *
     * @return first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Accessor for the second name.
     *
     * @return The return value
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Accessor for the third name.
     *
     * @return third name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Returns all the names in one String.
     *
     * @return full name
     */
    public String getFullName() {
        String fullName = "";
        if  (firstName != null) {
            fullName = fullName + firstName + " ";
        }
        if  (middleName != null) {
            fullName = fullName + middleName + " ";
        }
        if  (lastName != null) {
            fullName = fullName + lastName + " ";
        }
        return fullName;
    }
}