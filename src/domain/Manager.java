package domain;
/**
 * Клас який описує менеджерів компанії
 * @author Marianna
 */
public class Manager extends Employee {

    /**
     * афункціональніший конструктор класу
     * @param employees співробітники
     * @param name ім'я менеджера
     * @param jobTitle посада менеджера
     * @param level категорія менеджера
     * @param dept відділ менеджера
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Форматує інформацію про співробітників
     * @return повертає відформатовану інформацію про співробітників
     */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }

    /**
     * Конструктор який задає співробітників менеджера
     * @param employees співробітники
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    public Manager() {
        super();
        employees = new Employee[10];
    }

    /**
     * Масив який містить в собі співробітників менеджера
     */
    private Employee[] employees;

    /**
     * Метод який повертає співробітників менеджера
     * @return повертає співробітників менеджера
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Метод який встановлює співробітників менеджера
     * @param employees повертає встановлених співробітників менеджера
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }

    /**
     * Методя для того, щоб вернути масив з співробітниками менеджера
     * @return повертає масив співробітників менеджера
     */
    public Employee[] getEmployeesList() {
        return employees;
    }

    
}
