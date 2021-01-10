import DAOUtils.StudentDao;
import entities.Student;

import java.util.ArrayList;
import java.util.List;

//        1. Создать базу данных Student с полями id, name, mark.
//        2. Создать сущность Student и добавить в нее аннотации. Поле id должно заполняться автоматически.
//        3. Создать конфигурационный файл hibernate.cfg.xml, в котором указать свойства для подключения к БД и список классов с аннотациями Entity.
//        4. Создать класс со статическим методом, который возвращает объект SessionFactory.
//        5. Создать DAO-слой с операциями добавления, удаления, изменения сущности, выборки записи по ID и всех записей.
//        6. Добавить 1000 записей в таблицу Student.
//        7. Проверить работоспособность приложения, выполнить методы по удалению, изменению, добавлению записей, а также выборки одной и всех записей.

public class Main {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();

        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            studentList.add(new Student("Student" + i, (byte) (2 + Math.random() * 4)));
        }
        studentDao.addAll(studentList);

        studentList = studentDao.getAll();


        for (int i = 0; i < 20; i++) {
            System.out.println(studentList.get(i));
        }

//        Student student1 = new Student("Ivan", (byte)4);
//        studentDao.persist(student1);
//        Student student = studentDao.getEntityById(1);
//        System.out.println(student);
//        student.setName("Dmitriy");
//        studentDao.update(student);
//        System.out.println(studentDao.getEntityById(1));
//        studentDao.delete(student);
//        List<Student> students = studentDao.getAll();
//        students.forEach(System.out::println);
    }
}
