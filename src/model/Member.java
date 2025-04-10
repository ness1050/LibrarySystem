package model;

/**
 * Member Class.
 */
public class Member {

    
    private String firstName;
    private String lastName;
    private String id;
    private String email;
    private String numebr;
    private int Credits;

    /**
     * Constructor.
     * @param fname requirment
     * @param lname requirment
     * @param email recommended
     */
    public Member(String fname, String lname, String email) {
        this.firstName = fname;
        this.lastName = lname;
        this.email = email;
    }


    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumebr() {
        return this.numebr;
    }

    public void setNumebr(String numebr) {
        this.numebr = numebr;
    }

    public int getCredits() {
        return this.Credits;
    }

    public void setCredits(int Credits) {
        this.Credits = Credits;
    }



    @Override
    public String toString() {
        return "{" +
            " firstName='" + firstName + "'" +
            ", lastName='" + lastName + "'" +
            ", id='" + id + "'" +
            ", email='" + email + "'" +
            ", numebr='" + numebr + "'" +
            ", Credits='" + Credits + "'" +
            "}";
    }


    
    
}
