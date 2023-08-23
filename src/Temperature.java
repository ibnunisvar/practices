import java.util.Scanner;

public class Temperature {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature ");
        double temp = sc.nextDouble();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the Unit (C/F) ");
        String unit = sc2.nextLine();

        if (unit.equals("F")||unit.equals("f")){
            System.out.println(FahrenheitConverter.toCelsius(temp));
        } else if (unit.equals("C")||unit.equals("c")) {
            System.out.println(CelsiusConverter.toFahrenheit(temp));
        } else{
            System.out.println("error");
        }

//        int fahrenheit = 212;
//        double celsius = 98.5;

//        System.out.println("Fahrenheit value before converting to celsius : " + fahrenheit);
//        System.out.println("Fahrenheit value after converting to celsius : " + (fahrenheit-32)*5/9);
//        System.out.println("Celsius value before converting to fahrenheit : " + celsius);
//        System.out.println("Celsius value after converting to fahrenheit : " + ((9*celsius/5)+32));


    }


    class FahrenheitConverter {
        public static double toCelsius(double fahrenheit) {
            return (fahrenheit - 32) * 5 / 9;
        }
    }

    class CelsiusConverter{
        public static double toFahrenheit(double celsius){
            return (9*celsius/5)+32;
        }
    }


}
