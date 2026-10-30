
public class SentenciaSwitch {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca un mes: ");
        String mes = System.console().readLine();

        String nombreDelMes;

        switch (mes) {
            case "enero":
                nombreDelMes = "enero hace frío";
                break;
            case "febrero":
                nombreDelMes = "febrero Sam Valentín";
                break;
            case "marzo":
                nombreDelMes = "marzo empieza la primavera";
                break;
            case "abril":
                nombreDelMes = "abril Semana Santa";
                break;
            case "mayo":
                nombreDelMes = "mayo cruces";
                break;
            case "junio":
                nombreDelMes = "junio verano";
                break;
            case "julio":
                nombreDelMes = "julio vacaciones";
                break;
            case "agosto":
                nombreDelMes = "agosto viajes";
                break;
            case "septiembre":
                nombreDelMes = "septiembre vuelta al cole";
                break;
            case "octubre":
                nombreDelMes = "octubre Halloween";
                break;
            case "noviembre":
                nombreDelMes = "noviembre puente de todos los santos";
                break;
            case "diciembre":
                nombreDelMes = "diciembre Navidad";
                break;
            default:
                nombreDelMes = "no existe ese mes";
        }

        System.out.println("Mes " + mes + ": " + nombreDelMes);
    }
}
