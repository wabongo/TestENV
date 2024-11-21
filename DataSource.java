class DataSource {
    void execute() {
        System.out.println("Executing operation in DataSource");
    }
}

class Account extends DataSource {
    private int id;
    private String name;
    private String myData;

    public Account(int id, String name, String myData) {
        this.id = id;
        this.name = name;
        this.myData = myData;
    }

    public void performOperation() {
        execute();
        System.out.println("Account operation performed for: " + name);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMyData() {
        return myData;
    }
}

class Admin extends Account {
    private String authPassword;

    public Admin(int id, String name, String myData, String authPassword) {
        super(id, name, myData);
        this.authPassword = authPassword;
    }

    public void performAdminOperation() {
        execute();
        System.out.println("Admin operation performed for: " + getName());
    }

    public String getAuthPassword() {
        return authPassword;
    }
}

class User extends Account {
    private String user;

    public User(int id, String name, String myData, String user) {
        super(id, name, myData);
        this.user = user;
    }

    public void performUserOperation() {
        execute();
        System.out.println("User operation performed for: " + getName());
    }

    public String getUser() {
        return user;
    }
}

class Update extends DataSource {
    @Override
    void execute() {
        System.out.println("Executing update operation...");
    }

    public void updateData() {
        execute();
        System.out.println("Data updated successfully.");
    }
}

class Delete extends DataSource {
    @Override
    void execute() {
        System.out.println("Executing delete operation...");
    }

    public void deleteData() {
        execute();
        System.out.println("Data deleted successfully.");
    }
}

class View extends DataSource {
    @Override
    void execute() {
        System.out.println("Executing view operation...");
    }
}
