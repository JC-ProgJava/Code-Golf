import java.math.BigDecimal;
import java.math.MathContext;

interface P{
  static void main(String[]a){
    BigDecimal val = new BigDecimal(2);
    val = val.multiply(new BigDecimal(2).sqrt(MathContext.DECIMAL128)).divide(new BigDecimal(9801), MathContext.DECIMAL128);
    BigDecimal sum=BigDecimal.ZERO;
    for (int k = 0; k < 25; k++) {
      sum = sum.add(BigDecimal.valueOf(f(4 * k + 1) * (1103 + 26390 * k)).divide(BigDecimal.valueOf(Math.pow(f(k), 4) * Math.pow(396, 4 * k)), MathContext.DECIMAL128));
    }
    System.out.printf("%.1000f",BigDecimal.ONE.divide(val.multiply(sum), MathContext.DECIMAL128));
  }
  static double f(int i){
    return i>0?i*f(i-1):1;
  }
}
