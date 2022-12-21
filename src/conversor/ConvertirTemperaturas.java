package conversor;

public enum ConvertirTemperaturas {
    CELSIUS,
    FAHRENHEIT;

    /**
     
     * @param valor: cantidad de grados a convertir
     * @return 
     */
    public String convertirAFahrenheit(double valor) {
        double resultado = 0.0;
        if(this.name() == CELSIUS.name())
            resultado = (valor * 1.8) + 32;
        
        
        return String.format("%.2f° %s es igual a %.2f° FAHRENHEIT", valor, this.name(), resultado);
    }

    /**
     
     * @param valor: 
     * @return 
     */
    

    /**
    
     * @param valor: 
     * @return 
     */
    public String convertirACelsius(double valor) {
        double resultado = 0.0;
        if(this.name() == FAHRENHEIT.name())
            resultado = (valor - 32) * (0.5556);
        

        return String.format("%.2f° %s es igual a %.2f° CELSIUS", valor, this.name(), resultado);
    }
}
