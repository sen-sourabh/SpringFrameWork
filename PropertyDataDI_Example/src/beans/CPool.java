package beans;

public class CPool {
    private String driver, url, username, pwd;

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public void printData() {
        try{
            System.out.println("Driver: "+driver);
            System.out.println("URL: "+url);
            System.out.println("Username: "+username);
            System.out.println("Password: "+pwd);
        }catch(Exception ex) {
            System.out.println("Ex: " + ex.getMessage());
        }
    }
    
}
