class Solution {
    public boolean isValid(String s) {
        if (s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']') {
            return false;
        };
        Stack<String> a = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                a.push("(");
            } else if (s.charAt(i) == '{') {
                a.push("{");
            } else if (s.charAt(i) == '[') {
                a.push("[");
            }
            if (!a.isEmpty()) {
                if (s.charAt(i) == ')' && !a.isEmpty()) {
                    if (a.peek() == "(") {
                        a.pop();
                    } else {
                        return false;
                    }
                } else if (s.charAt(i) == '}' && !a.isEmpty()) {
                    if (a.peek() == "{") {
                        a.pop();
                    } else {
                        return false;
                    }
                } else if (s.charAt(i) == ']' && !a.isEmpty()) {
                    if (a.peek() == "[") {
                        a.pop();
                    } else {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }

        if (a.isEmpty()) {
            return true;
        }
        return false;
    }
}
