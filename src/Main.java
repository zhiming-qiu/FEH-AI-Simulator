import java.util.Arrays;

import resources.*;

class Main
{
    public static void main(String[] args)
    {
        Assist testAssist = new Assist();
        Special testSpecial = new Special();

        Unit testUnit = new Unit
        ("test", "cavalry", new String[]{"hi"}, testAssist, testSpecial, new Integer[]{1, 2, 3, 4, 5});

        testUnit.setBaseStats(1, 100);
        System.out.println(Arrays.deepToString(testUnit.getBaseStats()));
    }
}