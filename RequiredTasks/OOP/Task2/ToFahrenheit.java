package RequiredTasks.OOP.Task2;

public class ToFahrenheit implements Converter{
    @Override
    public double getConvertedValue(double baseValue) {
        return (baseValue * 9 / 5) + 32;
    }
}
