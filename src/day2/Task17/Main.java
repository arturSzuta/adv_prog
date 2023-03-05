package day2.Task17;

public class Main {
    public static void main(String[] args) {
        MeasurementConverter converter = new MeasurementConverter();
        float convert = converter.convert(10, ConversionType.CENTIMETERS_TO_INCHES);
        System.out.println(convert);

        float convert1 = converter.convert(10, ConversionTypeWithFunction.CENTIMETERS_TO_INCHES);
        System.out.println(convert1);
    }
}
