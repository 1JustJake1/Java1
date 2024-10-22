import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Room room = new Room("Делюкс", 2, 101, "Wi-Fi, Кондиціонер");

        Customer customer = new Customer.Builder()
                .setFirstName("Іван")
                .setLastName("Петренко")
                .setDocumentId("AB123456")
                .setBirthDate(LocalDate.of(1990, 5, 12))
                .build();

        System.out.println("Тип номера: " + room.getType());
        System.out.println("Кількість ліжок: " + room.getBedCount());
        System.out.println("Номер кімнати: " + room.getRoomNumber());
        System.out.println("Зручності: " + room.getAmenities());

        System.out.println("Ім'я замовника: " + customer.getFirstName());
        System.out.println("Прізвище замовника: " + customer.getLastName());
        System.out.println("Документ: " + customer.getDocumentId());
        System.out.println("Дата народження: " + customer.getBirthDate());
    }
}
