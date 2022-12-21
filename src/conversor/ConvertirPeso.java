package conversor;

import java.util.Locale;

public enum ConvertirPeso {
    KILOS,
    LIBRAS;

    /**
     
     * @param valor: cantidad de peso a convertir
     * @return 
     */
    public String convertirAKilos(double valor) {
        double resultado = 0.0;
        if(this.name() == LIBRAS.name())
            resultado = (valor / 2.2046);
        
        
        return String.format(Locale.ROOT,"%.2f %s es igual a %.2f KILOS", valor, this.name(), resultado);
    }

    /**
     
     * @param valor: 
     * @return 
     */
    

    /**
    
     * @param valor: 
     * @return 
     */
    public String convertirALibras(double valor) {
        double resultado = 0.0;
        if(this.name() == KILOS.name())
            resultado = (valor  * 2.2046);
        

        return String.format(Locale.ROOT,"%.2f %s es igual a %.2f LIBRAS", valor, this.name(), resultado);
    }
}
