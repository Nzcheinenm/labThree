package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Conditioner conditNew = new Conditioner(true); // Приносим и включаем кондиционер
        conditNew.modeButton(); // Меняем режим с дефолтного(холодного) на горячий
        conditNew.modeButton(); // Меняем обратно режим
        conditNew.workButton(); // Приводим в работу кондиционер на минуту
        conditNew.workButton(); // Добавляем еще одну минуту
        conditNew.powerButton(); // Выключаем кондиционер
        conditNew.modeButton(); // Нажимаем на кнопку режима, и видим, что ничего не происходит
        conditNew.workButton();// Нажимаем на кнопку работы и ничего не происходит


        Conditioner conditNewDefault = new Conditioner();// Создаем обьект по дефолту/ Приносим кондиционер
        conditNewDefault.powerButton(); // Подключаем и включаем
        conditNewDefault.workButton();// Приводим в работу на минуту
        conditNewDefault.modeButton();// Меняем режим работы
        conditNewDefault.powerButton();// Выключаем принтер
        System.out.println(conditNewDefault.power);// Проверяем

    }
}


class Conditioner {

    String mode;
    boolean power;
    int work;


    Conditioner(){ // Конструктор без параметров
        power = false;
    }

    Conditioner(boolean powerCond) { // Конструктор , что бы создать кондиционер включенным
        power = powerCond;
        if (powerCond == false) {
            mode = null;
        } else {
            mode = "cold";
        }
    }


    String modeButton() {  // Меняем режим кондиционера
        if (power == false) {
            mode = null;
            work = 0;
            return mode;
        } else if (mode == "cold") {
            mode = "hot";
            return mode;
        } else {
            mode = "cold";
            return mode;
        }
    }


     int workButton() { // Подключаем в работу на 1 минуту
        if (power == true) {
            if (work >= 0) {
                work = work + 60;
            }
            return work;
        }
        return 0;
    }


    boolean powerButton() { // Кнопка включения
        if (power != false) {
            power = false;
            mode = null;
            work = 0;
            return power;
        }
        mode = "cold";
        power = true;
        return power;
    }


}

