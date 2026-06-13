
public class StringCompression {

    public static int compress(char[] chars) {

        int i = 0;
        int write = 0;

        while (i < chars.length) {

            char current = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == current) {
                count++;
                i++;
            }

            chars[write++] = current;

            if (count > 1) {
                String cnt = String.valueOf(count);

                for (char c : cnt.toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }

    public static void main(String[] args) {

        char[] chars = {'a','a','b','b','c','c','c'};

        int len = compress(chars);

        System.out.println("Length = " + len);

        for (int i = 0; i < len; i++) {
            System.out.print(chars[i] + " ");
        }
    }
}
