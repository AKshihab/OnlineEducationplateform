public class Administrator extends User {
    private int addedUsers;
    private int deletedUsers;

    public Administrator(String name, String email) {
        super(name, email);
        addedUsers = 0;
        deletedUsers = 0;
    }

    public void addUser(String userName) {
        addedUsers++;
        System.out.println("Administrator added user: " + userName);
    }

    public void deleteUser(String userName) {
        deletedUsers++;
        System.out.println("Administrator deleted user: " + userName);
    }

    @Override
    public void performRole() {
        System.out.println("\n--- Administrator Role ---");
        showBasicInfo();
        System.out.println("User Management Summary:");
        System.out.println("Users Added  : " + addedUsers);
        System.out.println("Users Deleted: " + deletedUsers);
    }
}
