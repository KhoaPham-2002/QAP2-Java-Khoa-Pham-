public class CreditCardDemo {
    public static void main(String[] args) {
        // Define Money amounts
        final Money limit = new Money(1000);
        final Money firstAmount = new Money(200);
        final Money secondAmount = new Money(10.02);
        final Money thirdAmount = new Money(25);
        final Money fourthAmount = new Money(990);

        // Create Person and Address
        Address address = new Address("237J Harvey Hall", "Menomonie", "WI", "54751");
        Person owner = new Person("Christie", "Diane", address);

        // Create CreditCard
        CreditCard visa = new CreditCard(owner, limit);

        // Display cardholder details
        System.out.println(visa.getPersonals());
        System.out.println("Balance: " + visa.getBalance());
        System.out.println("Credit Limit: " + visa.getCreditLimit());
        System.out.println();

        // Attempting transactions
        System.out.println("Attempt to charge " + firstAmount);
        visa.charge(firstAmount);
        System.out.println("Balance: " + visa.getBalance());

        System.out.println("Attempt to charge " + secondAmount);
        visa.charge(secondAmount);
        System.out.println("Balance: " + visa.getBalance());

        System.out.println("Attempt to pay " + thirdAmount);
        visa.payment(thirdAmount);
        System.out.println("Balance: " + visa.getBalance());

        System.out.println("Attempt to charge " + fourthAmount);
        visa.charge(fourthAmount);
        System.out.println("Balance: " + visa.getBalance());
    }
}
