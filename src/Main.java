public class Main {
    public static void main(String[] args) {
///Задание по видео

        var box = 5;
        System.out.println(box);
        box = box+2;
        System.out.println(box);
        box = box - 3;
        System.out.println(box);
        box = box * 3;
        System.out.println(box);
        box = box / 4;
        System.out.println(box);

        var liftingOpacity = 50;
        var stuffWeight = 20;
        var opacityLeft = liftingOpacity - stuffWeight;
        System.out.println("Осталось еще " + opacityLeft + " Кг ");

        var applesWeight = 2;
        var orangesWeight = 3;
        var fruitWeight = applesWeight + orangesWeight;
        System.out.println(fruitWeight + "Kg fruits");

        var meatWeight = 4;
        var waterWeight = 5;
        var tomatoesWeight = 2;
        var cucumberWeight = 2;
        var pepperWeight = 2;
        var zucchiniWeight = 2;
        var vegetableWeight = tomatoesWeight + cucumberWeight + pepperWeight + zucchiniWeight;
        var productsWeight  = meatWeight + waterWeight + vegetableWeight + fruitWeight;
        System.out.println("Общий вес покупок " + productsWeight + " Кг");

        var leftWeight = liftingOpacity - stuffWeight - productsWeight;
        System.out.println(leftWeight + " Кг осталось");
        productsWeight = productsWeight * 2;
        System.out.println("Теперь вес = " + productsWeight + "кг");
        leftWeight = liftingOpacity - productsWeight - stuffWeight;
        System.out.println("В машине осталось " + leftWeight + "кг");

        var overload = (stuffWeight+productsWeight) % liftingOpacity;
        System.out.println("Перегруз на " + overload + "кг");

        var productsInOneCar = productsWeight / 2;
        System.out.println ("В одной машине будет " + productsInOneCar + "кг");

        short bananas = 200;
        System.out.println("Бананов " + bananas + "кг");

        float sugar = 3;
        float onePortion = sugar / 4;
        System.out.println(onePortion + "кг");

        byte a = 1;
        short b = 1;
        int c = 1;
        int d = a + b + c;
        System.out.println("d = " + d);

        float g = a + 1f;
        System.out.println("g = " + g);

        ///Домашка по задачам
/// Task 1
        double fighterOne = 78.2;
        double fighterTwo = 82.7;
        double fighterSumm = fighterOne + fighterTwo;
        double fighterMin  = fighterTwo - fighterOne;
        System.out.println("Суммарный вес бойцов = " + fighterSumm + "кг");
        System.out.println("Разница бойцов = " + fighterMin + "кг");
/// Task 2
        int bananasWeight = 80;
        int milkWeight = 105 * 2;
        int iceCreamWeight = 100 * 2;
        int eggsWeight = 70 * 4;
        int sumWeight = bananasWeight + iceCreamWeight + milkWeight + eggsWeight;
        float sumKg = sumWeight / 1000f;
        System.out.println("Сумма в граммах = " + sumWeight + " грамм " + " Сумма в килограммах = " + sumKg + "кг");
/// Task 3
        short lowWeight = 250;
        short highWeight = 500;
        float lWeightKg = lowWeight / 1000f;
        float hWeightKg = highWeight / 1000f;
        float deadlineFirst = 7 / lWeightKg;
        float deadlineSecond = 7 / hWeightKg;
        float middle = (deadlineFirst + deadlineSecond) / 2;
        System.out.println("Если будет сбрасывать по 500г, то через " + deadlineSecond + " дней, " + "Если по 250, то через " + deadlineFirst + " дней, " + "В среднем " + middle + " Дней" );
/// Task 4
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int mashaPercent = (67760 * 10) / 100;
        int denisPercent = (83690 * 10) / 100;
        int kristinaPercent = (76230 * 10) / 100;
        int mashaHigh = mashaPercent + masha;
        int denisHigh = denisPercent + denis;
        int kristinaHigh = kristinaPercent + kristina;
        int minus = ((mashaHigh + denisHigh + kristinaHigh) * 12) - ((masha + denis +kristina) * 12);
        System.out.println("Маша будет получать " + mashaHigh + "руб. месяц");
        System.out.println("Денис будет получать " + denisHigh + "руб. месяц");
        System.out.println("Кристина будет получать " + kristinaHigh + "руб. месяц");
        System.out.println("Выручка за год выросла на " + minus + "руб.");


    }
}

