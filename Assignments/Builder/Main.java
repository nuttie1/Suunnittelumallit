package Assignments.Builder;

public class Main {


    public static void main(String[] args) {
        Director director = new Director();
        HesburgerBuilder hesburgerBuilder = new HesburgerBuilder();
        McDonaldsBuilder mcDonaldsBuilder = new McDonaldsBuilder();

        director.setBuilder(hesburgerBuilder);
        director.makeBurger();
        System.out.println("Hese: " + hesburgerBuilder.getBurger());
        director.makeDoubleBurger();
        System.out.println("Hese: " + hesburgerBuilder.getBurger());

        director.setBuilder(mcDonaldsBuilder);
        director.makeBurger();
        System.out.println("Mcd: " + mcDonaldsBuilder.getBurger());
        director.makeDoubleBurger();
        System.out.println("Mcd: " +mcDonaldsBuilder.getBurger());


    }

}

