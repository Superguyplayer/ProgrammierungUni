package vorlesung.v6.a12;

public class Person {
    private String firstname, lastname, email;
    private int age;

    public int getAge() {
        return age;
    }

    public Person setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Person setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getFirstname() {
        return firstname;
    }

    public Person setFirstname(String firstname) {
        if (firstname != null) {
            this.firstname = firstname;
        } else {
            this.firstname = "";
        }
        return this;
    }

    public String getLastname() {
        return lastname;
    }

    public Person setLastname(String lastname) {
        if (firstname != null) {
            this.lastname = lastname;
        } else {
            this.lastname = "";
        }
        return this;
    }


    public String getStatus() {
        if (this.email != null) {
            return this.firstname + " " + this.lastname + ", " + this.age + ", hat die Email-Adresse: " + this.email;
        } else {
            return this.firstname + " " + this.lastname + ", " + this.age + ", hat keine Email-Adresse.";
        }
    }
}
