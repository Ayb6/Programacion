
public class TestUrna {

    public static void main(String[] args) {
        Urna urn = new Urna((int) (Math.random() * 10 + 1), (int) (Math.random() * 10 + 1));

        System.out.print("Urna creada con " + urn.getBlancas() + " bolas blancas");
        System.out.println(" y " + urn.getNegras() + " bolas negras");

        while (urn.totalBolas() > 1) {
            char bola1 = urn.extraerBola();
            char bola2 = urn.extraerBola();

            System.out.println("Se ha extraido una bola " + bola1);
            System.out.println("Se ha extraido una bola " + bola2);

            if (bola1 == bola2) {
                urn.meterBola('b');
                System.out.println("Se ha metido una bola BLANCA.");
            } else {
                urn.meterBola('n');
                System.out.println("Se ha metido una bola NEGRA.");

            }
            System.out.println("Quedan " + urn.totalBolas() + " bolas en la urna.");
            System.out.println(urn.getBlancas() + " blancas y " + urn.getNegras() + " negras.");
        }
        if (urn.totalBolas() == 1) {
            char bolaf = urn.extraerBola();
            System.out.println("Se ha extraido la bola final de color " + bolaf);
        }
    }
}
