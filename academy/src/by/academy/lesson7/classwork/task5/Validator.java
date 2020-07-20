package by.academy.lesson7.classwork.task5;

//Создать интерфейс Validator, с методом validate, принимающим строку, возвращая true/false.
//Написать класс AmericanPhoneValidator, который валидирует американский телефон(начинающийся на +1...)
//Написать класс BelarusPhoneValidator, который валидирует белорусский телефон(начинающийся на +375...) 
//Написать класс EmailValidator в методе main, валидирующий email.
//Все три класса должны реализовать интерфейс Validator.

public interface Validator {

	boolean validate(String vString);

}
