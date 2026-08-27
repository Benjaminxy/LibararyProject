package model;

public class Person {

    private String name;
    private String password;
    private String nationalCode;


    public Person(String name, String password, String nationalCode)
    {

        this.name = name;
        this.password = password;
        this.nationalCode = nationalCode;
    }

    public String getName() {

        return name;
    }
    public String getPassword() {
        return password;
    }
    public String getNationalCode() {
        return nationalCode;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", nationalCode='" + nationalCode + '\'' +
                '}';
    }
}
