import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
        static class Student{
            String name;
            int kor;
            int eng;
            int math;

            public Student(String name, int kor, int eng, int math){
                this.name = name;
                this.kor = kor;
                this.eng = eng;
                this.math = math;
            }
        }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        ArrayList<Student> input = new ArrayList<>();
        for (int i = 0 ; i< N; i++){
            String[] value = br.readLine().split(" ");
            input.add(i,new Student(value[0],
                    Integer.parseInt(value[1]),
                    Integer.parseInt(value[2]),
                    Integer.parseInt(value[3])));
        }
        input.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.kor == o2.kor) {
                    if (o1.eng == o2.eng) {
                        if (o1.math == o2.math) {
                            return o1.name.compareTo(o2.name);
                        } else {
                            return o2.math - o1.math;
                        }
                    } else {
                        return o1.eng - o2.eng;
                    }
                } else {
                    return o2.kor - o1.kor;
                }
            }
        });

        for (int i =0; i< N; i++){
            bw.write(input.get(i).name + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}