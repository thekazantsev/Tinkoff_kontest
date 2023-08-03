/**
 * Кролики планируют отправиться на автобусную экскурсию.
 * В прошлый раз они пользовались услугами "Ежевичный экспресс", и тогда им понадобилось на один автобус больше,
 * чем предлагает компания "Морковный рейс" для такого же количества кроликов.
 *
 * В автобусах компании "Ежевичный экспресс" больше 40 мест, но меньше 50,
 * а в автобусах компании "Морковный рейс" больше 50, но меньше 60 мест.
 *
 * Какое наибольшее количество автобусов может понадобиться кроликам при условии, что все места будут заняты?
 */

public class AlfaRabbits {
    public static void main(String[] args) {

        for (int busses = 1; busses < 10_000_000; busses++) {

            for (int morkBusSeats = 51; morkBusSeats < 60; morkBusSeats++) {

                for (int ezhevBusSeats = 41; ezhevBusSeats < 50; ezhevBusSeats++) {

                    if (morkBusSeats * busses == ezhevBusSeats * (busses + 1))
                        System.out.printf("Mork seats: %d, Ezhev seats: %d, busses: %d\n", morkBusSeats, ezhevBusSeats, busses);
                }
            }
        }
    }
}
