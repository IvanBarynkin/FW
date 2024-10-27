import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) {

        //Для удобства проверки курсовой работы, я предлагаю начать с проверки функций уровня "Очень сложно"

        //Создание экземпляра класса EmployeeBook с именем book хранящий в себе список из 10 сотрудников:
        EmployeeBook book = new EmployeeBook(10);

        //Вывод книги в виде строки:
        System.out.println("Вывод книги в виде строки:");
        book.toString();

        //Создание 10-ти экземпляров класса Employee с псевдослучайными зарплатами и отделами:
        System.out.println("Создание 10-ти экземпляров класса Employee с псевдослучайными зарплатами и отделами:");
        Employee emp1 = new Employee("emp1", 1 + (int) (Math.random() * 5), (int) (Math.random() * 10));
        Employee emp2 = new Employee("emp2", 1 + (int) (Math.random() * 5), (int) (Math.random() * 20));
        Employee emp3 = new Employee("emp3", 1 + (int) (Math.random() * 5), (int) (Math.random() * 30));
        Employee emp4 = new Employee("emp4", 1 + (int) (Math.random() * 5), (int) (Math.random() * 40));
        Employee emp5 = new Employee("emp5", 1 + (int) (Math.random() * 5), (int) (Math.random() * 10));
        Employee emp6 = new Employee("emp6", 1 + (int) (Math.random() * 5), (int) (Math.random() * 20));
        Employee emp7 = new Employee("emp7", 1 + (int) (Math.random() * 5), (int) (Math.random() * 30));
        Employee emp8 = new Employee("emp8", 1 + (int) (Math.random() * 5), (int) (Math.random() * 40));
        Employee emp9 = new Employee("emp9", 1 + (int) (Math.random() * 5), (int) (Math.random() * 30));
        Employee emp10 = new Employee("emp10", 1 + (int) (Math.random() * 5), (int) (Math.random() * 40));

        //Добавление 10-ти сотрудников в книгу:
        System.out.println("Добавление 10-ти сотрудников в книгу");
        book.addEmployee(emp1);
        book.addEmployee(emp2);
        book.addEmployee(emp3);
        book.addEmployee(emp4);
        book.addEmployee(emp5);
        book.addEmployee(emp6);
        book.addEmployee(emp7);
        book.addEmployee(emp8);
        book.addEmployee(emp9);
        book.addEmployee(emp10);

        //Вывод книги в виде строки:
        System.out.println("Вывод книги в виде строки:");
        book.toString();

        //Удаление сотрудника из книги и вывод результата:
        System.out.println("Удаление сотрудника из книги и вывод результата:");
        book.deleteEmployee(8);
        book.toString();

        //Попытка повторного удаление сотрудника из книги вывод результата:
        System.out.println("Попытка повторного удаление сотрудника из книги вывод результата:");
        book.deleteEmployee(8);
        book.toString();

        //Создание нового 11-го сотрудника и добавление в книгу на пустое место, вывод результата:
        System.out.println("Создание нового 11-го сотрудника и добавление в книгу на пустое место, вывод результата");
        Employee emp11 = new Employee("emp11", 1 + (int) (Math.random() * 5), (int) (Math.random() * 10));
        book.addEmployee(emp11);
        book.toString();

        //Получить данные о сотруднике по ID:
        System.out.println("Получить данные о сотруднике по ID:");
        book.findEmployeeID(9);

        //Далее я предлагаю проверить методы уровня "Базовая сложность"
        System.out.println("Далее я предлагаю проверить методы уровня \"Базовая сложность\"");
        //Получить список всех сотрудников со всеми имеющимися по ним данными:
        System.out.println("Получить список всех сотрудников со всеми имеющимися по ним данными:");
        book.toString();

        //Посчитать сумму затрат на ЗП в месяц:
        System.out.println("Посчитать сумму затрат на ЗП в месяц:");
        book.allSalaryMonth();

        //Найти сотрудника с минимальной ЗП:
        System.out.println("Найти сотрудника с минимальной ЗП:");
        book.minSalaryEmployee();

        //Найти сотрудника с максимальной ЗП:
        System.out.println("Найти сотрудника с максимальной ЗП:");
        book.maxSalaryEmployee();

        //Подсчитать среднее значение зарплат:
        System.out.println("Подсчитать среднее значение зарплат:");
        book.averageSalaryMonth();

        //Распечатать ФИО всех сотрудников;
        System.out.println("Распечатать ФИО всех сотрудников;");
        book.employeesList();

        //Далее я предлагаю проверить методы уровня "Повышенная сложность"
        System.out.println("Далее я предлагаю проверить методы уровня \"Повышенная сложность\"");
        System.out.println("Заново выводим список сотрудников для удобства:");
        book.toString();
        //Получить в качестве параметра номер отдела (1-5) и найти сотрудника с минимальной зп:
        System.out.println("Получить в качестве параметра номер отдела (1-5) и найти сотрудника с минимальной зп:");
        book.minSalaryEmployeeDep(2);

        //Получить в качестве параметра номер отдела (1-5) и найти сотрудника с минимальной зп:
        System.out.println("Получить в качестве параметра номер отдела (1-5) и найти сотрудника с максимальной зп:");
        book.maxSalaryEmployeeDep(3);

        //Получить в качестве параметра номер отдела (1-5) и найти сумму затрат на зп по отделу:
        System.out.println("Получить в качестве параметра номер отдела (1-5) и найти сумму затрат на зп по отделу:");
        book.allSalaryMonthDep(4);

        //Получить в качестве параметра номер отдела (1-5) и найти среднюю зп по отделу:
        System.out.println("Получить в качестве параметра номер отдела (1-5) и найти среднюю зп по отделу:");
        book.averageSalaryMonthDep(5);

        //Проиндексировать зарплату (вызвать изменение зп у всех сотрудников на величину аргумента в %):
        System.out.println("Проиндексировать зарплату (вызвать изменение зп у всех сотрудников на величину аргумента в %):");
        book.indexingSalary(100);
        book.toString();

        /*Получить в качестве параметра номер отдела (1-5) и
        проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра:*/
        System.out.println("Получить в качестве параметра номер отдела (1-5) и\n" +
                "        проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра:");
        book.indexingSalaryDep(1,200);
        book.employeesListDep(1);

        //Напечатать всех сотрудников отдела (все данные, кроме отдела):
        System.out.println("Напечатать всех сотрудников отдела (все данные, кроме отдела):");
        book.employeesListDep(1);

        //Получить в качестве параметра число и вывести сотрудников с зп меньше числа (распечатать id, фио и зп в консоль):
        System.out.println("Получить в качестве параметра число и вывести сотрудников с зп меньше числа (распечатать id, фио и зп в консоль):");
        book.findSalaryLess(5);

        //Получить в качестве параметра число и вывести сотрудников с зп больше (или равно) числа (распечатать id, фио и зп в консоль):
        System.out.println("Получить в качестве параметра число и вывести сотрудников с зп больше (или равно) числа (распечатать id, фио и зп в консоль):");
        book.findSalaryUpper(15);
    }
}


