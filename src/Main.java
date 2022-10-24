import transport.Car;

import java.sql.SQLOutput;

public class Main {
    public static void separation() {
        System.out.println("========================");
    }
    public static void main(String[] args) {
        separation();
        task11();
        separation();
        task12();
        separation();
        calculator();
        separation();
        // калькулятор странный, но вроде работает. Хотелось бы услышат ваше мнение и предложить варианты доработки.
        separation();
        task22();
        separation();

    }

    public static void task11() {
        Human maxim = new Human("Максим", "Калининграда", 2022 - 38, "работник СТО");
        Human anya = new Human("Аня", "Москва", 2022 - 29, "методистома образовательных программ");
        Human kate = new Human("Катя", "Калининград", 2022 - 28, "продакт-менеджера");
        Human artem = new Human("Артем", "Москва", 2022 - 27, "директором по развитию бизнеса");
        Human vladimir = new Human("Владимир", "Казань", 2022 - 21, "не работает");
        System.out.println("Привет! Меня зовут " + maxim.name + " Я из города " + maxim.getTown() + " Я родился в " + maxim.getYearOfBirth() + " году. Я работаю на должности "+maxim.job+" Будем знакомы! ");
        System.out.println("Привет! Меня зовут " + anya.name + " Я из города " + anya.getTown() + " Я родился в " + anya.getYearOfBirth() + " году. Я работаю на должности " + anya.job + " Будем знакомы! ");
        System.out.println("Привет! Меня зовут " + kate.name + " Я из города " + kate.getTown() + " Я родился в " + kate.getYearOfBirth() + " году. Я работаю на должности " + kate.job + " Будем знакомы! ");
        System.out.println("Привет! Меня зовут " + artem.name + " Я из города " + artem.getTown() + " Я родился в " + artem.getYearOfBirth() + " году. Я работаю на должности " + artem.job + " Будем знакомы! ");
        System.out.println("Привет! Меня зовут " + vladimir.name + " Я из города " + vladimir.getTown() + " Я родился в " + vladimir.getYearOfBirth() + " году. Я не работаю. Будем знакомы! ");
    }

    public static void task12() {
        Flower rose = new Flower("", "Голландия", 35.59,0);
        Flower chrysanthemum = new Flower("", "", 15,5);
        Flower peony = new Flower("", "Англия", 69.9,1);
        Flower gypsophila = new Flower("", "Турция", 19.5,10);
        System.out.println("Роза обыкновенная, цвет "+rose.getFlowerColor()+" ,страна "+rose.getCountry()+" ,цена "+rose.getCost()+" ,срок стояния "+ rose.lifeSpan);
        System.out.println("Хризантема, цвет "+chrysanthemum.getFlowerColor()+" ,страна "+chrysanthemum.getCountry()+" ,цена "+chrysanthemum.getCost()+" ,срок стояния "+ chrysanthemum.lifeSpan);
        System.out.println("Пион, цвет "+peony.getFlowerColor()+" ,страна "+peony.getCountry()+" ,цена "+peony.getCost()+" ,срок стояния "+ peony.lifeSpan);
        System.out.println("Гипсофила, цвет "+gypsophila.getFlowerColor()+" ,страна "+gypsophila.getCountry()+" ,цена "+gypsophila.getCost()+" ,срок стояния "+ gypsophila.lifeSpan);
    }

    public static void calculator() {
        Flower rose = new Flower("", "Голландия", 35.59,0);
        Flower chrysanthemum = new Flower("", "", 15,5);
        Flower peony = new Flower("", "Англия", 69.9,1);
        Flower gypsophila = new Flower("", "Турция", 19.5,10);
        double sum = (rose.getCost() * 3) + (chrysanthemum.getCost() * 5) + (gypsophila.getCost() + (peony.getCost() * 7));
        double percent = sum / 100 * 10;
        double total = sum + percent;

        int[] lifeFlover = {rose.lifeSpan, chrysanthemum.lifeSpan, peony.lifeSpan, gypsophila.lifeSpan};
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < lifeFlover.length; i++) {
            if (lifeFlover[i] < minSum) {
                minSum = lifeFlover[i];
            }
        }
        System.out.print("В букете Роза обыкновенная - 3 шт, Хризантема - 5 шт, Гипсофила - 1 шт, Пионы - 7 шт. Срок стояния: "+minSum+ " Сумма: ");
        System.out.printf("%.2f", total);
    }

    public static void task22() {
        Car lada = new Car("", "", 0, "", "желтого", 0, "механика", "универсал", "а000аа750", 4,true,null,null);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германии", "черный", 3.0, "робот", "седан", "о000оо77", 4, false,null,null);
        Car bmw = new Car("BMW", "Z8", 2021, "Гремании", "черный", 3.0, "робот", "кабриолет", "в999вв198", 2, true,null,null);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2018, "Южной Корее", "красный", 2.4, "автомат", "кроссовер", "л888лл50", 4, true,null,null);
        Car hyundai = new Car("Hyundai", "Avante", 2016, "Южной Корее", "оранжевый", 1.6, "автомат", "седан", "р666рр997", 4, false,null,null);
        printInfoCar(lada);
        printInfoCar(audi);
        printInfoCar(bmw);
        printInfoCar(kia);
        printInfoCar(hyundai);


    }
    private static void printInfoCar(Car car) {
        System.out.println(" Марка: " + car.getBrand() + " модель: " + car.getModel() + " год выпуска: " + car.getYear() + " страна: " + car.getCountry() + " цвет: " + car.getColor() + " объем двигателя: " + car.getEngineVolume() + " трансмиссия: " + car.transmission + " кузов: " + car.bodyType + " номер: " + car.changeNumber() + " количество мест: " + car.numberOfSeats + " резина: " + (car.isTires() ? "летняя" : "зимняя") + " резина" + ", " + (car.getKey().isWithoutKey() ? "без ключа" : "с ключем") + " , " + (car.getKey().isRemoteRunEngine() ? "удаленный запуск" : "локальный запуск") + " , номер страховки: " + car.getInsurance().getNumber());
    }


}