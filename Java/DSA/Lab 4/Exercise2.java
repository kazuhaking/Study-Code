import java.util.*;
public class Exercise2{
    public static class Student{
        public String name;
        public double math, prog, das1;
        
        public Student(String name, double math, double prog, double das1){
            this.name = name;
            this.math = math;
            this.prog = prog;
            this.das1 = das1;
        }

        public Student(){
            this("", 0, 0, 0);
        }

        public double avgScore(){
            return (this.math+this.prog+this.das1)/3;
        }

        public void setData(Student newStudent){
            this.name = newStudent.name;
            this.math = newStudent.math;
            this.prog = newStudent.prog;
            this.das1 = newStudent.das1;
        }

        public String toString(){
            return "| Name: " + this.name + " - Score: " + Math.round(avgScore()*1000.0)/1000.0 + " |";
        }
    }

    public static ArrayList<Student> sortAscending (ArrayList<Student> arr){
        int min;
        Student tmp = new Student();
        for(int i=0; i<arr.size(); i++){
            min = i;
            for(int j=i+1; j<arr.size(); j++)
                if(arr.get(min).avgScore()  >  arr.get(j).avgScore())
                    min = j;
            if(arr.get(i).avgScore()  >  arr.get(min).avgScore()){
                tmp.setData(arr.get(i));
                arr.get(i).setData(arr.get(min));
                arr.get(min).setData(tmp);
            }
        }
        return arr;
    }

    public static ArrayList<Student> sortDescending (ArrayList<Student> arr){
        int max;
        Student tmp = new Student();
        for(int i=0; i<arr.size(); i++){
            max = i;
            for(int j=i+1; j<arr.size(); j++)
                if(arr.get(max).avgScore()  <  arr.get(j).avgScore())
                    max = j;
            if(arr.get(i).avgScore()  <  arr.get(max).avgScore()){
                tmp.setData(arr.get(i));
                arr.get(i).setData(arr.get(max));
                arr.get(max).setData(tmp);
            }
        }
        return arr;
    }

    public static void main(String[]args){
        ArrayList<Student> ls = new ArrayList<Student>();
        ls.add(new Student("Nghia", 8, 7, 10));
        ls.add(new Student("Quang", 10, 9, 9));
        ls.add(new Student("Duong", 5, 10, 8));

        System.out.println("|--Ascending-----------------|");
        ls = sortAscending(ls);
        for (int i = 0; i < ls.size(); i++)
            System.out.println(ls.get(i));
        
        System.out.print("|----------------------------|\n");

        ls = sortDescending(ls);
        System.out.println("|--Descending----------------|");
        for (int i = 0; i < ls.size(); i++)
            System.out.println(ls.get(i));
    }
}