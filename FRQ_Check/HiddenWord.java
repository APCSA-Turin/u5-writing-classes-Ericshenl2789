// type up the complete HiddenWord class here
public class HiddenWord{
    private String word;
    
    public HiddenWord(String hiddenWord){
      word = hiddenWord;
    }
  
    public String getHint(String guess){
      String result = "";
      for(int i = 0; i < guess.length(); i++){
        String letter = guess.substring(i, i+1);
        if(letter.equals(word.substring(i, i+1))){
          result += letter;
        } else if (word.indexOf(letter)>=0){
          result += "+";
        } else{
          result += "*";
        }
      }
      return result;
    }
  }
  