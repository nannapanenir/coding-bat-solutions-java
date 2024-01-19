
/**
 *   
Given a string, return a new string where the first and last chars have been exchanged.


frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
 * 
 */

public String frontBack(String str) {
  
  if (str.length()>=2)
  {
    String front =str.substring(0,1);
    String back = str.substring(str.length()-1);
    return str.length()>=2 ? back + str.substring(1,str.length()-1) + front : str;
  }
  return str;
}
