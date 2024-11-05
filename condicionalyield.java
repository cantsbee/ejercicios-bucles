import java.util.*;
public class bucles1 {
    public static void main(String[]args) {
String message = switch (number) {
    case ONE -> {
        yield "Got a 1";
    }
    case TWO -> {
        yield "Got a 2";
    }
    case THREE, FOUR -> {
        yield "More than 2";
    }
};
    }
}

switch (expression) { 
    case value1:
     // secuencia de sentencias.
     break;
    case value2:
     // secuencia de sentencias.
     break;
    .
    .
    . 
    case valueN :
     // secuencia de sentencias.
     break;
    default:
     // Default secuencia de sentencias.
  }


  int i = 2;

switch(i) {
  case 0:
  case 1:
  case 2:
  case 3:
  case 4:
    System.out.println("i es menor que cinco");
    break;
  case 5:
    System.out.println("i es cinco");
    break;
  case 6:
  case 7:
  case 8:
  case 9:
    System.out.println("i es menor que diez y mayor a cinco");
    break;
  default:
    System.out.println("i es diez o mayor a diez");