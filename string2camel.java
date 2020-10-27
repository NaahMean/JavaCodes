import java.lang.StringBuilder;
class Solution{

  static String toCamelCase(String s){
      String[] parts = s.split("_|-");
      String camelCaseString = parts[0];
    for (int i =1; i<parts.length; i++){
      char[] temp = parts[i].toCharArray();
      temp[0] = Character.toUpperCase(temp[0]);
      String temp1 = String.valueOf(temp);
      cameCaseString = camelCaseString + temp1;
    }
  return camelCaseString;
  }
}
	   


