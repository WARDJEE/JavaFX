package week05.model;

import java.util.ArrayList;
import java.util.Collection;

public class ThrowsArchive {

    Collection archiveOfThrows;
    public ThrowsArchive () {
        archiveOfThrows = new ArrayList();
    }
    public void addValueToArchive (MultiSidedDice dice) {
        archiveOfThrows.add(dice);
    }
    public int getTotalNumberOfThrows () {
        int sum = 0;
        return sum;
    }
    @Override
    public String toString () {
        String string = this.archiveOfThrows.toString();
        return string;
    }
}
