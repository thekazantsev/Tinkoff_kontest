/**
 *Костя подключен к мобильному оператору «Мобайл». Абонентская плата Кости составляет A рублей в месяц.
 *За эту стоимость Костя получает B мегабайт интернет-трафика.
 *Если Костя выйдет за лимит трафика, то каждый следующий мегабайт будет стоить ему C рублей.
 *
 *Костя планирует потратить D мегабайт интернет-трафика в следующий месяц.
 * Помогите ему сосчитать, во сколько рублей ему обойдется интернет.
 *
 *Формат входных данных
 *Вводится 4 целых положительных числа A,B,C,D(1≤A,B,C,D≤100) — стоимость тарифа Кости, размер тарифа Кости,
 * стоимость каждого лишнего мегабайта, размер интернет-трафика Кости в следующем месяце.
 * Числа во входном файле разделены пробелами.
 *
 *Формат выходных данных
 *Выведите одно натуральное число — суммарные расходы Кости на интернет.
 *
 *Примеры
 *100 10 12 15 -> 160
 *100 10 12 1  -> 100
 *
 *Замечание
 *В первом примере Костя сначала оплатит пакет интернета, после чего потратит на 5 мегабайт больше, чем разрешено по тарифу.
 * Следовательно, за 5 мегабайт он дополняет отдельно, получившаяся стоимость 100+12×5=160 рублей.
 *
 *Во втором примере Костя укладывается в тарифный план, поэтому платит только за него.
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Integer result = 0;
        String inputLine = new Scanner(System.in).nextLine();

        String[] numbersString = inputLine.split(" ");
        int[] numbers = new int[numbersString.length];

        int a = Integer.parseInt(numbersString[0]);
        int b = Integer.parseInt(numbersString[1]);
        int c = Integer.parseInt(numbersString[2]);
        int d = Integer.parseInt(numbersString[3]);

        if (b < d) {
            result = a + (d - b) * c;
        } else {
            result = a;
        }

        System.out.println(result);
    }
}
