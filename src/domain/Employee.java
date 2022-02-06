package domain;
/**
 * Базовий клас який описує співробітників компанії
 * @author Marianna
 */

public class Employee {

    /**
     * Метод для форматування інформації про співробітників
     * @return рядок з детальню інформацією
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    /**
     * Ім'я співтробітника
     */
    private String name;
    /**
     * посада співтробітника
     */
    private String jobTitle;
    /**
     * Ідентифікатор співтробітника
     */
    private int ID;
    /**
     * Категорія співтробітника
     */
    private int level;
    /**
     * Відділ співтробітника
     */
    private String dept;

   // private static int employeesCount = 0;

    /**
     * Найункціональніший конструктор класу
     * @param name  Ім'я співробітника
     * @param jobTitle  Посада співробітника
     * @param level Категорія співробітника
     * @param dept  Посада співробітника
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }

    /**
     * Конструктор за замовчуванням
     * @deprecated 
     */
    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }

    /**
     * Метод який встановлює посаду
     * @param job посада співробітника
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }

    /**
     * Метод який повертає посаду
     * @return повертає посаду співробітника
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Метод який повертає ім'я співробітника
     * @return повертає ім'я співробітника
     */
    public String getName() {
        return name;
    }

    /**
     * Метод який встановлює категорію
     * @param level катгорія співробітника
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }
/**
 * Метод який повертає категорію
 * @return повертає категорію співробітника
 */
    public int getLevel() {
        return level;
    }

    /**
     * Метод який повертає відділ
     * @return повертає відділ співробітника
     */
    public String getDept() {
        return dept;
    }

    /**
     * Метод який встановлює відділ
     * @param dept відділ співробітника
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * Метод який встановлює ім'я
     * @param name ім' співробітника
     */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
