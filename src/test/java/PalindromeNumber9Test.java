import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;




class PalindromeNumber9Test {

    @Test

    void testIsTrue() {

        // Given
        int x = 121;
        // When
        boolean answer = PalindromeNumber9.isPalindrome(x);

        // Then
        assertTrue(answer);



    }

    void testIsFalse() {

        // Given
        int x = -121;

        // When
        boolean answer = PalindromeNumber9.isPalindrome(x);

        // Then

        assertFalse(answer);


    }
}
