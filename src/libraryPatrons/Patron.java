package libraryPatrons;

public class Patron implements IPatron {
    private String lastName;
    private String firstName;
    private Sex sex;
    private int age;
    private String libraryId;
    private String email;

    public Patron(String firstName, String lastName, Sex sex, int age, String libraryId, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.libraryId = libraryId;
        this.email = email;
    }

    @Override
    public String getLibraryId() {
        return libraryId;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public Sex getSex() {
        return sex;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getEmail() {
        return email;
    }
}
