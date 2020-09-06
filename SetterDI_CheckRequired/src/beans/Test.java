package beans;

import org.springframework.beans.factory.annotation.Required;

public class Test {
    private String username;
    private String email;
    private String father;
    private String mother;

    @Required
    public void setUsername(String username) {
        this.username = username;
    }
    @Required
    public void setEmail(String email) {
        this.email = email;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }
    
    public void printData() {
        System.out.println("Name: " + username);
        System.out.println("Email: " + email);
        System.out.println("Father: " + father);
        System.out.println("Mother: " + mother);
    }
}
