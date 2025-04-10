package model;

import model.interfaces.identifiable;

public abstract class user implements identifiable {

    protected String id;
    protected String name;
    protected String email;

    public user (String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public abstract void showDetails();


    public void checkEmail() {

    }

    public void IdGenrator() {

    }

    @Override
    public String getId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }
    
}
