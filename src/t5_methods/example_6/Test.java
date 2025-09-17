package t5_methods.example_6;

public class Test {
    public static void main(String[] args) {
        processUser(false, false, false);
    }

    static boolean processUser(boolean user, boolean isActive, boolean canEdit) {
        if (!user) {
            System.out.println("Пользователь не найден.");
            return false;
        }

        if (!isActive) {
            System.out.println("Пользователь неактивен.");
            return false;
        }

        if (!canEdit) {
            System.out.println("Нет прав на редактирование.");
            return false;
        }

        System.out.println("Пользователь активен и может редактировать.");
        return true;
    }
}
