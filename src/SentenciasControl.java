public class SentenciasControl {
    public static void main(String[] args) {
        // CONDICIONALES
        String estacion = "primavera";
        int temperatura = 30;
        if (estacion == "verano" && temperatura > 28) {
            System.out.println("Es verano y hace calor");
        } else if (estacion == "invierno"){
            System.out.println("Es invierno");
        } else
            System.out.println("Estamos en otra estación " + estacion);

        // WHILE y DO-WHILE
        while (temperatura > 0) {
            temperatura -= 5;
            System.out.println(temperatura);
        }
        do {
            System.out.println("La temperatura ha aumentado a " + temperatura);
            temperatura += 5;
        } while (temperatura <=30 );

        // FOR
        for (temperatura=0; temperatura<=10; temperatura++) {
            System.out.println("Estoy en un ciclo FOR: " + temperatura);
        }
        for (int i=10;i<=12;i++) {
            System.out.println("i: " + i);
        }
        System.out.println("la tempreatura ha disminuido a " + temperatura + " grados");
        System.out.println("Recorrer un arreglo de 6 elementos:");
        int valores[] = new int[6];
        int valores2[] = {10, 20, 30, 40, 50, 60};
        for (int i=0;i<valores.length;i++) {
            valores[i] = i*13;
            System.out.println("El valor de valores["+i+"] es: " + valores[i]);
            System.out.println("valores2["+i+"]: "+valores2[i]);
        }
        // SWITCH - CASE
        switch (estacion) {
            case "verano":
                System.out.println("Es verano");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("Es otra cosa");
        }
        String diaSemana = "miércoles";
        switch (diaSemana) {
            case "lunes":
            case "martes":
            case "miércoles":
            case "jueves":
            case "viernes":
                System.out.println("Es un día laborable");
                break;
            case "sábado":
            case "domingo":
                System.out.println("Es un día NO laborable");
                break;
            default:
                System.out.println("No es un día conocido");
        }

    }
}
