package programming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Место жительства Смешариков представляет из себя поселение, состоящее из N домиков, пронумерованных от 1 до N.
 * Каждый из них соединен двунаправленными дорожками с некоторыми другими.
 * При этом между любыми двумя домами существует не более одной прямой дорожки.
 * В ясную погоду из любого домика можно попасть в любой другой.
 * Однако из-за затяжного ливня некоторые дорожки начали затапливаться.
 * Каждая дорожка в поселении имеет свою высоту над уровнем моря.
 * Дорожка считается затопленной, если высота подтопления больше или равна высоте самой дорожки.
 *
 * Смешарики очень любят ходить друг к другу в гости, а особенно собираться вместе.
 * Поэтому они очень сильно расстроятся, если кто-то не сможет прийти.
 * Помогите им определить минимальный уровень воды над уровнем моря, при котором найдутся такие два домика,
 * что от одного из них нельзя добраться до другого.
 *
 *Выведите минимальную высоту, на которую должна подняться вода, чтобы в поселении нашлось хотя бы два домика,
 * между которыми нельзя пройти (в том числе через другие домики).
 *
 * В первой строке даны два числа N и M — количество домиков и дорожек соответственно.
 * Следующие M строк содержат тройки чисел  — описания дорожек, где первые два числа — номера домиков, которые соединяет дорожка,
 * третье число - её высота над уровнем моря.
 *
 * Пример:
 * Ввод
 * 2 1
 * 1 2 100
 * Вывод
 * 100
 *
 * Ввод
 * 4 5
 * 1 2 100
 * 1 3 400
 * 2 3 300
 * 2 4 200
 * 3 4 500
 *
 * Вывод
 * 300
 *
 */
public class Task5j {
    public static void main(String[] args) {

    }
}
