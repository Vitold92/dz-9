public class Main {
    public static void main(String[] args) {
        Man mykola = new Man("Микола", "Ткач", 66, "Mustache");
        Woman anastasiia = new Woman("Анастасія", "Ткач", 61, true);

        mykola.registerPartnership(anastasiia);

        System.out.println(mykola.getFirstName() + " " + mykola.getLastName() + " and " +
                anastasiia.getFirstName() + " " + anastasiia.getLastName() + " are partners.");

        System.out.println(mykola.getFirstName() + " is retired: " + mykola.isRetired());
        System.out.println(anastasiia.getFirstName() + " is retired: " + anastasiia.isRetired());

        // Виклик методів для чоловіка і жінки
        mykola.retire();
        anastasiia.retire();
    }
}
