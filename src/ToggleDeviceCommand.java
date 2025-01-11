import java.util.Scanner;

class ToggleDeviceCommand implements Command {
    @Override
    public void execute(Scanner scanner, DeviceManager deviceManager, UserManager userManager, SecurityModeManager securityModeManager) {
        deviceManager.toggleDeviceState(scanner);
    }
}