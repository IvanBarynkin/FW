class EmployeeBook {
    private final Employee[] Employees;
    private final int size;

    EmployeeBook(int size) {
        this.size = size;
        this.Employees = new Employee[size];
    }

    // Добавление/удаление сотрудников

    public void addEmployee(Employee newEmployee) {
        for (int i = 0; i < this.size; i++) {
            if (Employees[i] == null) {
                Employees[i] = newEmployee;
                System.out.println("Сотрудник добавлен в книгу");
                break;
            }
            if (i == this.size - 1 && Employees[this.size - 1] != null) {
                System.out.println("Книга сотрудников заполнена");
            }
        }
    }

    public void deleteEmployee(int IDOldEmployee) {
        for (int i = 0; i < this.size; i++) {
            if (Employees[i] != null && Employees[i].getID() == IDOldEmployee) {
                Employees[i] = null;
                System.out.println("Сотрудник удален из книги");
                break;
            }
            if(i == this.size-1) {
                System.out.println("Такого сотрудника нет в книге ");
            }
        }
    }

    public void findEmployeeID(int IDEmployee) {
        for (int i = 0; i < this.size; i++) {
            if (Employees[i] != null && Employees[i].getID() == IDEmployee) {
                System.out.println(Employees[i].toString());
                break;
            }
            if(i == this.size-1) {
                System.out.println("Такого сотрудника нет в книге ");
            }
        }
    }

    // Общие методы

    public void allSalaryMonth() {
        int allSalaryPerMonth = 0;
        for (int i = 0; i < this.size; i++) {
            if (Employees[i] != null) {
                allSalaryPerMonth += Employees[i].getSalary();
            }
        }
        System.out.println("Сумма затрат на выплаты зарплаты сотрудникам в месяц составляет: " + allSalaryPerMonth);
    }

    public void minSalaryEmployee() {
        Employee loh = null;
        for (int i = 0; i < this.size; i++) {
            if (Employees[i] != null && loh == null) {
                loh = Employees[i];
                continue;
            }
            if (Employees[i] != null && loh.getSalary() > Employees[i].getSalary()) {
                loh = Employees[i];
            }
        }
        if (loh == null) {
            System.out.println("Сотрудник не найден");
        } else {
            System.out.println("Сотрудник с минимальной зарплатой: " + loh);
        }
    }

    public void maxSalaryEmployee() {
        Employee sigma = null;
        for (int i = 0; i < this.size; i++) {
            if (Employees[i] != null && sigma == null) {
                sigma = Employees[i];
                continue;
            }
            if (Employees[i] != null && sigma.getSalary() < Employees[i].getSalary()) {
                sigma = Employees[i];
            }
        }
        if (sigma == null) {
            System.out.println("Сотрудник не найден");
        } else {
            System.out.println("Сотрудник с максимальной зарплатой: " + sigma);
        }
    }

    public void averageSalaryMonth() {
        double averageSalaryPerMonth = 0;
        double employeesCount = 0;
        for (int i = 0; i < this.size; i++) {
            if (Employees[i] != null) {
                employeesCount += 1;
                averageSalaryPerMonth += Employees[i].getSalary();
            }
        }
        if (employeesCount == 0) {
            System.out.println("Средняя зарплата: " + employeesCount);
        } else {
            System.out.println("Средняя зарплата: " + String.format("%.2f", averageSalaryPerMonth / employeesCount));
        }
    }

    public void employeesList() {
        String str = "";
        for (int i = 0; i < this.size; i++) {
            if (Employees[i] != null) {
                str += Employees[i].getName() + "\n";
            }
        }
        System.out.println(str);
    }

    public void indexingSalary(int percent) {
        for (int i = 0; i < this.size; i++) {
            if (Employees[i] != null) {
                Employees[i].setSalary(Employees[i].getSalary() * (1 + percent / 100));
            }
        }
    }

    // Методы для работы с конкретными отделами

    public void minSalaryEmployeeDep(int department) {
        Employee loh = null;
        for (int i = 0; i < this.size; i++) {
            if (Employees[i] == null || Employees[i].getDepartment() != department) {
                continue;
            }
            if (loh == null) {
                loh = Employees[i];
                continue;
            }
            if (loh.getSalary() > Employees[i].getSalary()) {
                loh = Employees[i];
            }
        }
        if (loh == null) {
            System.out.println("Сотрудник не найден");
        } else {
            System.out.println("Сотрудник с минимальной зарплатой в отделе " + department + " : " + loh);
        }
    }

    public void maxSalaryEmployeeDep(int department) {
        Employee loh = null;
        for (int i = 0; i < this.size; i++) {
            if (Employees[i] == null || Employees[i].getDepartment() != department) {
                continue;
            }
            if (loh == null) {
                loh = Employees[i];
                continue;
            }
            if (loh.getSalary() < Employees[i].getSalary()) {
                loh = Employees[i];
            }
        }
        if (loh == null) {
            System.out.println("Сотрудник не найден");
        } else {
            System.out.println("Сотрудник с минимальной зарплатой в отделе " + department + " : " + loh);
        }
    }

    public void allSalaryMonthDep(int department) {
        int allSalaryPerMonth = 0;
        for (int i = 0; i < this.size; i++) {
            if (Employees[i] == null || Employees[i].getDepartment() != department) {
                continue;
            }
            allSalaryPerMonth += Employees[i].getSalary();
        }
        System.out.println("Сумма затрат на выплаты зарплаты сотрудникам " + department + "-го отдела в месяц составляет: " + allSalaryPerMonth);
    }

    public void averageSalaryMonthDep(int department) {
        double averageSalaryPerMonth = 0;
        double employeesCount = 0;
        for (int i = 0; i < this.size; i++) {
            if (Employees[i] != null && Employees[i].getDepartment()==department) {
                employeesCount += 1;
                averageSalaryPerMonth += Employees[i].getSalary();
            }
        }
        if (employeesCount == 0) {
            System.out.println("Средняя зарплата сотрудников " + department + "-го отдела: " + averageSalaryPerMonth);
        } else {
            System.out.println("Средняя зарплата сотрудников " + department + "-го отдела: " + String.format("%.2f", averageSalaryPerMonth / employeesCount));
        }
    }


    public void indexingSalaryDep(int department,int percent) {
        for (int i = 0; i < this.size; i++) {
            if (Employees[i] != null && Employees[i].getDepartment() == department) {
                Employees[i].setSalary(Employees[i].getSalary() * (1 + (double) percent / 100));
            }
        }
    }

    public void employeesListDep(int department) {
        String str = "";
        for (int i = 0; i < this.size; i++) {
            if (Employees[i] != null && Employees[i].getDepartment() == department) {
                str += "ID: " +Employees[i].getID() + ", ФИО: " + Employees[i].getName() + ", Зарплата: " + Employees[i].getSalary() + "\n";
            }
        }
        System.out.println(str);
    }

    public void findSalaryLess(int lessSalary){
        String str = "";
        for (int i = 0; i < this.size; i++) {
            if (Employees[i] != null && Employees[i].getSalary() < lessSalary) {
                str += "ID: " +Employees[i].getID() + ", ФИО: " + Employees[i].getName() + ", Зарплата: " + Employees[i].getSalary() + "\n";
            }
        }
        System.out.println(str);
    }

    public void findSalaryUpper(int upperSalary){
        String str = "";
        for (int i = 0; i < this.size; i++) {
            if (Employees[i] != null && Employees[i].getSalary() >= upperSalary) {
                str += "ID: " +Employees[i].getID() + ", ФИО: " + Employees[i].getName() + ", Зарплата: " + Employees[i].getSalary() + "\n";
            }
        }
        System.out.println(str);
    }



    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < this.size; i++) {
            if (Employees[i] == null) {
                str += "EMPTY\n";
            } else {
                str += Employees[i].toString() + "\n";
            }
        }
        System.out.println(str);
        return null;
    }
}
