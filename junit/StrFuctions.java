package Day_7;

public class StrFuctions {
	public static void main(String[] args) {
        String text = "  Apple Pie  ";
        String fruit = "Banana";
        String code = "AB-123-CD";
        String list = "Red,Green,Blue";
        String animal = "Elephant";
        String empty = "   ";

        int len = text.length();
        char ch = fruit.charAt(2);
        String sub = code.substring(3, 6);
        String lower = fruit.toLowerCase();
        String upper = fruit.toUpperCase();
        String clean = text.strip();
        String rep = code.replace('A', 'X');
        String[] parts = list.split(",");
        int idx = animal.indexOf("ph");
        boolean has = animal.contains("ant");
        boolean eq = fruit.equalsIgnoreCase("BANANA");
        boolean blank = empty.isBlank();
        String repStr = "Ha".repeat(3);

        System.out.println(len);
        System.out.println(ch);
        System.out.println(sub);
        System.out.println(lower);
        System.out.println(upper);
        System.out.println(clean);
        System.out.println(rep);
        System.out.println(parts[0]);
        System.out.println(idx);
        System.out.println(has);
        System.out.println(eq);
        System.out.println(blank);
        System.out.println(repStr);
    }

}
