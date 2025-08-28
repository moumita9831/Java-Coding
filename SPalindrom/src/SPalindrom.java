public class SPalindrom {
    public static void main(String[] args) {
        String num = "ruro";
        int n = num.length();
        StringBuilder sb = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            sb.append(num.charAt(i));
        }

        if (num.equals(sb.toString())) {
            System.out.println("Palimdrom");
        } else {
            System.out.println("Non-Palindrom");
        }
    }
}
