package com.company;

import java.lang.Exception;

class MyException extends Exception {
    /**
     * Текст сообщения
     */
    private String message;

    /**
     * Выбрасывать исключение, если значение, не является числом в диапазоне от 0,000001 до 1000000
     *
     * @param value Проверяемое значение
     */
    public MyException(String value) {
        super(String.format("Значение %s, не является числом в диапазоне от 0,000001 до 1000000", value));
        message = String.format("Значение %s, не является числом в диапазоне от 0,000001 до 1000000", value);
    }

    /**
     * Получить текст ошибки
     *
     * @return Текст сообщения
     */
    @Override
    public String getMessage() {
        return message;
    }
}