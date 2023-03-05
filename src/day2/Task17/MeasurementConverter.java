package day2.Task17;

public class MeasurementConverter {
    public float convert(float value, ConversionType conversionType) {
        return value * conversionType.getValue();
    }
    public float convert(float vale, ConversionTypeWithFunction conversionType) {
        return conversionType.getConversionType().apply(vale);
    }
}
