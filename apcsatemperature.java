import java.util.Scanner;

public class apcsatemperature {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);



//ENTER ORIGIN SCALE
      System.out.print("\nEnter an origin scale: ");

      String oscale = in.nextLine();

      oscale = oscale.toUpperCase();

//ENTER Destination SCALE
      System.out.print("\nEnter a destination scale: ");



      String nscale = in.nextLine();

      nscale = nscale.toUpperCase();

//ENTER Temperature
      System.out.print("\nEnter a temperature: ");

      double temperature = in.nextDouble();

double tempnew = 0;


      if (oscale.equals("F") && nscale.equals("C")) {
        tempnew = (temperature - 32) * 59;
}
else if (oscale.equals("F") && nscale.equals("K")){
tempnew= (temperature - 32) * 59 + 273.15;

}
else if (oscale.equals("C") && nscale.equals("F")) {
  tempnew=  (temperature * 95 ) + 32;
}
else if (oscale.equals("C") && nscale.equals("K")){
  tempnew=  temperature + 273.15;
}
else if (oscale.equals("K") && nscale.equals("F")) {
  tempnew=  (temperature - 273.15 ) * 95 + 32;

}
else if (oscale.equals("K") && nscale.equals("C")){
  tempnew=  temperature - 273.15;

}

      else {

        System.out.println("\nThat's not a valid scale.");

      }

      System.out.printf("\n%.1f degrees %c equals %.1f degrees %c", temperature, oscale, tempnew, nscale);

      in.close();
    }

}
