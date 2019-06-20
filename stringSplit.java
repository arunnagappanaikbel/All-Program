public class stringSplit {
    public static void main(String[] args) {
        String str = "this is example for string token or delimeter using split method you can split";
        String[] arrOfStr = str.split(" ");
       int count= arrOfStr.length;
        System.out.println("The number of items is: " + count);
        for (String a : arrOfStr)
            System.out.println(a);

    }
}
