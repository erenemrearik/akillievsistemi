import java.util.Scanner;

// Singleton deseni ile güvenlik modu yönetimi
class SecurityModeManager {
    private static final SecurityModeManager INSTANCE = new SecurityModeManager();
    private String currentMode = "Belirlenmedi";

    private SecurityModeManager() {}

    public static SecurityModeManager getInstance() {
        return INSTANCE;
    }

    public void changeSecurityMode(Scanner scanner, DeviceManager deviceManager) {
        // Güvenlik modlarını listele
        System.out.println("Güvenlik Modları:");
        System.out.println("1. Ev Modu");
        System.out.println("2. Dışarı Modu");
        System.out.print("Bir mod seçin (1 veya 2): ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 -> setMode("Ev Modu");
            case 2 -> {
                setMode("Dışarı Modu");
                // Iterator deseni ile cihazları kapat
                for (Device device : deviceManager) {
                    if (device.isOn()) {
                        device.turnOff();
                        System.out.println("Cihaz " + device.getName() + " kapatıldı (Dışarı Modu).");
                    }
                }
            }
            default -> System.out.println("Geçersiz seçim.");
        }
    }

    private void setMode(String mode) {
        currentMode = mode;
        System.out.println("Güvenlik modu değiştirildi: " + currentMode);
        UserManager.getInstance().notifyAllUsers("Güvenlik modu değiştirildi: " + currentMode);
    }
}