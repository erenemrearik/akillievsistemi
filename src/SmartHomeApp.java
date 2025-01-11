import java.util.*;

// Ana uygulama sınıfı
public class SmartHomeApp {

    public static void main(String[] args) {
        SmartHomeApp app = new SmartHomeApp();
        app.run();
    }

    // Singleton deseni kullanılarak yöneticiler tanımlandı
    private final DeviceManager deviceManager = DeviceManager.getInstance();
    private final UserManager userManager = UserManager.getInstance();
    private final SecurityModeManager securityModeManager = SecurityModeManager.getInstance();

    public void run() {
        Scanner scanner = new Scanner(System.in);
        CommandFactory commandFactory = new CommandFactory();

        int choice;
        do {
            // Menü seçeneklerini göster
            System.out.println("\n==== Akıllı Ev Sistemi ====");
            System.out.println("1. Cihaz Ekle");
            System.out.println("2. Cihaz Aç/Kapat");
            System.out.println("3. Güvenlik Modunu Değiştir");
            System.out.println("4. Kullanıcı Ekle");
            System.out.println("5. Çıkış Yap");
            System.out.print("Seçiminiz: ");

            // Kullanıcı girişini doğrula
            while (!scanner.hasNextInt()) {
                System.out.print("Lütfen geçerli bir değer girin: ");
                scanner.next();
            }

            choice = scanner.nextInt();
            scanner.nextLine(); // Yeni satırı temizle

            // Command deseni kullanılarak seçime göre işlem yapılır
            Command command = commandFactory.getCommand(choice);
            if (command != null) {
                command.execute(scanner, deviceManager, userManager, securityModeManager);
            } else if (choice == 5) {
                System.out.println("Çıkış yapılıyor...");
            } else {
                System.out.println("Geçersiz değer. Lütfen tekrar deneyin.");
            }
        } while (choice != 5);
    }
}