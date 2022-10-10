import java.util.Random;
import java.util.Scanner;

public class party {

    public void ifElse(){

        boolean condition = true;
        boolean condition2 = false;
        boolean condition3 = true;
        boolean result = condition && (condition2 || condition3);

        if(result){                                    //if else Anweisung
            System.out.println("Wahr");
        }else{
            System.out.println("Falsch");
        }

    }

    public void swichCaseSchleife(){

        int date = 1;

        switch (date){                                  //switch case Anweisung/Schleife
            case 1: System.out.println("Januar");
                break;
            case 2: System.out.println("Februar");
                break;
            case 3: System.out.println("März");
                break;
            default: System.out.println("Nicht im ersten Quartal.");
                break;
        }

    }


    public void whileSchleifen(){

        int numb = 0;

        while(numb <= 10){                              //while Schleife
            System.out.println(numb);
            numb++;
        }

    }

    public void doWhileSchleifen(){

        int numb = 0;
        int numb2 = 11;

        do{                                             //do while Schleife
            System.out.println(numb);
            numb++;
        }while(numb < 11);


    }

    public void forSchleifen(){

        //for Schleife
        for(int zaehler = 0; zaehler < 5; zaehler++) {
            System.out.println(zaehler);
        }

        int [] array = new int[10];

        for(int zaehler = 0; zaehler < 10; zaehler++){              //Diese Funktion weist meinem array den wert des zaehlers plus 5 zu
            array[zaehler] = zaehler + 5;                           // dies geschieht 10mal (0-9)
        }
        for(int i = 0; i < 10; i++){                                //Hier wird der wert dann ausgegeben print nr 0 ist dann 5, da wir dem
            System.out.println(array[i]);                           // array an der Stelle null die 5 zugewiesen haben an Stelle 1 die 5 + 1 usw.
        }                                                           // die Funktion läuft so lange bis i = 9 erreicht ist und spuckt so alle 10 werte
        // (von 0-9) des arrays aus. ALso 0 = 5   1 = 5+1=6  2 = 6+1=7 usw.

        // i % 5 -> modolo -> rechnet i / 5 und schaut bei int (integer/ganzzahl) auf den Rest wenn i=0 ist ist i % 5 = 0 rest 0 und nimmt somit 0 an
        // wenn i=1 ist dann ist i % 5 = 0 rest 1 und nimmt somit für die Variable eine 1 an (i=2) i%5 = 0 rest 2 usw. bei i=5 wären es dann
        // 1 rest 0 und somit eine 0 so wird dann nicht unendlich hochgerechnet sondern nur von 0-5 gezählt was für ein array mit 5 werten optimal ist.

    }


    public void scannerTexteingabe(){

        int value = 0;
        int value1 = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Gebe die erste Zahl ein.");             //Gibt alle geraden Zahlen zwischen den
        value = value + scanner.nextInt();                          //zwei eingegebenen Werten aus.
        System.out.println("Gebe nun die zweite Zahl ein.");
        value1 = value1 + scanner.nextInt();
        for (int i = value; i < value1; i += 2)
            System.out.println(i);

    }


    public void randomZufallsanweisung(){

        Random random = new Random();                       //Wordgenerator Umlaute an Stelle 2 und 4,
        String umlaut = "AEIOU";                            //Konsonanten an 1,3 und 5.
        String konsonant = "BCDFGHIJKLMNPQRSTVWXYZ";
        String word = "";
        boolean test = true;

        for (int i = 0; i < 5; i++){

            if(test){
                int stelle = random.nextInt(22);
                word += konsonant.charAt(stelle);
                test = false;
            }else{
                int stelle2 = random.nextInt(5);
                word += umlaut.charAt(stelle2);
                test = true;
            }

        }
        System.out.println(word);


        for (int i = 0; i < 5; i++){                            //Gleiches Ergebnis mit anderem Lösungsweg

            if(i != 1 && i != 3){
                int stelle = random.nextInt(22);
                word += konsonant.charAt(stelle);
            }else{
                int stelle2 = random.nextInt(5);
                word += umlaut.charAt(stelle2);
            }

        }
        System.out.println(word);

    }


    public void arraysVerzeichnisse(){


        String [] werkzeuge = {"Hammer", "Meißel","Schleifmaschiene"}; //In den geschweiften Klammern sind die Werte des Arrays gespeichert
        System.out.println(werkzeuge[0]);                              //Mit werkzeuge[0] greife ich nun auf das erste zu mit 1 auf das zweite usw.

        int [] numbers = new int[1000];

        for (int n = 0; n < numbers.length; n++ ){
            numbers[n] = n + 1;
        }

        for (int n = 0; n < numbers.length; n++ ){
            System.out.println(numbers[n]);
        }


    }


    public void zugriffAufKlassenUndMethoden(){

        Hund hundObjekt1 = new Hund();  //Zugriff auf die Klasse und definition eines Zugriffnamens

        hundObjekt1.bellen();           //Zugriff auf Methode Bellen von Klasse Hund
        hundObjekt1.plusRechnen(3,7);   //Zugriff auf Methode plusRechenen von Klasse Hund mit 2 Parametern für
        //zahl1 und zahl2 welche in der Methode definiert aber nicht zugewiesen wurden
    }


    public void objekte(){
        Hund labrador = new Hund();

        labrador.testMethode(true);

    }

    public void konstruktorLernen(){ //Weitere infos siehe Hund2

        Hund2 labradoodle = new Hund2(4,"Labradoodle","beige", false); //Hier wurde ein Objekt definiert und die Werte konnten
        Hund2 mops = new Hund2(5,"Mops","braun", true);                //über den Konstruktor zugewiesen werden
        Hund2 deerhound = new Hund2(1,"Hirschhund","grau", true);      //die Variablen kommen aus dem Konstruktor und sind den
        Hund2 jackrussle = new Hund2(8,"Jack Russle Terrier","schwarzweiß", false); //Variablen(Attributen) in Hund2 zugewiesen
        //so können mehrere Objekte mit wenigen Variablen erstellt
        Hund2[] hunde = {labradoodle, mops, deerhound, jackrussle};                                 //und verwendet werden und es können sogar Arrays mit diesen
        //erstellt werden
        System.out.println("Der " + labradoodle.art + " ist " + labradoodle.alter + " Jahre alt und hat die Fellfarbe " + labradoodle.fellfarbe + ".");

        System.out.println("Welche Arten von Hunden gibt es?");
        for (int i = 0; i < hunde.length; i++) {
            System.out.println(hunde[i].art);
        }

        System.out.println("Wie viele Hunde können Pfote geben?");
        int j = 0;
        for (int i = 0; i < hunde.length; i++){
            if(hunde[i].kannPfoteGeben){
                j++;
            }
        }
        System.out.println(j);
    }

    public static Hund2 hundErstellen(int alter){                                   //Methode mit dem Rückgabewert eines Objekts
        return new Hund2(alter,"Labrador","weiß",true);    //gibt art fellfarbe und kannPfotenGeben an den Konstruktor
    }                                                                              //und das alter als int variable

    public static void hundErstellenMain(){                                        //wird hier nun aufgerufen und es werden über die Methode hundErstellen
        Hund2 hund1 = hundErstellen(1);                                       //nun Objekte erstellt in diesem fall "Hunde" die sich nur im Alter
        Hund2 hund2 = hundErstellen(8);                                       //unterscheiden
        Hund2 hund3 = hundErstellen(3);
        Hund2 hund4 = hundErstellen(6);
    }

    public static void taschenrechnerEmpfang(){
        Taschenrechner taschenrechner = new Taschenrechner();

        //25 + (3*14) - 256

        int produkt = taschenrechner.multiplizieren(3,14);
        int differenz = taschenrechner.subtrahieren(produkt, 256);
        int summe = taschenrechner.addieren(differenz, 25);

        System.out.println(summe);
    }

    public void forEachSchleife(){
        int numbers[] = {123, 456, 1532, 948472, 12};
        String words [] = {"Hallo", "mein", "Name", "ist"};

        for(int i : numbers){               //for-each Schleife
            System.out.println(i);          //gut um Datenstruckturen auszulesen
        }
        for(String word : words){           //Verändert Daten auf die sie zugreift nicht
            System.out.println(words);      //sondern speichert nur Kopien
        }
    }

//For-each Schleifen:
//-> Sind am besten geeignet um Datenstrukturen auszulesen (Arrays, Listen)
//-> Sind übersichtlicher als Fori-Schleifen
//-> Keine Veränderung möglich sondern speichern nur Kopien

//Fori-Schleifen (For Schleife):
//-> Verwendung, wenn es um die Zählvariable geht
//-> Wenn man seinen Code x-mal durchlaufen will
//-> Sehr schreibintensiv

//Wenn möglich immer for-each verwenden, da übersichtlicher und einfacher
//allerdings nicht immer verwendbar s.o.