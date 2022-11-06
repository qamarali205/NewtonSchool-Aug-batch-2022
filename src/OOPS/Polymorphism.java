public class Polymorphism {

    public void playGame(){
        System.out.println("Playing the game");
    }

    public void playGame(int a){
        System.out.println("Playing the game " + a);
    }
}

class Cricket extends Polymorphism{
    public void playGame(){
        System.out.println("Playing cricket");
    }
}

class Football extends Polymorphism{
    public void playGame(){
        System.out.println("Playing Football");
    }
}

class Main8
{
    public static void main(String[] args) {
        Polymorphism game=new Polymorphism();
        Polymorphism cricket=new Cricket();
        Polymorphism football=new Football();

        game.playGame();
        game.playGame(7);
        cricket.playGame();
        football.playGame();


        // playgame is having many forms
    }

}

// method overriding - runtime
// method overloading - compile

// polumorphirm