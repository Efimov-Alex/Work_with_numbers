import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasSize;

public class Test {
    @org.junit.jupiter.api.Test
    public void contains() {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        assertThat(intList, hasItems(16, 3));
    }

    @org.junit.jupiter.api.Test
    public void givenAList_whenChecksSize_thenCorrect() {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        assertThat(intList, hasSize(13));
    }
}
