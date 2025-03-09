//Создать класс Student c полями id (тип int), name (тип String), surname (тип String), faculty (факультет, тип String ),
// course(тип int) , Группа(тип String), средняя оценка (тип int).Инициализацию студента в классе main выполнять
//через конструктор с параметрами. Также определите конструктор без параметров.

package task7;

public class hw7_1 {
    public static void main(String[] args) {
        Student std1 = new Student();  //тип данных Student, вызываем конструктор  Student()
        std1.id = 1254;
        std1.name = "Zhanna";
        std1.surname = "Degtyar";
        std1.faculty = "TTLP";
        std1.course = 4;
        std1.group = "6 MOLK";
        std1.mark = 8;



        Student std2 = new Student(11111, "Valery", "Degtyar", "TTLP", 4, "6 MOLK", 9);
        System.out.println("================================");

        System.out.println(std2.info());  //вызов метода info
        System.out.println("================================");

        std1.newGroupName("5 MOLK"); //замена группы
        System.out.println("================================");

        std1.currentGroup();//вызов метода текущей группы
        System.out.println("================================");

        std2.newFiled(5, "157PSO");
        System.out.println("================================");


    }
}
