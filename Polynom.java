
import java.util.Arrays;

/**
 *
 * @author Filip Charouzd
 */
public class Polynom {

    private double[] coefRev;
//konstruktory

    private Polynom(double[] coef) {
        this.coefRev = Arrays.copyOf(coef, coef.length);//defenzivní kopie
    }
//tování metody

    /**
     * this makes new polynom. give vector of coeficients and If it is
     * orderd(from x^n...x^0) or not
     *
     * @param coef
     * @param inOrder
     * @return
     */
    public Polynom(double[] c, boolean inOrder) {
        if (inOrder) {
            this.coefRev = Arrays.copyOf(c, c.length);
        } else {
            double[] coef = new double[c.length];
            for (int i = 0; i < coef.length; i++) {
                coef[i] = c[c.length - 1 - i];
            }

            this.coefRev = Arrays.copyOf(coef, coef.length);
        }
    }

    public double[] getCoefRev() {
        return Arrays.copyOf(this.coefRev, this.coefRev.length);
    }

    public int getLevel() {
        int length = this.coefRev.length;
        for (int i = 0; i < length; i++) {
            if (this.coefRev[i] == 0) {
                length = length - 1;
            } else {
                return length;
            }
        }
        return length;
    }

    public double getOneCoef(int n) {
        if (n > this.coefRev.length || n < 0) {
            return 0;
        }
        return this.coefRev[n];
    }

    public String toString() {
        return "koeficienty jsou  " + Arrays.toString(Arrays.copyOf(this.coefRev, this.coefRev.length));
    }

    public Polynom derivate() {
        double[] derv = new double[this.coefRev.length - 1];
        for (int i = 0; i < derv.length; i++) {
            derv[i] = this.coefRev[i] * (this.coefRev.length - 1 - i);
        }
        return new Polynom(derv);
    }

public String showPolynom(){
String vysl="f(x)=";
for(int i=0;i<this.getLevel();i++){
 vysl=vysl+" "+this.getOneCoef(i)+"x^"+(this.getLevel()-i);
}
vysl=vysl+" "+this.getOneCoef(this.coefRev.length-1);
return vysl;
}
}
