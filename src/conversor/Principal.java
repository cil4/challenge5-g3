package conversor;

import javax.swing.JOptionPane;

public class Principal {
    
    public static void main(String[] args){

        int repetir = 0;

       
        do {
            
            String menu [] = {"Conversor de Monedas", "Conversor de Temperaturas", "Conversor de Peso"};
            String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione la tarea que desea realizar", "Conversor", 
                JOptionPane.QUESTION_MESSAGE, null,menu, menu[0]);
    
            
            switch (seleccion) {
                case "Conversor de Monedas":
                    conversorMonedas();
                    break;
                case "Conversor de Temperaturas":
                     conversorTemperaturas();
                    break; 
                case "Conversor de Peso":
                    conversorPeso();
                    break;
            }

            
            repetir = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Elija una opción", 2);

        } while(repetir == 0);

        
        JOptionPane.showMessageDialog(null, "Programa terminado", "Adiós", 1);
    }

   
    public static void conversorMonedas() {
        
        int repetir; // Por defecto la opción Aceptar es 0.

        do {
            String cantidad = JOptionPane.showInputDialog("Ingrese el monto a convertir:");
            String resultadoDivisa = "";
            double cantidadDouble = 0.0;
            String[] menu = {
                "De Pesos Argentinos (AR) a Dólares (USD)",
                "De Pesos Argentinos (AR) a Euros (EUR)",
                "De Pesos Argentinos (AR) a Libras Esterlinas (GBP)",
                "De Pesos Argentinos (AR) a Yenes Japoneses (JPY)",
                "De Pesos Argentinos (AR) a Wones SurCoreanos (KRW)",
                "De Dólares (USD) a Pesos Argentinos (AR)",
                "De Euros (EUR) a Pesos Argentinos (AR)",
                "De Libras Esterlinas (GBP) a Pesos Argentinos (AR)",
                "De Yenes Japoneses (JPY) a Pesos Argentinos (AR)",
                "De Wones SurCoreanos (KRW) a Pesos Argentinos (AR)",
            };
                
            try {
                
                cantidadDouble = Double.parseDouble(cantidad);

                
                String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione la opción de conversión de Monedas", "Monedas", 
                    JOptionPane.QUESTION_MESSAGE, null,menu, menu[0]);

                
                if (seleccion != null) {
                    switch (seleccion) {
                        case "De Pesos Argentinos (AR) a Dólares (USD)":
                            resultadoDivisa = ConvertirMonedas.USD.convertirARADivisa(cantidadDouble);
                            break;
                        case "De Pesos Argentinos (AR) a Euros (EUR)":
                            resultadoDivisa = ConvertirMonedas.EUR.convertirARADivisa(cantidadDouble);
                            break;
                        case "De Pesos Argentinos (AR) a Libras Esterlinas (GBP)":
                            resultadoDivisa = ConvertirMonedas.GBP.convertirARADivisa(cantidadDouble);
                            break;
                        case "De Pesos Argentinos (AR) a Yenes Japoneses (JPY)":
                            resultadoDivisa = ConvertirMonedas.JPY.convertirARADivisa(cantidadDouble);
                            break;
                        case "De Pesos Argentinos (AR) a Wones SurCoreanos (KRW)":
                            resultadoDivisa = ConvertirMonedas.KRW.convertirARADivisa(cantidadDouble);
                            break;
                        case "De Dólares (USD) a Pesos Argentinos (AR)":
                            resultadoDivisa = ConvertirMonedas.USD.convertirDivisaAAR(cantidadDouble);
                            break;
                        case "De Euros (EUR) a Pesos Argentinos (AR)":
                            resultadoDivisa = ConvertirMonedas.EUR.convertirDivisaAAR(cantidadDouble);
                            break;
                        case "De Libras Esterlinas (GBP) a Pesos Argentinos (AR)":
                            resultadoDivisa = ConvertirMonedas.GBP.convertirDivisaAAR(cantidadDouble);
                            break;
                        case "De Yenes Japoneses (JPY) a Pesos Argentinos (AR)":
                            resultadoDivisa = ConvertirMonedas.USD.convertirDivisaAAR(cantidadDouble);
                            break;
                        case "De Wones SurCoreanos (KRW) a Pesos Argentinos (AR)":
                            resultadoDivisa = ConvertirMonedas.USD.convertirDivisaAAR(cantidadDouble);
                            break;
                        default:
                            break;
                    }
                    
                    JOptionPane.showMessageDialog(null, resultadoDivisa);
                }
            
            } catch (NumberFormatException e) {
                
                JOptionPane.showMessageDialog(null, "Sólo se aceptan valores numéricos", "Valor inválido", JOptionPane.ERROR_MESSAGE);
            } finally {
                
                repetir = JOptionPane.showConfirmDialog(null, "¿Desea continuar en el conversor de Monedas?", "Elija una opción", 2);
            }

        } while(repetir == 0);
    }

    
     public static void conversorTemperaturas() {
        int repetir = 0;
        do {
            String cantidad = JOptionPane.showInputDialog("Ingresa el valor de la temperatura que deseas convertir ");
            String resultadoTemperatura = "";
            double cantidadDouble = 0.0;
            String menu [] = {
                "Convertir °C a °F.",
                
                "Convertir °F a °C.",
                
            };

            try {
               
                cantidadDouble = Double.parseDouble(cantidad);
                
                String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione la opción de conversión de Temperaturas", "Temperaturas", 
                    JOptionPane.QUESTION_MESSAGE, null,menu, menu[0]);

                if (seleccion != null) {
                    switch (seleccion) {
                        case "Convertir °C a °F.":
                            resultadoTemperatura = ConvertirTemperaturas.CELSIUS.convertirAFahrenheit(cantidadDouble);
                            break;
                        
                        case "Convertir °F a °C.":
                            resultadoTemperatura = ConvertirTemperaturas.FAHRENHEIT.convertirACelsius(cantidadDouble);
                            break;
                       
                        default:
                            break;
                    }

                    JOptionPane.showMessageDialog(null, resultadoTemperatura);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Sólo se aceptan valores numéricos", "Valor inválido", JOptionPane.ERROR_MESSAGE);
            } finally {
                repetir = JOptionPane.showConfirmDialog(null, "¿Desea continuar en el conversor de Temperaturas?", "Elija una opción", 2);
            }

        } while(repetir == 0);
    } 

    public static void conversorPeso() {
        int repetir = 0;
        do {
            String cantidad = JOptionPane.showInputDialog("Ingresa el valor del peso que deseas convertir ");
            String resultadoPeso = "";
            double cantidadDouble = 0.0;
            String menu [] = {
                "Convertir KILOS a LIBRAS",
                
                "Convertir LIBRAS a KILOS",
                
            };

            try {
               
                cantidadDouble = Double.parseDouble(cantidad);
                
                String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione la opción de conversión de Peso", "Peso", 
                    JOptionPane.QUESTION_MESSAGE, null,menu, menu[0]);

                if (seleccion != null) {
                    switch (seleccion) {
                        case "Convertir KILOS a LIBRAS":
                            resultadoPeso = ConvertirPeso.KILOS.convertirALibras(cantidadDouble);
                            break;
                        
                        case "Convertir LIBRAS a KILOS":
                            resultadoPeso = ConvertirPeso.LIBRAS.convertirAKilos(cantidadDouble);
                            break;
                       
                        default:
                            break;
                    }

                    JOptionPane.showMessageDialog(null, resultadoPeso);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Sólo se aceptan valores numéricos", "Valor inválido", JOptionPane.ERROR_MESSAGE);
            } finally {
                repetir = JOptionPane.showConfirmDialog(null, "¿Desea continuar en el conversor de Peso?", "Elija una opción", 2);
            }

        } while(repetir == 0);
    }
}
