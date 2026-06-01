class AccountMain {
    public static void main(String[] args) {
        Account a1 = new Account("", 500);       
        Account a2 = new Account("ACC123", -10); 
        Account a3 = new Account("ACC456", 2500); 
        System.out.println("\nValid Account Details:");
        a3.display();
    }
}