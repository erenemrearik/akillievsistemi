// Factory Deseni: Command nesneleri oluşturur
class CommandFactory {
    public Command getCommand(int choice) {
        return switch (choice) {
            case 1 -> new AddDeviceCommand();
            case 2 -> new ToggleDeviceCommand();
            case 3 -> new ChangeSecurityModeCommand();
            case 4 -> new AddUserCommand();
            default -> null;
        };
    }
}