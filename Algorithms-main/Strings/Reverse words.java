public String reverseWords(String s) {
      String[] w = s.trim().split("\\s+");
      StringBuilder sp = new StringBuilder();
      for(int i = w.length-1; i >= 0; i--){
          sp.append(w[i]);
          if( i > 0){
              sp.append(" ");
          }

      }
      return sp.toString();
    }


// Input: s = "the sky is blue"
// Output: "blue is sky the"
