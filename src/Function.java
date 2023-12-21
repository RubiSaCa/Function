public class Function {

    /*Como comentario de la clase de comentarios estan las sintaxis
     * @autor - El autor de la clase
     * {@code} - Muestra texto en formato de codigo sin que sea interpretado como codigo HTML
     * {@docRoot} -Indica la ruta relativa al directorio raiz del documento generado desde cualquier pagina generada
     * @deprecated - Se pone indicando que esta API no debe usarse mas
     * @exception - Se indica cuando es vulnerable a lanzar una excepcion, en seguida se ponen las clases de las excepciones posibles
     * {@inheritDoc} - Indica la herencia o implementacion procedentora
     * {@link} - Hace un enlace a la miembro indicado
     * {@linkplain} - Lo mismo que en anterior excepto que la etiqueta del enlace se muestra en texto plano
     * @param - A;ade parametros con nombres especificos, seguido de su descripcion
     * @return - Asigna un parametro de retorno, seguido de su descripcion
     * @see - Se anade para manejar referencias, o informacion, relacionada
     * @serial - Se utiliza para indicar campos o clases serializables.
     * @serialData - Se utiliza para documentar metodos que generan una srializacion
     * @serialField - Se utiliza para documentar objetos seriados
     * @since - Se anade en el escabezado para especificar desde cuando fue creado
     * @throws - Es sincronimo con la etiqueta @exception
     * {@value} - Cuando es usado sin argumento se usa para especificar un campo estatico en otro caso se usa para mostar el valor constante
     * @version - Se anade en el subtimulo con la version especificada.
     */

    public static void main(String[] args){
        double y = 3;
        //Area de un circulo
        //pi * r2
        double area = cicleArea(y);
        System.out.println(cicleArea(y));

        //Area de una esfera
        // 4 * PI * r2
        double svolumen = sphereArea(y);
        System.out.println(cicleArea(y));

        /*Volumen de una esfera
         * 
         *(4/3)*pi*r3*/
        double volumen = sphereVolumen(y);
        System.out.println(cicleArea(y));

        /** 
         * Puedes usar lenguaje html para darle orden
         * Descripcion: Funcion que especificando su moneda convierte una cantidad de dinero
         * 
         * @param quantity Cantidad de dinero
         * @param curency Tipo de Moneda: Solo para MXN O COP
         * @return quantity Devuelve la cantidad actualizada en Dolares
         */
        System.out.println("Pesos a dolares: " + converToDolar(200, "MNX"));
    }

    public static double cicleArea(double r){
        return Math.PI * Math.pow(r,2);
    }

     public static double sphereArea(double r){
        return 4 * Math.PI * Math.pow(r,2);
    }

     public static double sphereVolumen(double r){
        return (4/3) * Math.PI * Math.pow(r,3);
    }

     public static double converToDolar(double quantity, String currency){
        switch (currency) {
            case "MNX":
                quantity = quantity * 0.052;
                break;

            case "COP":
                quantity = quantity * 0.00031;
                break;

            default:
                break;
        } 
            return quantity;
    }
}