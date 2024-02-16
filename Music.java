abstract class Instrument {
    public abstract void play();
}

class Guitar extends Instrument{

    @Override
    public void play() {
        System.out.println("Guitar is playing: tin tin tin");
    }
}

class Piano extends Instrument{

    @Override
    public void play() {
        System.out.println("Piano is playing: tan tan tan tan");
    }
}

class Flute extends Instrument{

    @Override
    public void play() {
        System.out.println(" Flute is playing: toot toot toot toot");
    }
}

public class Music{
    public static void main(String[] args) {
        Instrument instruments[] = new Instrument[10];

        instruments[0] = new Piano();
        instruments[1] = new Piano();
        instruments[2] = new Piano();

        instruments[3] = new Flute();
        instruments[4] = new Flute();
        instruments[5] = new Flute();

        instruments[6] = new Guitar();
        instruments[7] = new Guitar();
        instruments[8] = new Guitar();

        instruments[9] = new Flute();


        for(int index=0;index<10;index++)
        {
            instruments[index].play();
        }
    }
}


