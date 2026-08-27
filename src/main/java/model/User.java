package model;

import java.time.LocalDate;



public class User extends Person{
    private LocalDate registerDate;
    public User(String firstname , String password , String nationalCode , LocalDate registerDate) {

        super (firstname,password,nationalCode);
        this.registerDate=registerDate;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    @Override
    public String toString() {
        return "User{" +
                super.toString() +   // pulls in Person's fields
                ", registerDate=" + registerDate +
                '}';
    }
}
