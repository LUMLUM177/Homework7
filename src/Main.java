public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }

    public static void task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
    }

    public static void task2() {
        String fullName = "Ivanov Ivan Ivanovich";
        String fullNameToUpper = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчёта - " + fullNameToUpper);
    }

    public static void task3() {
        String fullName = "Иванов Семён Семёнович";
        boolean fullNameContains = fullName.contains("ё");
        if (fullNameContains) {
            String fullNameReplace = fullName.replace("ё", "е");
            System.out.println("Данные ФИО сотрудника - " + fullNameReplace);
        } else {
            throw new RuntimeException("Запрещённых символов не найдено!");
        }
    }

    public static void task4() {
        String fullName = "Ivanov Ivan Ivanovich";
        int first = fullName.indexOf(' ');
        int second = fullName.lastIndexOf(' ');
        String firstName = fullName.substring(first, second);
        String middleName = fullName.substring(0, first);
        String lastName = fullName.substring(second);
        System.out.println("Имя сотрудника - " + firstName);
        System.out.println("Фамилия сотрудника - " + middleName);
        System.out.println("Отчество сотрудника - " + lastName);
    }

    public static void task5() {
        String fullName = "ivanov ivan ivanovich";
        char[] words = fullName.toCharArray();
        System.out.print("Верное написание Ф. И. О. сотрудника с заглавных букв — ");
        for (int i = 0; i < words.length; i++) {
            if (i == 0 && (words[i] != ' ')) {
                words[i] = Character.toUpperCase(words[i]);
            }
            if ((words[i] == ' ') && (words[i + 1] != ' ')) {
                words[i + 1] = Character.toUpperCase(words[i + 1]);
            }
            System.out.print(words[i]);
        }
    }

    public static void task6() {
        System.out.println();
        StringBuilder sb1 = new StringBuilder("135");
        StringBuilder sb2 = new StringBuilder("246");
        StringBuilder sb = new StringBuilder();
        char firstSymbols, secondSymbols;
        for (int i = 0; i < sb1.length(); i++) {
            firstSymbols = sb1.charAt(i);
            secondSymbols = sb2.charAt(i);
            sb.append(firstSymbols);
            sb.append(secondSymbols);
        }
        System.out.println("Данные строки - " + sb);
    }

    public static void task7() {
        String challenge = "aabccddefgghiijjkk";
        System.out.println("Начальная строка - " + challenge);
        char[] words = challenge.toCharArray();
        System.out.print("Результат работы программы, удалены повторящиеся дубли: ");
        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1) {
                System.out.print(words[i]);
            } else {
                if (words[i] != words[i + 1]) {
                    System.out.print(words[i]);
                }
            }
        }
    }
}