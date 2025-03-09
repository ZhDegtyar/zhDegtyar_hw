// Student c полями id (тип int), name (тип String), surname (тип String), faculty (факультет, тип String ), course(тип int) , Группа(тип String),
// средняя оценка (тип int)

package task7;
//новый класс
public class Student {
    int id;
    String name;
    String surname;
    String faculty;
    int course;
    String group;
    int mark;

    //конструктор с параметрами
    Student(int id, String name, String surname, String faculty, int course, String group, int mark) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        this.mark = mark;
    }

    //конструктор дефолтный
    Student() {
    }

    ;

    //метод info
    public String info() {
        return "id = " + id + "\n"
                + "name = " + name + "\n"
                + "surname = " + surname + "\n"
                + "faculty = " + faculty + "\n"
                + "course = " + course + "\n"
                + "group = " + group + "\n"
                + "mark = " + mark;

    }

    //метод перезаписи группы

    public Student newGroupName(String newGroup) {
        this.group = newGroup;
        return this;
    }

    //метод для возврата текущей группы
    public String currentGroup() {
        System.out.println(group);
        return group;
    }

    //метод изменения оценки студента и группы
    public Student newFiled(int newMark, String newGroup) {
        this.mark = newMark;
        this.group = newGroup;
        System.out.println("group = " + group + "\n" + "mark = " + mark);
        return this;
    }

    public int getMark() {
        return mark;
    }

    //массив студентов
    Student[] getStudents(Student[] students, int mark) {
        int count = 0;
        for (Student student : students) {
            if (student.getMark() > mark) {
                count++;
            }
        }
        if (count == 0) {
            return new Student[0];
        }
        Student[] result = new Student[count];
        int index = 0;
        for (Student student : students) {
            if (student.getMark() > mark) {
                result[index] = student;
                index++;
            }
        }
        return result;
    }
}


