public abstract class User {
    protected String name;
    protected String email;
    protected String phone;
    protected String id;
    protected String password;

    public User(String name, String email,String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
    public abstract void register();
    public abstract String getUserType();


    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }
    public String getId() {
        return id;
    }
    public String getName() {return name;}

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean checkPassword(String password) {
        return this.password != null && this.password.equals(password);
    }
}