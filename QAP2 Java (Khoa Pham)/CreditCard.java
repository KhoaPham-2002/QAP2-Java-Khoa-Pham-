public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    // Constructor
    public CreditCard(Person newCardHolder, Money limit) {
        this.owner = newCardHolder;
        this.creditLimit = new Money(limit);
        this.balance = new Money(0);
    }

    // Getters
    public Money getBalance() {
        return new Money(balance);
    }

    public Money getCreditLimit() {
        return new Money(creditLimit);
    }

    public String getPersonals() {
        return owner.toString();
    }

    // Charge to credit card
    public void charge(Money amount) {
        if (balance.add(amount).compareTo(creditLimit) <= 0) {
            balance = balance.add(amount);
            System.out.println("Charge: " + amount);
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    // Make a payment on the credit card
    public void payment(Money amount) {
        long newDollars = balance.getDollars() - amount.getDollars();
        long newCents = balance.getCents() - amount.getCents();

        if (newCents < 0) {
            newDollars -= 1;
            newCents += 100;
        }

        balance = new Money(newDollars + newCents / 100.0);
        System.out.println("Payment: " + amount);
    }
}
