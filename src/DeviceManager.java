import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

// Singleton deseni ile cihaz yönetimi
class DeviceManager implements Iterable<Device> {
    private static final DeviceManager INSTANCE = new DeviceManager();
    private final List<Device> devices = new ArrayList<>();

    private DeviceManager() {} // Singleton için özel yapılandırıcı

    public static DeviceManager getInstance() {
        return INSTANCE;
    }

    public void addDevice(Scanner scanner) {
        System.out.print("Cihaz ismini girin: ");
        String deviceName = scanner.nextLine().trim();
        if (!deviceName.isEmpty()) {
            devices.add(new Device(deviceName));
            System.out.println("Cihaz eklendi: " + deviceName);
        } else {
            System.out.println("Cihaz ismi boş olamaz.");
        }
    }

    public void toggleDeviceState(Scanner scanner) {
        if (devices.isEmpty()) {
            System.out.println("Hiçbir cihaz mevcut değil.");
            return;
        }

        // Mevcut cihazları listele
        System.out.println("Mevcut cihazlar:");
        int index = 1;
        for (Device device : this) { // Iterator deseni kullanımı
            System.out.printf("%d. %s (%s)\n", index++, device.getName(), device.isOn() ? "Açık" : "Kapalı");
        }

        System.out.print("Cihaz seçiniz: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice > 0 && choice <= devices.size()) {
            Device device = devices.get(choice - 1);
            device.toggle();
            System.out.println("Cihaz " + device.getName() + " artık " + (device.isOn() ? "Açık" : "Kapalı"));
        } else {
            System.out.println("Geçersiz seçim.");
        }
    }

    @Override
    public Iterator<Device> iterator() {
        return devices.iterator(); // Cihaz listesi için iterator döndür
    }
}