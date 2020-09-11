package beans;

public class Test  {

    private String drivername, url, username, password;

    public void setDrivername(String drivername) {
        this.drivername = drivername;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public void myInit() {
        System.out.println("Init Test");
        System.out.println("Driver: "+drivername);
        System.out.println("URL: "+url);
        System.out.println("Username: "+username);
        System.out.println("Password: "+password);
        System.out.println("");
    }

    public void myDestroy() {
        System.out.println("Destroy Test");
    }
    
    public void save(String name) {
        System.out.println("Hello! " + name + ", Save Execution From Test.");
    }
    
}
