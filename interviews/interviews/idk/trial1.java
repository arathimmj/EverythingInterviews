public class trial1 {

    public static void main(String[] args) {
        String name = "Pete";
        int sum = 0;
        for(int i=0;i<name.length();i++){
            sum = sum + name.charAt(i);
        }

        System.out.println(sum%10);
    }
}