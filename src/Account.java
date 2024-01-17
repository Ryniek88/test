public class Account {
    private int number;
    private int balance;
    private String name;
    private String email;
    private int phone;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void depositing (int deposit){
        balance += deposit;
        System.out.println(balance);
    }

    public void withdrawing (int withdraw){
        if (balance<withdraw) {
            System.out.println("You have not enough money");
            System.out.println("you still have  " + balance);
        } else {
            balance -= withdraw;

        }


    }
}
