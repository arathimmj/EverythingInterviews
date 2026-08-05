public class trial {

    public static void main(String[] args) {


        String original = "i am arathi";
        String [] originalStringArray = original.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i=originalStringArray.length-1; i>=0; i--){
            System.out.println(originalStringArray[i]);
            reversed.append(originalStringArray[i]).append(" ");
        }
        System.out.println(reversed);
    }
}
