package multimedia;

import java.util.Scanner;

public class PlayerMultimediale {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Inserisci il tipo di elemento (1: Audio, 2: Video, 3: Immagine)");
            int tipo = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Inserisci il titolo: ");
            String titolo = scanner.nextLine();

            switch (tipo){
                case 1: //Audio
                    System.out.println("Inserisci la durata: ");
                    int durataAudio = scanner.nextInt();
                    System.out.println("Inserisci il volume: ");
                    int volumeAudio = scanner.nextInt();
                    elementi[i] = new Audio(titolo, durataAudio, volumeAudio);
                    break;
                case 2: //Video
                    System.out.println("Inserisci la durata ");
                    int durataVideo = scanner.nextInt();
                    System.out.println("Inserisci il volume: ");
                    int volumeVideo = scanner.nextInt();
                    System.out.println("Inserisci la luminosità: ");
                    int luminositaVideo = scanner.nextInt();
                    elementi[i] = new Video(titolo, durataVideo, volumeVideo, luminositaVideo);
                    break;
                case 3: //Immagine
                    System.out.println("Inserisci luminosita: ");
                    int luminositaImmagine = scanner.nextInt();
                    elementi[i] = new Immagine(titolo, luminositaImmagine);
                    break;

                default:
                    System.out.println("Tipo non valido!");
                    i--;
            }
        }
        //eseguo un elemento scelto
        int scelta;
        do{
            System.out.println("Quale elemento vuoi eseguire? (1-5, 0 per uscire): ");
            scelta = scanner.nextInt();

            if (scelta > 0 && scelta <= 5){
                ElementoMultimediale elemento = elementi[scelta - 1];

                if (elemento instanceof Audio){
                    ((Audio) elemento).play();
                }else if(elemento instanceof Video){
                    ((Video) elemento).play();
                }else if (elemento instanceof Immagine){
                    ((Immagine) elemento).show();
                }
            }
        } while (scelta != 0);

        System.out.println("Uscita dal player.");
        scanner.close();
    }
}
