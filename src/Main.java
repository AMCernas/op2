public class Main {


    
    public static void main(String[] args) {

        //if
        int numerolf = 5;

        if(numerolf > 0){
            System.out.println("El numero es positivo");

        } else if(numerolf < 0){
            System.out.println("El numero es negativo");
        } else{
            System.out.println("El numero es 0");
        }

        //while
        int numerowhile = 0;
        
        while(numerowhile < 3){
            numerowhile = numerowhile + 1;
            System.out.println(numerowhile);

        }
        //dowhile
        do{
            numerowhile = numerowhile +1;
            System.out.println(numerowhile);
        }while(numerowhile < 3);


        //for

        for (int numerofor = 0; numerofor <= 3; numerofor++){
            System.out.println(numerofor);
        }

        //switch

        var estacion = "otoño";

        switch(estacion){
            case "primavera":
            System.out.println("La estacion es Primavera");
            break;
            case "verano":
            System.out.println("La estacion es Verano");
            break;
            case "otoño":
            System.out.println("La estacion es Otoño");
            break;
            case "invierno":
            System.out.println("La estacion es invierno");
            break;
            default:
            System.out.println("El valor no es correcto");

        }

    }

  


}