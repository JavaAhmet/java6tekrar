package Gun47;

class Student    {

    String name;
    public Student (String name){
        this.name=name;
    }
}

public class Test {

    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[1] = new Student("Richard");
        students[2] = new Student("Donald");
        for (Student s : students) {

            System.out.println("" + s.name);
        }
       /*  yukardaki nesne böylede yazılabilir
        Student ogr0;
        Student ogr1=new Student("ismet");
        Student ogr2=new Student("Ayşe");
*/

        // hiç olmayan bişeyden dolayı hata var
        
       }
   }
