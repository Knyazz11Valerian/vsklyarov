public class CW0410 {
    public static void main(String[] args) {
        System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⡜⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⡟⣟⣛⣛⡛⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢃⣿⡜⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⡇⣧⠄⠄⠱⡘⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠉⠄⠄⠘⣿⠇⠄⠄⠉⠱⢻⣿⡟⢿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣧⣝⡲⢤⠄⠈⠢⡹⣿⣿⣿⣿⠟⠁⠄⠄⡀⠄⠄⢠⠶⢄⠄⠄⠄⢀⢀⠘⢱⢸⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣶⣱⢄⠄⠈⠬⡛⢻⠟⠄⢰⠄⠄⠘⣃⣶⣘⣿⣈⣼⣷⣄⠄⠈⠁⠸⢸⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣆⢣⣀⠄⢡⠈⢀⠄⠸⠇⠄⣴⠿⡿⣻⣿⣿⣿⠟⢛⡓⡄⠄⠄⠈⠋⢹⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣶⠾⠯⠔⡴⠺⡠⠾⢛⢁⣴⣶⣿⢈⣿⠿⢿⣔⠿⠂⡙⡆⡀⡀⣤⣾⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣷⣬⠍⣁⢣⣀⠇⠰⣷⣸⣮⣭⣶⣿⣧⣛⣸⠻⢿⡇⠓⡁⢃⠌⣽⣿⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⡏⠼⢛⣱⣷⠄⠙⢿⣷⡬⢙⡛⣿⣿⣿⣿⡿⠷⠁⡟⠄⠄⡆⣉⠛⠻⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠄⠄⠉⠐⠄⠙⣼⡛⠿⠟⣴⠌⠄⠻⢦⣤⢃⢠⣄⠳⣝⢻⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⠄⠈⢁⡄⢰⣷⠸⠈⠐⠆⠆⠂⢁⣻⠄⣿⢸⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⠄⠄⠄⠄⠄⠄⠄⠄⠙⠓⠘⣿⡄⢻⡆⠄⠄⠄⠸⣿⠄⢹⡌⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣄⠄⡀⠄⠄⠄⠄⠄⠘⠄⢐⠸⣧⠘⣿⠄⠄⠄⠄⢻⡆⠈⣷⢹⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣿⣶⣦⠄⢀⡄⠉⠒⠬⡅⣿⠄⠻⣤⡀⠄⠄⣾⠇⢠⠏⣾⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢋⢃⢠⡾⠁⠄⠠⠁⠄⠈⠑⢦⣈⠙⢶⣴⠏⠄⠎⣾⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢣⡿⣾⠇⠄⠄⠄⢹⠄⠇⢹⠄⣈⡓⣄⡈⡈⣴⣼⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣜⠇⣿⠄⠘⠋⠂⠊⠢⢴⠊⠈⠈⠁⠁⣄⠄⣤⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣯⣤⠄⠄⡀⢰⣶⣶⣶⣦⠂⡀⠄⣠⣾⣿⣿⣿⣿⣿⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⣈⠒⣸⣿⣿⣿⣿⠨⠮⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿");
    }
}
