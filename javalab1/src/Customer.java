import java.util.Objects;
import java.time.LocalDate;

public class Customer {
    private final String firstName;
    private final String lastName;
    private final String documentId;
    private final LocalDate birthDate;

    private Customer(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.documentId = builder.documentId;
        this.birthDate = builder.birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDocumentId() {
        return documentId;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    //toString
    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", documentId='" + documentId + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

    //equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(firstName, customer.firstName) &&
                Objects.equals(lastName, customer.lastName) &&
                Objects.equals(documentId, customer.documentId) &&
                Objects.equals(birthDate, customer.birthDate);
    }

    //hashCode
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, documentId, birthDate);
    }

    //Builder
    public static class Builder {
        private String firstName;
        private String lastName;
        private String documentId;
        private LocalDate birthDate;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setDocumentId(String documentId) {
            this.documentId = documentId;
            return this;
        }

        public Builder setBirthDate(LocalDate birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }
}
