package principal;
import java.util.Scanner;

import exchangeconsultas.ExchangeConsultaApi;
import exchangeconsultas.Moneda;
import exchangeconsultas.MonedaRecord;

public class Principal {

    public static void buclePrincipal() {
        Scanner scan = new Scanner(System.in);
        MonedaPrin monedaPrin = new MonedaPrin();
        while (true) {
            int valorConversion;

            System.out.println("*******************************************");
            System.out.println("Bienvenido/a al conversor de monedas.");
            System.out.println("*******************************************\n\n");
            System.out.println("1) Dólar => Peso argentino");
            System.out.println("2) Peso argentino => Dólar");
            System.out.println("3) Dólar => Real brasileño");
            System.out.println("4) Real brasileño => Dólar");
            System.out.println("5) Dólar => Peso colombiano");
            System.out.println("6) Peso colombiano => Dólar");
            System.out.println("7) Salir");
            System.out.println("Elija una opción valida.");
            System.out.println("*******************************************\n");

            try {
                int elecUsuario = scan.nextInt();

                switch (elecUsuario) {
                    case 1:
                    	monedaPrin.setMonInicial("USD");
                    	monedaPrin.setMonFinal("ARS");
                        break;
                    case 2:
                    	monedaPrin.setMonInicial("ARS");
                        monedaPrin.setMonFinal("USD");
                        break;
                    case 3:
                    	monedaPrin.setMonInicial("USD");
                    	monedaPrin.setMonFinal("BRL");
                        break;
                    case 4:
                        monedaPrin.setMonInicial("BRL");
                        monedaPrin.setMonFinal("USD");
                        break;
                    case 5:
                    	monedaPrin.setMonInicial("USD");
                    	monedaPrin.setMonFinal("COP");
                        break;
                    case 6:
                    	monedaPrin.setMonInicial("COP");
                        monedaPrin.setMonFinal("USD");
                        break;
                    case 7:
                        System.out.println("Gracias por usar el conversor de monedas. ¡Adiós!");
                        scan.close();
                        return;
                    default:
                        System.out.println("Ingrese un número válido.");
                        continue;
                }

                System.out.println("Ingresa el valor que deseas convertir: ");
                valorConversion = scan.nextInt();
                monedaPrin.setValorParaConversion(valorConversion);
                Moneda moneda = ExchangeConsultaApi.hacerConsulta(monedaPrin.getMonInicial(), monedaPrin.getMonFinal(), monedaPrin.getValorParaConversion());
                MonedaRecord monedaRecord = new MonedaRecord(moneda, monedaPrin.getValorParaConversion());
                System.out.println(monedaRecord);
                

            } catch (Exception e) {
                System.out.println("Ocurrió un error, intente nuevamente.");
                scan.nextLine();
            }
        }
    }


    public static void main(String[] args) {
        buclePrincipal();
    }
}

