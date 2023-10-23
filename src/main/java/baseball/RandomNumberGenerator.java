package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class RandomNumberGenerator {
    public List<Integer> setRandomNumber() {
        List<Integer> list = new ArrayList<>();

        while (list.size() != 3) {
            list.add(Randoms.pickNumberInRange(1, 9));
        }
        return list;
    }
}
