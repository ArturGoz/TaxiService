package artur.goz;

public class Passenger extends User{
    private double walletBalance;
    public Passenger(int id, String name, String email, String password, int walletBalance) {
        super(id, name, email, password);
        this.walletBalance = walletBalance;
    }
    public double getWalletBalance() {
        return walletBalance;
    }

    public void addToWallet(double amount) {
        this.walletBalance += amount;
    }

    public boolean deductFromWallet(double amount) {
        if (walletBalance >= amount) {
            walletBalance -= amount;
            return true;
        }
        return false;
    }
}
