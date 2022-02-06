package domain;
/**
 * Клас який описує артистів компаніє
 * @author Admin
 */
public class Artist extends Employee {
/**
 * Найфункціональніший конструктор класу
 * @param skiils    навички артиста
 * @param name  ім'я артиста
 * @param jobTitle  посада артиста
 * @param level розряд артиста
 * @param dept  відділ артиста
 */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }
    /**
     * Конструктор який записує навички артиста
     * @param skiils навички
     */

    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    
    public Artist() {
        super();
        this.skiils = new String[10];
    }
    /**
     * Форматує навички артиста
     * @return  повертає форматовану інформацію
     */

    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }
/**
 * Массив в якому містяться навички артиста
 */
    private String[] skiils;
/**
 * Метод який повертає навички артиста
 * @return повертаэ навички артиста
 */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }
/**
 * Метод який встановлює навички артиста
 * @param skills навички
 */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }
/**
 * Метод який повертає навички артиста
 * @return повертає масив навичок артиста
 */
    public String[] getSkillsLSist() {
        return skiils;
    }
}
