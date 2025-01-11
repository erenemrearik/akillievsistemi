import java.util.Scanner;

// Her menü seçeneği için Command sınıfları
class AddDeviceCommand implements Command {
    @Override
    public void execute(Scanner scanner, DeviceManager deviceManager, UserManager userManager, SecurityModeManager securityModeManager) {
        deviceManager.addDevice(scanner);
    }
}