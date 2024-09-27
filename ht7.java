// Удаление пустых строк из текста
// Дана строка с несколькими строками текста, разделенными переводами строки.
// Напишите метод, который удаляет все пустые строки из текста.

package HomeWork;

public class ht7 {
    public static void main(String[] args) {

        String text = "";
        text = "line1\n\nline2\n\nline3";
        System.out.println(removeEmptyLines(text));

    }

    public static String removeEmptyLines(String text) {

        // Используем метод split("\n"), чтобы разбить исходный текст на массив строк по
        // символу перевода строки.
        // Это позволит вам обработать каждую строку отдельно.
        String[] lines = text.split("\n");

        StringBuilder cleanedText = new StringBuilder();

        // Пройдемся по массиву строк и используйте метод trim() для проверки, является ли строка пустой
        // (или состоит только из пробельных символов). Если строка не пуста, добавьте ее в результирующую строку

        for (String line : lines) {
            if (!line.trim().isEmpty()) {
                if (cleanedText.length() > 0) {
                    cleanedText.append("\n");
                }
                cleanedText.append(line);
            }
        }
        return cleanedText.toString();
    }

}
