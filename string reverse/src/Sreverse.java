public class Sreverse {
    public static void main(String[] args){
        String name = "Moumita";
        int n = name.length();
//        String s = "";
        StringBuilder s = new StringBuilder();
        for (int i=n-1; i>=0; i--){
//         s = s+name.charAt(i);
            s.append(name.charAt(i));
        }
        System.out.println(s.toString());
    }
}
