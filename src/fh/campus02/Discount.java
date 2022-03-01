package fh.campus02;

public class Discount {
    public static void main(String[] args) {
        //On the bus you receive a discount if you are a senior citizen, a dog or a student.
        boolean isSeniorCitizen = true;
        boolean isStudent = false;
        boolean isDog = false;
        System.out.println("On this bus you get a discount: " + (isSeniorCitizen || isDog || isStudent));

        //In a bookshop you receive a discount if you buy more than 2 non-fiction books and at least one fiction book.
        int nonFiction = 3;
        int fiction = 2;
        System.out.println("In this bookshop I get a discount: " + (nonFiction >= 2 && fiction > 0));

        //In a grocery shop you get a discount if you buy one drink, but only if it is not alcoholic.
        int alcoholic = 1;
        int nonAlcoholic = 0;
        int drink = 0;
        System.out.println("For this grocery haul you get a discount: " + (drink != 1));
    }
}
