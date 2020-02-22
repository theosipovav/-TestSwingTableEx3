package com.company;

import javafx.scene.media.MediaException;

public class RecIntegral {
    /**
     * Нижний предел интегрирования
     */
    private String a;
    /**
     * Верхний предел интегрирования
     */
    private String b;
    /**
     * Шаг интегрирования
     */
    private String n;

    /**
     * Создать запись вычисления
     *
     * @param a Нижний предел интегрирования
     * @param b Верхний предел интегрирования
     * @param n Шаг интегрирования
     */
    public RecIntegral(String a, String b, String n) throws MyException {
        if (!check(a))  throw new MyException(a);
        if (!check(b))  throw new MyException(b);
        if (!check(n))  throw new MyException(n);
        this.a = a;
        this.b = b;
        this.n = n;
    }
    /**
     * Проверка строки на число и на диапазон значений
     * @param str Строка
     * @return TRUE при успешной проверки, иначе FALSE
     */
    public boolean check(String str) {
        if (str == null || str.length() == 0) return false;
        int i = 0;
        if (str.charAt(0) == '-') {
            if (str.length() == 1) {
                return false;
            }
            i = 1;
        }
        char c;
        for (; i < str.length(); i++) {
            c = str.charAt(i);
            if (!(c >= '0' && c <= '9') && (c != '.')) {
                return false;
            }
        }
        double val = Double.parseDouble(str);
        if (!(val >= 0.000001 && val <= 1000000))
        {
            return false;
        }
        return true;
    }

    /**
     * Получить значение нижнего предела интегрирования
     *
     * @return
     */
    public String getA() {
        return a;
    }

    /**
     * Получить значение верхнего предела интегрирования
     *
     * @return
     */
    public String getB() {
        return b;
    }

    /**
     * Получить значение шага интегрирования
     *
     * @return Верхний предел интегрирования
     */
    public String getN() {
        return n;
    }

}