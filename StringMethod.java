public class StringMenthod {
    public static void main(String[] args) {
        String name = "Aditya Wagh";
        System.out.println("The Given String is: " + name);

        System.out.println("the length is: " + name.length());
        System.out.println("the LowerCase is: " + name.toLowerCase());
        System.out.println("the UpperCase is: " + name.toUpperCase());
        System.out.println("the Trimmed is: " + name.trim());
        System.out.println("The Substring is: " + name.substring(0, 6));
        System.out.println("The CharAt is: " + name.charAt(0));
        System.out.println("The Index of is: " + name.indexOf("W"));
        System.out.println("The Replaced is: " + name.replace("Aditya", "Adi"));
    }
}
