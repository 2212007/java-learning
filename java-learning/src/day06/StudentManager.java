package day06;

public class StudentManager {
    private Student[] students = new Student[100];
    private int count = 0;
    public boolean addStudent(Student s){
        if(count==students.length)return false;
        students[count] = s;
        count++;
        return true;
    }
    public void listAll(){
        for(int i=0;i<count;i++){
            students[i].showInfo();
        }
    }
    public Student findById(int studentId){
        for(int i=0;i<count;i++){
            if(students[i].getStudentId()==studentId){
                return students[i];
            }
        }
        return null;
    }

    public boolean updateScore(int studentId, double score){
        Student s = findById(studentId);
        if(s == null)return false;
        s.setScore(score);
        return true;
    }

    public boolean deleteById(int studentId){
        for(int i=0;i<count;i++){
            if(students[i].getStudentId()==studentId){
                for(int j=i;j<count-1;j++){
                    students[j]=students[j+1];
                }
                count--;
                return true;
            }
        }
        return false;
    }
}
