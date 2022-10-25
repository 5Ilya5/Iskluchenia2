public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String numAsSyr = scanner.nextLine();{
    try {
        double d = Double.parseDouble(numAsSyr.trim());
    }catch (NumberFormatException ex) {
        System.out.println("Не число или пустая строка!");
    }
}
}