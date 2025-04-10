package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Member Class.
 */
public class Member  extends user{

    private List<loan> loans = new ArrayList<>();    

    private int Credits;

    /**
     * Constructor.
     * @param fname requirment
     * @param lname requirment
     * @param email recommended
     */
    public Member(String name, String email, String id) {
        super(email, name, email);
    }

    public void addLoan(loan loan) {
        loans.add(loan);
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


    @Override
    public void showDetails() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showDetails'");
    }


    
    
}
