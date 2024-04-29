import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringBuilder tmpSb = new StringBuilder();     
        int hasGreaterThanSign = 0;
        String[] str = br.readLine().split("");
        for (int i = 0; i < str.length; i++){
            if (str[i].equals(" ")) {
                if (hasGreaterThanSign == 0) {
                    tmpSb.reverse();
                    sb.append(tmpSb);
                    sb.append(" ");
                    tmpSb.setLength(0);
                }else{
                    sb.append(tmpSb);
                    sb.append(" ");
                    tmpSb.setLength(0);
                }
                sb.append(tmpSb);
                tmpSb.setLength(0);
            }else if (str[i].equals("<")) {
                hasGreaterThanSign = 1;
                tmpSb.reverse();
                sb.append(tmpSb);
                sb.append("<");
                tmpSb.setLength(0);
            }else if (str[i].equals(">")) {
                hasGreaterThanSign = 0;
                sb.append(tmpSb);
                sb.append(">");
                tmpSb.setLength(0);
            }else{
                tmpSb.append(str[i]);
                if (i == str.length - 1) {
                    tmpSb.reverse();
                    sb.append(tmpSb);
                }
            }
        }
        System.out.println(sb);
        br.close();
	}
}