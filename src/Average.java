public class Average {
    public static void main(String[] args) {
        int c = 0, n = (int) (Math.random() * 100);
        for (int i = 0; i < n; i++) {
            int a = (int) (Math.random() * 100);
            c += a;
        }
        float z = (float) c / n;
        System.out.println("Среднее арифметическое: " + z);
    }
}
