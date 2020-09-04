package springdemo;

public class Test {
    private String name;
    private int age;
    private String email;
    private String gender;

    public Test(String name, int age, String email, String gender) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
    }
    
    public void hello() {
        System.out.println("Hello! My name is "+name+". I'm "+age+"years old."+" Email id is "+email+" and gender is "+gender+".");
    }
}