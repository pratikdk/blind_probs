public class Test29 {
    public static void main(String[] args) {
        String x = "नमस्ते दुनिया";
        System.out.println(Character.getNumericValue(x.charAt(1)));
        System.out.println("" + (char)Character.getNumericValue(x.charAt(1)));
        System.out.println("" + (char)-1);
    }
}
