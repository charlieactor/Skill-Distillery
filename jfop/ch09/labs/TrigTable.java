import java.lang.Math;

public class TrigTable{
  public static void main(String[] args) {
    String result;
    double i;
    for (i = 0; i <= 3.5; i+= 0.1 ) {
      result = trig(i);
      System.out.println("Angle\t\t\tSin\t\t\tCos\t\t\tTan");
      System.out.println(result + "\n");

    }
  }
  public static String trig(double radians){
    double sin, cos, tan;
    radians = Math.round(radians * 10000.0)/10000.0;
    sin = Math.sin(radians);
    sin = Math.round(sin * 10000.0)/10000.0;
    cos = Math.cos(radians);
    cos = Math.round(cos * 10000.0)/10000.0;
    tan = Math.tan(radians);
    tan = Math.round(tan * 10000.0)/10000.0;

    return radians + "\t\t\t" + sin + "\t\t\t" + cos + "\t\t\t" + tan;

  }
}
