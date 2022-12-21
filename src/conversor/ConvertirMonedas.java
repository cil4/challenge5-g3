package conversor;

import java.util.Locale;

public enum ConvertirMonedas {

    AR(1), 
    USD(173.92),
    EUR(184.78),
    GBP(211.98),
    JPY(1.32),
    KRW(0.14);

    
    private double equivalencia;
    
    
    ConvertirMonedas(double equivalencia) {
        this.equivalencia = equivalencia;
    }

    
    public double getEquivalencia() {
        return equivalencia;
    }

    /**
     
     * @param cantidad
     * @return String con cantidad/equivalencia de la divisa en AR.
     */
    public String convertirARADivisa(double cantidad) {
        return String.format(Locale.ROOT,"El resultado es %.2f %s.",(cantidad / this.equivalencia), this.toString());
    }

    /**
    
     * @param cantidad
     * @return String con cantidad * equivalencia de la divisa en AR.
     */
    public String convertirDivisaAAR(double cantidad) {
        return String.format(Locale.ROOT,"El resultado es %.2f AR.",(cantidad * this.equivalencia));
    }
}
