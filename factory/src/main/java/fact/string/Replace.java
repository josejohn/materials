package fact.string;

/*
 * Write a method to replace all spaces in a string with ‘%20’.
 */
public class Replace {


  public static void main(String[] args) {
    char []str = {'a', 'b',' '};

    ReplaceFun(str, 3);
  }
  public static void ReplaceFun(char[] str, int length) {
    int spaceCount = 0, newLength, i = 0;
    for (i = 0; i < length; i++) {
      if (str[i] == ' ') {
        spaceCount++;
      }
    }
    newLength = length + spaceCount * 2;
    char newStr[] = new char[newLength];

    for (i = length - 1; i >= 0; i--) {
      if (str[i] == ' ') {
        newStr[newLength - 1] = '0';
        newStr[newLength - 2] = '2';
        newStr[newLength - 3] = '%';
        newLength = newLength - 3;
      }
      else {
        newStr[newLength - 1] = str[i];
        newLength = newLength - 1;
      }
    }

    System.out.println(newStr);

  }
}
