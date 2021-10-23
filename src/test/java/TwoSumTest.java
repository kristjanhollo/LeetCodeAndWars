import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class TwoSumTest {


        @Test
        void testTwoSum() {

            // given
            int[] arrayOne = {2,7,11,15};
            int target = 9;
            int[] answer = {0,1};

            // when
            int[] answerArray = TwoSum1.twoSum(arrayOne, target);

            // then
            assertArrayEquals(answer, answerArray);


        }

        @Test

        void testTwoSumTwo() {

            //given
            int[] arrayOne = {3,2,4};
            int target = 6;
            int[] answer = {1,2};

            // when
            int[] answerArray = TwoSum1.twoSum(arrayOne, target);

            // then
            assertArrayEquals(answer, answerArray);


        }




}
