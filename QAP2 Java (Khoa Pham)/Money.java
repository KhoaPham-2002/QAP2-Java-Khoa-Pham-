public class Money {
    private long dollars;
    private long cents;

    // Constructor to initialize money amount
    public Money(double amount) {
        this.dollars = (long) amount;
        this.cents = Math.round((amount - this.dollars) * 100);
    }

    // Copy constructor
    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }

    // Getters
    public long getDollars() {
        return dollars;
    }

    public long getCents() {
        return cents;
    }

    // Add another Money amount
    public Money add(Money other) {
        long totalCents = (this.dollars * 100 + this.cents) + (other.dollars * 100 + other.cents);
        return new Money(totalCents / 100.0);
    }

    // Compare two Money objects
    public int compareTo(Money other) {
        long thisTotalCents = this.dollars * 100 + this.cents;
        long otherTotalCents = other.dollars * 100 + other.cents;
        return Long.compare(thisTotalCents, otherTotalCents);
    }

    // Check if two Money objects are equal
    public boolean equals(Money other) {
        return this.dollars == other.dollars && this.cents == other.cents;
    }

    // toString method to format money
    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }
}

