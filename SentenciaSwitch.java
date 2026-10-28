
public class SentenciaSwitch {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca un mes: ");
        String mes = System.console().readLine();

        String nombreDelMes;

        switch (mes) {
            case "enero":
                nombreDelMes = "enero";
                break;
            case "febrero":
                nombreDelMes = "febrero";
                break;
            case "marzo":
                nombreDelMes = "marzo";
                break;
            case "abril":
                nombreDelMes = "abril";
                break;
            case "mayo":
                nombreDelMes = "mayo";
                break;
            case "junio":
                nombreDelMes = "junio";
                break;
            case "julio":
                nombreDelMes = "julio";
                break;
            case "agosto":
                nombreDelMes = "agosto";
                break;
            case "septiembre":
                nombreDelMes = "septiembre";
                break;
            case "octubre":
                nombreDelMes = "octubre";
                break;
            case "noviembre":
                nombreDelMes = "noviembre";
                break;
            case "diciembre":
                nombreDelMes = "diciembre";
                break;
            default:
                nombreDelMes = "no existe ese mes";
        }

        System.out.println("Mes " + mes + ": " + nombreDelMes);
    }
}
