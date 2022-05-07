package clan.techreturners.testhelper;

import java.util.Random;

public class RandomStub extends Random {
    private int value;

    public RandomStub(int value) {
        this.value = value;
    }

    @Override
    public int nextInt(int bound) {
        return this.value;
    }
}
