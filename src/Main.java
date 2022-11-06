public class Main {
    public static void main(String[] args) {
        // CONDICIONALES
        int numeroIf = 20;
        if (numeroIf > 0) {
            System.out.println("numeroIf es MAYOR que cero");
        } else if (numeroIf == 0){
            System.out.println("numeroIf es IGUAL a cero");
        } else
            System.out.println("numeroIf es MENOR a cero");

        // WHILE y DO-WHILE
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("WHILE < 3: " + numeroWhile);
        }
        numeroWhile = 2;
        do {
            numeroWhile++;
            System.out.println("DO-WHILE < 3: " + numeroWhile);
        } while (numeroWhile < 3 );

        // FOR
        for (int numeroFor=0; numeroFor<=3; numeroFor++) {
            System.out.println("Iteración de FOR: " + numeroFor);
        }

        for (int i=10;i<=12;i++) {
            System.out.println("i: " + i);
        }

        // SWITCH
        String estacion = "LUNAR";
        switch (estacion) {
            case "VERANO":
            case "INVIERNO":
            case "PRIMAVERA":
            case "OTOÑO":
                System.out.println("Es " + estacion);
                break;
            default:
                System.out.println(estacion + " no es una estación del año");
        }
    }
}
