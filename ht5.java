package HomeWork;

// Задание 1. Формирование URL с параметрами
// Дана строка базового URL:
// https://example.com/search?
// Сформируйте полный URL, добавив к нему параметры для поиска. Параметры
// передаются в виде строки, где ключи и значения разделены =, а пары
// ключ-значение разделены &. Если значение null, то параметр не должен
// попадать в URL.
// Пример:
// params = "query=java&sort=desc&filter=null"
// Результат:
// https://example.com/search?query=java&sort=desc

public class ht5 {

    public static void main(String[] args) {

        String baseURL = "https://example.com/search?";
        String params = "query=java&sort=desc&filter=null";

        
        System.out.println(buildURL(baseURL, params));

    }

    public static String buildURL(String baseURL, String params) {

        //Используйте StringBuilder для построения итогового URL.
        StringBuilder url = new StringBuilder(baseURL);

        //Разделите строку параметров на части, используя символ & в качестве разделителя.
        //Это даст вам массив строк, каждая из которых представляет собой пару "ключ=значение"
        String[] pairs = params.split("&");  

        for (int i = 0; i < pairs.length; i++) {

            //Для каждой строки, представляющей пару "ключ=значение", разделите её на ключ и
            //значение с помощью символа =. Это позволит вам обработать ключ и значение
            //отдельно.
            String[] keyValue = pairs[i].split("=");

            //Проверьте, если значение после символа = равно "null". В этом случае, этот параметр
            //не должен добавляться к итоговому URL.
            if (!"null".equals(keyValue[1])) {
                if (i > 0) {
                    ////Начните с базового URL и добавляйте параметры, разделяя их символом &, если это необходимо
                    url.append("&");
                }
                url.append(keyValue[0]).append("=").append(keyValue[1]);
            }
        }
        return url.toString();
    }

}
