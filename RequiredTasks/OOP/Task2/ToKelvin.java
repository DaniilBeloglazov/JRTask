package RequiredTasks.OOP.Task2;
/*
Напишите классы конверторы для конвертации из градусов по Цельсию в
Кельвин, Фаренгейты, и так далее. У классов должен быть метод convert, который
и делает конвертацию.

классы должны реализовывать следующий интерфес

interface Converter {
    double getConvertedValue(double baseValue);
}

название классов по типу CelsiusConverter, KelvinConverter и тд
 */
public class ToKelvin implements  Converter{
    @Override
    public double getConvertedValue(double celsius) {
        return celsius + 273.15;
    }
}
