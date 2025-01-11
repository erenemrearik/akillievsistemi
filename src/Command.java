import java.util.Scanner;

// Command Deseni: Temel Komut arayüzü
interface Command {
    void execute(Scanner scanner, DeviceManager deviceManager, UserManager userManager, SecurityModeManager securityModeManager);
}