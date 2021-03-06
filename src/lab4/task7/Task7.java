package lab4.task7;

public class Task7 {
    /**
     * Проверить пароль на криптостойкость. Пароль называется криптостойким, если он включает в себя и строчные латинские
     * буквы, и заглавные латинские буквы, и цифры, при этом его длина должна быть не менее 8 символов.
     * Требуется по данному паролю определить, является ли он криптостойким.
     *
     * @param password - проверяемый пароль
     * @return - являет ли пароль криптостойким
     */
    public static boolean isValidPassword(String password) {
        return password.matches("^((?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])).{8,}$");
    }
}
