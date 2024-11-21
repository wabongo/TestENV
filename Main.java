public class Main {
    public static void main(String[] args) {
        // Create and test DataSource operations
        System.out.println("Testing DataSource operations:");
        DataSource dataSource = new DataSource();
        dataSource.execute();
        System.out.println();

        // Create and test Account operations
        System.out.println("Testing Account operations:");
        Account account = new Account(1, "John Doe", "Some data");
        account.performOperation();
        System.out.println("Account ID: " + account.getId());
        System.out.println("Account Name: " + account.getName());
        System.out.println("Account Data: " + account.getMyData());
        System.out.println();

        // Create and test Admin operations
        System.out.println("Testing Admin operations:");
        Admin admin = new Admin(2, "Admin User", "Admin data", "admin123");
        admin.performAdminOperation();
        System.out.println("Admin Password: " + admin.getAuthPassword());
        System.out.println();

        // Create and test User operations
        System.out.println("Testing User operations:");
        User user = new User(3, "Regular User", "User data", "user123");
        user.performUserOperation();
        System.out.println("User Username: " + user.getUser());
        System.out.println();

        // Create and test Update operations
        System.out.println("Testing Update operations:");
        Update update = new Update();
        update.updateData();
        System.out.println();

        // Create and test Delete operations
        System.out.println("Testing Delete operations:");
        Delete delete = new Delete();
        delete.deleteData();
        System.out.println();

        // Create and test View operations
        System.out.println("Testing View operations:");
        View view = new View();
        view.execute();
    }
}
