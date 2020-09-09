import java.util.Map;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BalancedParenthesis {
    static Map<Character, Character> pairs;

    static {
        char[][] pairArray = {
                {'{', '}' },
                {'[', ']' },
                {'(', ')' }
        };

        pairs = Stream.of(pairArray)
                .collect(Collectors.toMap(k -> k[0], v -> v[1]));
    }


    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (pairs.containsKey(c)) {
                stack.push(c);
            } else {
                if(stack.empty() || pairs.get(stack.pop()) != c) {
                    return false;
                }
            }
        }

        return stack.empty();
    }
}
