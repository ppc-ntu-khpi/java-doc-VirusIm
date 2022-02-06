package domain;
/**
 * Клас який описує редакторів компанії
 * @author Marianna
 */
public class Editor extends Artist {
/**
 * Нафункціональніший конструктор класу
 * @param electronicEditing true – якщо редактор надає перевагу роботі з папером
 * @param skiils навички редактора
 * @param name  ім'я редактора
 * @param jobTitle  посада редактора
 * @param level розряд редактора
 * @param dept  відділ редактора
 */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }
/**
 * Конструктор який визначає чи надає редактор перевагу роботі з папером
 * @param electronicEditing true – якщо редактор надає перевагу роботі з папером
 * @param skiils навички редактора
 */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }
/**
 * Конструктор який визначає чи надає редактор перевагу роботі з папером
 * @param electronicEditing true – якщо редактор надає перевагу роботі з папером
 */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    /**
     * Конструктор який визначає чи надає перевагу редактора в роботу з папером
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }
/**
 * Форматує переваги редактора
 * @return повертає форматовану інформацію про переваги редактора
 */
    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }
/**
 * true – якщо редактор надає перевагу роботі з папером
 */
    private boolean electronicEditing;
/**
 * Метод який отримує переваги редактора
 * @return true – якщо редактор надає перевагу роботі з папером
 */
    public boolean getPreferences() {
        return electronicEditing;
    }
/**
 * Метод який встановлює перевагу редактора
 * повертає true – якщо редактор надає перевагу роботі з папером
 */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}
