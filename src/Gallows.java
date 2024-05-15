import java.util.ArrayList;
import java.util.List;

public class Gallows {
    private final List<String> gallowsCondition = new ArrayList<>();

    Gallows () {
        gallowsCondition.add(
                """ 
                ---------
                |       |
                |
                |
                |
                |
                |
           _____|_____
           """
        );

        gallowsCondition.add("""
                 ---------
                 |       |
                 |       0
                 |
                 |
                 |
                 |
            _____|_____
            """
        );
        gallowsCondition.add(
                """
                    ---------
                    |       |
                    |       0
                    |      / \\
                    |      \\ /
                    |
                    |
               _____|_____
               """
        );
        gallowsCondition.add(
                """
                ---------
                |       |
                |       0
                |   ---/ \\
                |      \\ /
                |
                |
           _____|_____
           """
        );
        gallowsCondition.add(
                """
                   ---------
                   |       |
                   |       0
                   |   ---/ \\---
                   |      \\ /
                   |
                   |
              _____|_____
              """
        );
        gallowsCondition.add(
                """
                  ---------
                  |       |
                  |       0
                  |   ---/ \\---
                  |      \\ /
                  |     /
                  |    /
             _____|_____
             """
        );
        gallowsCondition.add(
                """
                   ---------
                   |       |
                   |       0
                   |   ---/ \\---
                   |      \\ /
                   |     /   \\
                   |    /     \\
              _____|_____
              """
        );
    }

    public String getCondition(int index) {
        return gallowsCondition.get(index);
    }
}
