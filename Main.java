public class Main {
    public static void main(String[] args) {
        BankDetails account = new BankDetails(1000); // Initial balance
        Atm atm = new Atm(account);
        atm.showMenu();
    }
}
