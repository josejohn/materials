package fact.dyn.lcs;

public class LCS {

  public static void main(String[] args) {

    LCS lcs = new LCS();

    System.out.println(lcs.lcs("BANANAZ", "sANkANAc"));
  }

  public String lcs(String s1, String s2){

    if(s1.length() ==0 || s2.length() ==0)
      return "";

    if(s1.charAt(s1.length()-1) == s2.charAt(s2.length()-1))
      return lcs(s1.substring(0,s1.length()-1), s2.substring(0, s2.length()-1))+s1.charAt(s1.length()-1);
    else{
      String l = lcs(s1, s2.substring(0, s2.length()-1));
      String r = lcs(s1.substring(0,s1.length()-1), s2);

      if(l.length() > r.length())
        return l;
      else
        return r;
    }

  }
}
