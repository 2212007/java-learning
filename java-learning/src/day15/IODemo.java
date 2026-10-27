package day15;

import java.io.*;

public class IODemo {

    public static void main(String[] args) throws IOException {
        //writeNoclose();

        //version1();
        version2();
    }

    static void writeNoclose() throws IOException {
        FileWriter fw = new FileWriter("test.txt");
        fw.write("Hello World");
        //fw.flush();//用来刷新缓冲区
        System.out.println("File written");
        //System.out.println(new java.io.File("test.txt").getAbsolutePath());
        fw.close();

    }
    static void version1() throws IOException{
        FileWriter fw = new FileWriter("student.txt");
        fw.write("Student 1");
        fw.write("\n");
        fw.write("Student 2");
        fw.write("\n");
        fw.write("Student 3");
        //fw.flush();
        fw.close();
        BufferedReader br = new BufferedReader(new FileReader("student.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();


    }
    static void version2() throws IOException{
        //FileWriter fw = new FileWriter("student0.txt");
        //try 块结束时自动调用 close()，无需显式调用

        //写和读分两个 try 块 ，各管各的生命周期
        try(FileWriter fw = new FileWriter("student0.txt")) {
            fw.write("Student 1\n");
            fw.write("Student 2\n");
            fw.write("Student 3\n");
            //fw.flush();
            System.out.println("File written");

        }

        try(BufferedReader br = new BufferedReader(new FileReader("student0.txt")))
        {
            String line;
            while ((line = br.readLine()) != null) {//=是赋值
                System.out.println(line);
            }
        }
//        try (FileWriter fw = new FileWriter("students.txt");
//             BufferedReader br = new BufferedReader(new FileReader("in.txt"))) {
//            fw.write("张三,18,85.5");
//            String line;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//        }   // 到这里自动 close，正常走完关、中途炸也关，关的顺序和声明相反
    }

}
