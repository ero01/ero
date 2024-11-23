public class AverageArray {

public static void main(String[] args) {
// Создаем массив целых чисел
int[] numbers = {1, 2, 3, 4, 5};

// Считаем сумму элементов массива
int sum = 0;
for (int number : numbers) {
sum += number;
}

// Считаем среднее значение массива
double average = (double) sum / numbers.length;

// Выводим результат
System.out.println("Среднее значение массива: " + average);
}
} 