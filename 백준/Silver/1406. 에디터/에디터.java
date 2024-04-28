import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String string = br.readLine();
        LinkedList<Character> textLink = new LinkedList<Character>();

        for (int i = 0; i < string.length(); i++) { textLink.add(string.charAt(i));}
        int n = Integer.parseInt(br.readLine());

        ListIterator<Character> textListIterator = textLink.listIterator();
        while (textListIterator.hasNext()) { textListIterator.next(); }

        for (int i = 0; i < n; i++) {
            String order = br.readLine();
            char code = order.charAt(0);

            switch (code) {
                case 'L':
                    if (textListIterator.hasPrevious()) {
                        textListIterator.previous();
                    }
                    break;
                    
                case 'D':
                    if (textListIterator.hasNext()) {
                        textListIterator.next();
                    }
                    break;
                case 'B':
                    if (textListIterator.hasPrevious()) {
                        textListIterator.previous();
                        textListIterator.remove();
                    }
                    break;
                case 'P':
                    char value = order.charAt(2);
                    textListIterator.add(value);
                    break;
            }
        }

        while (textListIterator.hasPrevious()) {
            textListIterator.previous();
        }
        for (char s : textLink) {
            bw.write(s);
        }
        bw.flush();
        bw.close();
        br.close();
	}
}

