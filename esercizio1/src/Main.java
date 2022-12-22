import java.util.Scanner;
public class Main {

    //metodo per visualizzare Hello World
    public static void saluto() {
        System.out.println("Hello World!");}

    public static void nome() {
        System.out.println("+______+");
        System.out.println("|MATTEO|");
        System.out.println("+______+");
    }

    public static class Rettangolo {
        float b, h;
        public Rettangolo(float l1, float l2) {
            this.b = l1;
            this.h = l2;
        }
        public float perimetro() {
            return (b + h) * 2;
        }
        public float area() {
            return b * h;
        }
    }

    public static class Quadrato {
        float l;
        public Quadrato(float l1) {
            this.l  = l1;
        }
        public float perimetro() {
            return l*4;
        }
        public float area() {
            return l*l;
        }
    }

    public static class Triangolo {
        double l;
        public Triangolo(double l1) {
            this.l = l1;

        }
        public double perimetro() {
            return l*3;
        }
        public double area() {
            double h = Math.sqrt(3)/2*l;
            return (l*h)/2;
        }
    }

    public static class Cerchio {
        double r;
        public Cerchio(double r1) {
            this.r = r1;
        }
        public double circonferenza() {
            return r*2*Math.PI;
        }
        public double area() {
            return r*r*Math.PI;
        }
    }

    public static class Calcolatrice {
        float n1, n2;

        public Calcolatrice(float v1, float v2){
            this.n1=v1;
            this.n2=v2;
        }

        public float somma(){
            return n1+n2;
        }
        public float differenza(){
            return n1-n2;
        }
        public float moltiplicazione(){
            return n1*n2;
        }
        public float divisione(){
            return n1/n2;
        }
    }
    public static void main(String[] args) {
        saluto();
        nome();
        //creazione e stampa rettangolo
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci la base");
        float base = input.nextFloat();
        System.out.println("Inserisci l'altezza");
        float altezza = input.nextFloat();
        Rettangolo r = new Rettangolo (base, altezza);
        System.out.println("Il perimetro del rettangolo è: " + r.perimetro() + " e l'area è: " + r.area());

        //creazione e stampa quadrato
        System.out.println("Inserisci il lato del quadrato");
        float lato = input.nextFloat();
        Quadrato q = new Quadrato(lato);
        System.out.println("Il perimetro del quadrato è: " + q.perimetro() + " e l'area è: " + q.area());

        //creazione e stampa quadrato
        System.out.println("Inserisci il lato del triangolo equilatero");
        double latotri = input.nextDouble();
        Triangolo t = new Triangolo(latotri);
        System.out.println("Il perimetro del triangolo è: " + t.perimetro() + " e l'area è: " + t.area());

        //creazione e stampa quadrato
        System.out.println("Inserisci il raggio del cerchio");
        double raggio = input.nextDouble();
        Cerchio c = new Cerchio(raggio);
        System.out.println("La circonferenza del cerchio è: " + c.circonferenza() + " e l'area è: " + c.area());

        //Orario Completo -> Secondi
        System.out.println("Inserisci il tempo in giorni, ore, minuti e secondi richiesti");
        int giorni = input.nextInt();
        int ore = input.nextInt();
        int minuti = input.nextInt();
        int secondi = input.nextInt();
        int seconds = giorni*86400+ore*3600+minuti*60+secondi;
        System.out.println("Il tempo richiesto in secondi secondi è: " + seconds);

        //Secondi -> Orario Completo
        giorni = seconds/86400;
        seconds = seconds - giorni*86400;
        ore = seconds/3600;
        seconds = seconds - ore*3600;
        minuti = seconds/60;
        seconds = seconds - minuti*60;
        System.out.println("L'orario completo è " + giorni + ":" + ore + ":"+ minuti + ":" + secondi);

        //Calcolatrice
        System.out.println("Inserisci i due numeri da inserire nella calcolatrice");
        float v1 = input.nextFloat();
        float v2 = input.nextFloat();
        Calcolatrice cal = new Calcolatrice(v1, v2);
        System.out.println("La somma dei due numeri che hai inserito è: " + cal.somma() +
                           ", la differenza dei due numeri che hai inserito è: " + cal.differenza() +
                           ", il prodotto dei due numeri che hai inserito è: " + cal.moltiplicazione() +
                           ", la divisione dei due numeri che hai inserito è: " + cal.divisione());
    }
}