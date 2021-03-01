package vorlesung.v6.a12;

public class Person {
    private String firstname, lastname, email;
    private int age;



    public String getStatus() {
        if(this.email != null) {
            return this.firstname + " " + this.lastname + ", " + this.age + ", hat die Email-Adresse: " + this.email;
        }else{
            return this.firstname + " " + this.lastname + ", " + this.age + ", hat keine Email-Adresse.";
        }
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        if(firstname != null) {
            this.firstname = firstname;
        }
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        if (firstname != null) {
            this.lastname = lastname;
        }
    }
}
