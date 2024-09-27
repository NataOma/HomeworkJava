// Задача 2. Создание CSV-строки из массива объектов
// Дан массив объектов, где каждый объект представляет собой строку данных, и
// массив заголовков. Создайте строку CSV, где строки данных разделяются новой
// строкой, а значения в строках разделяются запятыми.

// Пример:
// String[] headers = {"Name", "Age", "City"};
// String[][] data = {
// {"John", "30", "New York"},
// {"Alice", "25", "Los Angeles"},
// {"Bob", "35", "Chicago"}
// };

// Результат:
// Name,Age,City
// John,30,New York
// Alice,25,Los Angeles
// Bob,35,Chicago

package HomeWork;

public class ht6 {

    public static void main(String[] args) {
        String[] headers = {};
        String[][] data = {};

        headers = new String[]{"Name", "Age", "City"};
        data = new String[][] 
        {
            {"John", "30", "New York"},
            {"Alice", "25", "Los Angeles"},
            {"Bob", "35", "Chicago"}
        };    

        System.out.println(generateCSV(headers, data));

    }

    public static String generateCSV(String[] headers, String[][] data) {

        //Вы можете использовать StringBuilder для эффективного формирования строки CSV.
        StringBuilder csv = new StringBuilder();

        //Используйте метод String.join(), чтобы объединить элементы массива заголовков, разделенные запятыми. 
        //Это создаст первую строку CSV-файла, которая будет содержать заголовки.

        // Добавление заголовков
        csv.append(String.join(",", headers)).append("\n");

        //Пройдитесь по массиву данных и для каждой строки используйте метод String.join() для объединения 
        //элементов строки, разделенных запятыми. Не забудьте добавить перевод строки после каждой строки данных.

        // Добавление данных
        for (String[] row : data) {
            csv.append(String.join(",", row)).append("\n");
        }

        //После формирования всей строки CSV, последняя новая строка может быть лишней.
        //Используйте метод trim() для удаления последнего символа новой строки из итоговой строки CSV.
        
        return csv.toString().trim(); // Удалить последнюю новую строку
    
    }

}
