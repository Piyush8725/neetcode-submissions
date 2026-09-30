class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> v = new Stack<>();
        Stack<Integer> i = new Stack<>();
        int[] res = new int[temperatures.length];
        int a = 0;
        v.push(temperatures[0]);
        i.push(0);
        a++;
        while (!v.isEmpty() && a < temperatures.length) {
            while (!v.isEmpty()&&v.peek() < temperatures[a]) {
                res[i.peek()] = a - i.peek();
                v.pop();
                i.pop();
            }
             if(!v.isEmpty() &&v.peek() >= temperatures[a]) {
                v.push(temperatures[a]);
                i.push(a);
            }

            if (v.isEmpty() && a < temperatures.length) {
                v.push(temperatures[a]);
                i.push(a);
            }
            a++;
        }
        return res;
    }
}
