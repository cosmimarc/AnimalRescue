package internship;


import java.time.LocalDate;


public class Main {
    public static void main(String[] args){

        Animal cat = new Animal();
        cat.type = "Cat";
        cat.breed = "Maine Coon";
        cat.age = 2;
        cat.name = "Luna";
        cat.favoriteFood = "Fish";

        Adopter adopter = new Adopter ();
        adopter.name = "John";
        adopter.money = 350.50;

        RecreationActivity activity = new RecreationActivity();
        activity.name = "Walk";

        Food food = new Food();
        food.name = "Solid food";
        LocalDate date = LocalDate.of(2023,10,21);
        food.expirationDate = date;

        Veterinarian veterinarian = new Veterinarian();
        veterinarian.name = "Martha";
        veterinarian.specialization = "Pets";

        Game game = new Game();
        game.adopter = adopter;
        Animal animal = new Animal();
        game.dog = animal;
        game.veterinarian = veterinarian;


        System.out.println("The animal details are: type " + cat.type  + " breed " + cat.breed
                         + " age " + cat.age + " name " + cat.name + " food " + cat.favoriteFood);

        System.out.println("Adopter details are: name: " + adopter.name + " and money: " + adopter.money);

        System.out.println("Recreation activity details are: name = " + activity.name);

        System.out.println("Food details are: name = " + food.name + " expiration date:  " +  food.expirationDate);



    }


}
