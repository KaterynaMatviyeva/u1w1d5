package multimedia;

public class Audio extends ElementoMultimediale{
    private int durata;
    private int volume;


    public Audio(String titolo,int durata, int volume ) {
        super(titolo);
        this.volume = volume;
        this.durata = durata;
    }

   public void alzaVolume(){
        volume++;
   }
   public void abbassaVolume(){
        volume--;
   }
public void play(){
    for (int i = 0; i < durata; i++) {
        System.out.println(titolo + " " + "!".repeat(volume));
    }
}
}

