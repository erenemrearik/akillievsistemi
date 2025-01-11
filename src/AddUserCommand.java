import java.util.Scanner;

class AddUserCommand implements Command {
    @Override
    public void execute(Scanner scanner, DeviceManager deviceManager, UserManager userManager, SecurityModeManager securityModeManager) {
        userManager.addUser(scanner);
    }
}