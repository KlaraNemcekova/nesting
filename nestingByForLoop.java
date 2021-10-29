class nesting{
  
    public boolean nestParen(String str) {
       
        if (str.length() % 2 != 0) {
            return false;
        }

        else {
            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) == '(' && str.charAt(str.length() - 1 - i) == ')'){
                } else {
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        boolean result = nestParen("(j((x)j)");
        System.out.println(result);
    }
}