package OOPs;

public class Fraction {
    public static fraction add(fraction f1, fraction f2){
        int numerator= f1.num*f2.den + f2.num*f1.den;
        int denominator= f1.den*f2.den;
        fraction f3= new fraction(numerator, denominator);
        f3.simplfy();
        return f3;
    }

    public static fraction mul(fraction f1, fraction f2){
        int numerator= f1.num*f2.num;
        int denominator= f1.den*f2.den;
        fraction f3= new fraction(numerator, denominator);
        f3.simplfy();
        return f3;
    }

    public static fraction div(fraction f1, fraction f2){
        int numerator= f1.num*f2.den;
        int denominator= f1.den*f2.num;
        fraction f3= new fraction(numerator, denominator);
        f3.simplfy();
        return f3;
    }

    public static int gcd(int num, int den){
        int min = Math.min(num, den);
        for(int i=min; i>=1; i--){
            if(den%i==0 && num%i==0) return i;
        }
        return min;
    }

    public static class fraction{
        int num;
        int den;

        public fraction(int num, int den){
            this.num= num;
            this.den= den;
    }

    public void simplfy(){
//            if(num<den){
//                den= den/num;
//                num=1;
//            }

        int HCF= gcd(num, den);
        num /= HCF;
        den /= HCF;
    }
    }

    public static void main(String[] args){
        fraction f1 =new fraction(35,21);
        f1.simplfy();
        System.out.println(f1.num+"/"+f1.den);
        fraction f2 =new fraction(5,3);
        fraction f3 =add(f1,f2);
        System.out.println(f3.num+"/"+f3.den);
        fraction f4 =mul(f1,f2);
        System.out.println(f4.num+"/"+f4.den);
        fraction f5 =div(f1,f2);
        System.out.println(f5.num+"/"+f5.den);
    }
}
