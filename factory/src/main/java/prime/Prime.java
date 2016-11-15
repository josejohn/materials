package prime;

/**
 * @author jjohn
 *
 */
public class Prime {

 public static void main(String[] args) {
//   System.out.println(isPrime(2));
   printPrimes(10);
}

  static boolean isPrime(int n) {
    //check if n is a multiple of 2
    if(n==2) return true;
    if (n%2==0) return false;
    //if not, then just check the odds
    for(int i=3;i*i<=n;i+=2) {
        if(n%i==0)
            return false;
    }
    return true;
}

  static void printPrimes(int n){
    int primesFOund = 0;
    int num = 2;
    while(primesFOund <n){
      if(isPrime(num)){
        primesFOund++;
        System.out.println(num);
      }
      num++;
    }
  }
}
