package internship;


import java.time.LocalDate;


public class Main {
    public static void main(String[] args){

        Animal cat = new Animal();
        cat.setType("Cat");
        cat.setBreed("Maine Coon");
        cat.setAge(2);
        cat.setName("Luna");
        cat.setFavoriteFood("Fish");

        Adopter adopter = new Adopter ();
        adopter.setName("John");
        adopter.setMoney(350.50);

        RecreationActivity activity = new RecreationActivity();
        activity.setName("Walk");

        Food food = new Food();
        food.setName("Solid food");
        LocalDate date = LocalDate.of(2023,10,21);
        food.setExpirationDate(date);

        Veterinarian veterinarian = new Veterinarian();
        veterinarian.setName("Martha");
        veterinarian.setSpecialization("Pets");

        Game game = new Game();
        game.setAdopter(adopter);
        Animal animal = new Animal();
        game.setDog(animal);
        game.setVeterinarian(veterinarian);


        System.out.println("The animal details are: type " + cat.getType() + " breed " + cat.getBreed()
                + " age " + cat.getAge() + " name " + cat.getName() + " food " + cat.getFavoriteFood());

        System.out.println("Adopter details are: name: " + adopter.getName() + " and money: " + adopter.getMoney());

        System.out.println("Recreation activity details are: name = " + activity.getName());

        System.out.println("Food details are: name = " + food.getName() + " expiration date:  " +  food.getExpirationDate());



    }


}
