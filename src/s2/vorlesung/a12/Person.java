package s2.vorlesung.a12;

public class Person {
    private String firstname, lastname, email;
    private int age;


    public Person(String firstname, String lastname, String email, int age) {
        setFirstname(firstname);
        setLastname(lastname);
        setAge(age);
        setEmail(email);


    }

    public Person(String firstname, String lastname) {
        setFirstname(firstname);
        setLastname(lastname);

    }

    public Person(Person p){

        this(p.firstname, p.lastname);

    }



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
        if(this.age != 0) {
            if (this.email != null) {
                return this.firstname + " " + this.lastname + ", " + this.age + ", hat die Email-Adresse: " + this.email;
            } else {
                return this.firstname + " " + this.lastname + ", " + this.age + ", hat keine Email-Adresse.";
            }
        }else{
            if (this.email != null) {
                return this.firstname + " " + this.lastname +", hat die Email-Adresse: " + this.email;
            } else {
                return this.firstname + " " + this.lastname + ", hat keine Email-Adresse.";
            }
        }
    }
}
