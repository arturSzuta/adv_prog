package day1.Task8;

public class ParcelValidator implements Validator{

    private static final int TOTAL_MAX_LENGTH = 300;
    private static final int SINGLE_MIN_LENGTH = 30;
    private static final int MAX_WEIGHT_EXPRESS = 15;
    private static final int MAX_WEIGHT_NORMAL = 30;
    @Override
        public boolean validate(Parcel input) {

        return isXyzLessThan300(input) && isAllDimensionMoreThan30(input) && isWeightCorrect(input);
    }

    private static boolean isXyzLessThan300(Parcel input) {
        return input.getxLength() + input.getyLength() + input.getzLength() <= TOTAL_MAX_LENGTH;
    }
    private static boolean isAllDimensionMoreThan30(Parcel input) {
        return input.getxLength() > SINGLE_MIN_LENGTH
                && input.getyLength() > SINGLE_MIN_LENGTH
                && input.getzLength() > SINGLE_MIN_LENGTH;
    }
    private static boolean isWeightCorrect(Parcel input){
        return (input.isExpress && input.getWeight() < MAX_WEIGHT_EXPRESS) || (!input.isExpress() && input.getWeight() < MAX_WEIGHT_NORMAL);
    }
}
