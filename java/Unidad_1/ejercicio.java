
import java.util.Stack;

public class ejercicio {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();
        System.out.println(stack.empty());

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");

        String myFavGame = stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.search("Minecraft"));
        System.out.println(stack);
        Hola.main(args);
    }

}
