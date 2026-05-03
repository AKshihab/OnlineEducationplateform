public abstract class User {
    protected String name;
    protected String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void showBasicInfo() {
        System.out.println("Name : " + name);
        System.out.println("Email: " + email);
    }

    public abstract void performRole();
}
