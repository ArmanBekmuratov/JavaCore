package com.ArmanBekmuratov.javacore.chapter15;

public class HighTemp {
    private int hTemp;

    HighTemp(int ht) {hTemp = ht; }

    boolean sameTemp (HighTemp ht2 ) {
        return hTemp == ht2.hTemp;
    }

    boolean lessThanTeemp (HighTemp ht2) {
        return hTemp < ht2.hTemp;
    }
}

class  InstanceMethWithObjectRefDemo {
    static <T> int counter (T [] vals, MyFunc1 <T> f, T v) {
        int count = 0;

        for (int i = 0; i < vals.length; i++)
            if (f.func(vals[i], v)) count++;

            return count;
    }

    public static void main(String[] args) {
        int count;

        HighTemp [] weekDayHighs = {
                new HighTemp(89), new HighTemp(82),
                new HighTemp(21), new HighTemp(54),
                new HighTemp(85), new HighTemp(65),
                new HighTemp(89), new HighTemp(82),
        };

        count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(89));
        System.out.println("Дней когда максимальная температура была 89: " + count);
        count = counter(weekDayHighs, HighTemp::lessThanTeemp, new HighTemp(89));
        System.out.println("Дней когда температура была меньше 89: " + count);
    }
}
