class nesting2 {
  
    static public boolean nestParen(String str) {

      if (str.length() % 2 != 0) {
          return false;  
      }
      else if (str.length() == 0) {
        return true;
    }

      else if (str.length() != 0 && str.length() % 2 == 0) {
        if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')'){
            String newStr = "";
            for (int i = 1; i < str.length() - 1; i++) {
                newStr += str.charAt(i);
            }
            nestParen(newStr);
        } 
      }
      return false;
    }
    public static void main(String[] args) {
        boolean result = nestParen("(())");
        System.out.println(result);
    }
}