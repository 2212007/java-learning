package day06;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        int choice;
        do{
            System.out.println("===== 学生管理系统 =====");
            System.out.println("1. 添加学生");
            System.out.println("2. 列出所有学生");
            System.out.println("3. 查找学生");
            System.out.println("4. 更新学生成绩");
            System.out.println("5. 删除学生成绩");
            System.out.println("0. 退出程序");
            System.out.println("请选择 :");
            choice = scanner.nextInt();
            switch(choice){
                case 1 ->{
                    Student s = new Student(scanner.next(), scanner.nextInt(), scanner.nextDouble());
                    //s.setName(scanner.next());
                    //s.setAge(scanner.nextInt());
                    //s.setScore(scanner.nextDouble());
                    boolean result = manager.addStudent(s);
                    if(result){
                        System.out.println("添加成功");
                    }
                    else System.out.println("添加失败");
                }
                case 2 ->manager.listAll();
                case 3 ->{

                    Student s =manager.findById(scanner.nextInt());
                    if(s == null) System.out.println("查无此人");
                    else s.showInfo();
                }
                case 4 ->{
                    boolean result = manager.updateScore(scanner.nextInt(), scanner.nextDouble());
                    if(result){
                        System.out.println("更新成功");
                    }
                    else System.out.println("更新失败");
                }
                case 5 ->{
                    boolean result = manager.deleteById(scanner.nextInt());
                    if(result){
                        System.out.println("删除成功");
                    }
                    else System.out.println("删除失败");
                }
                case 0 -> System.out.println("Exiting program...");
                default ->System.out.println("无效选项");

            }
        }while(choice!=0);
    }


}
