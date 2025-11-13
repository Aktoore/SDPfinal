public abstract class User {
    protected String name;
    protected String email;
    protected String phone;
    protected String id;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
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
}