import java.util.Scanner;

class ChangeSecurityModeCommand implements Command {
    @Override
    public void execute(Scanner scanner, DeviceManager deviceManager, UserManager userManager, SecurityModeManager securityModeManager) {
        securityModeManager.changeSecurityMode(scanner, deviceManager);
    }
}