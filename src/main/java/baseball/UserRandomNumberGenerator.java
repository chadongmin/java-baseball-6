package baseball;

import java.util.ArrayList;
import java.util.List;

public class UserRandomNumberGenerator {
    public List<Integer> setUserInputRandomNumber(String userInputString){
        //3자리가 맞는지 validate
        List<Integer> userInputList = new ArrayList<>();
        for(var a : userInputString.toCharArray()){
            userInputList.add(Integer.parseInt(String.valueOf(a)));
        }
        return userInputList;
    }
}
