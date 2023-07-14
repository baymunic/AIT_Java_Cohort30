package practice.user.model;

public class User {

    // поля класса, отвечают за состояние
    private String username;
    private String email;
    private String password;

    // методы класса, отвечают за поведение (изменение состояния)

    // конструктор

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

        // перегрузка конструктора
        public User (String email, String password) {
        setEmail(email);
        setPassword(password);

    }

    public void setEmail(String email) {
        if (validateEmail(email)) {
            this.email = email;
        }else {
            System.out.println(email + " isn't valid.");
        }
    }

    public String getEmail() {
        return email;
    }

    // метод валидации

//            Requirements for e-mail:

//            1) @ exists and only one
//            2) dot after @
//            3) after last dot minimum 2 symbols
//            4) alphabetic, digits, _ , - , . , @ - это разрешённые символы до @

    public boolean validateEmail(String email){
        int indexAt = email.indexOf('@'); // узнали индекс собаки
        if (indexAt == -1 || indexAt != email.lastIndexOf('@')) {  // если @ не нашлась или нет ещё одной собаки
            return false;
        }
        if (email.indexOf('.', indexAt) == -1) {  // если после собаки не нашлась точка, ... indexOf ищет после индекса @
            return false;
        }
        if (email.lastIndexOf('.') >= email.length() - 2) {  // проверка что не меньше 2 -х символов после точки
            return false;
        }
        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);
            if (!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '_' || c == '-' || c == '.' || c == '@')) {
                return false;
            }
        }
        return true;
    }


    public void setPassword(String password) {
        if (validatePassword(password)) {
        this.password = password;
        }else {
            System.out.println(password + " isn't valid.");
        }
    }

    // это очень опасный метод!!!
    public String getPassword() {
        return password;
    }

    //    Requirements for password:
//    1) min 8 symbols
//    2) min one symbol of uppercase
//    3) min one symbol of lowercase
//    4) min one digit
//    5) min one special symbol (!%@*&)
    public boolean validatePassword(String password) { // пробегаем по всем символам строки
        boolean[] res = new boolean[5]; // по умолчанию все элементы массива типа boolean равны false
        if (password.length() >= 8){
            res[0] = true;
        }
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i); // c - это символ в пароле
            if (Character.isUpperCase(c)) {
                res[1] = true;
            }
            if (Character.isLowerCase(c)) {
                res[2] = true;
            }
            if (Character.isDigit(c)) {
                res[3] = true;
            }
            if ("!%@*&".indexOf(c) >= 0) { // если индекс нашёлся хоть одного из символов, кот. стоят в ковычках
                res[4] = true;
            }
        }
        return res[0] && res[1] && res[2] && res[3] && res[4];
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "| User: " + "| username= " + username + "| email= " + email + "| password= " + password;
    }
}
