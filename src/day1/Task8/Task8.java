package day1.Task8;

public class Task8 {
    public static void main(String[] args) {
        Parcel parcel = new Parcel(31, 35, 40, 25, false);
        Validator validator = new ParcelValidator();
        System.out.println(validator.validate(parcel));
    }
}