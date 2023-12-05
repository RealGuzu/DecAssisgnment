interface Playable {
    void play();
}

class Football implements Playable {
    @Override
    public void play() {
        System.out.println("Playing football...");
    }
}

class Volleyball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing volleyball...");
    }
}

class Basketball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing basketball...");
    }
}

public class QuesSeven {    public static void main(String[] args) {
        Playable football = new Football();
        football.play();

        Playable volleyball = new Volleyball();
        volleyball.play();

        Playable basketball = new Basketball();
        basketball.play();
    }
}
