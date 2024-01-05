package no.hiof.softeng2022gruppe23.tjenestedk.classes.payment;

import no.hiof.softeng2022gruppe23.tjenestedk.classes.ads.Car;
import no.hiof.softeng2022gruppe23.tjenestedk.classes.db.JsonFileHandler;
import no.hiof.softeng2022gruppe23.tjenestedk.classes.payment.Payment;
import no.hiof.softeng2022gruppe23.tjenestedk.classes.users.Client;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PaymentTest {
    @Nested
    @DisplayName("Tests making a payment")
    public class makePaymentTest {
        @ParameterizedTest
        @MethodSource("enoughMoney")
        @DisplayName("There is enough money on the account")
        public void testEnoughMoneyOnAccount(String paymentMethod, int amount, boolean enoughMoney, boolean expected, boolean notExpected) {
            assertEquals(expected, new Payment().makePayment(paymentMethod, amount, enoughMoney));
            assertNotEquals(notExpected, new Payment().makePayment(paymentMethod, amount, enoughMoney));
        } public static Stream enoughMoney() {
            return Stream.of(
                    Arguments.of("paypal", 100, true, true, false),
                    Arguments.of("stripe", 100, true, true, false),
                    Arguments.of("vipps", 100, true, true, false),
                    Arguments.of("This service does not exist", 100, true, false, true)
            );
        }
        @ParameterizedTest
        @MethodSource("notEnoughMoney")
        @DisplayName("There is not enough money on the account")
        public void testNotEnoughMoneyOnAccount(String paymentMethod, int amount, boolean enoughMoney, boolean expected, boolean notExpected) {
            assertEquals(expected, new Payment().makePayment(paymentMethod, amount, enoughMoney));
            assertNotEquals(notExpected, new Payment().makePayment(paymentMethod, amount, enoughMoney));
        } public static Stream notEnoughMoney() {
            return Stream.of(
                    Arguments.of("paypal", 100, false, false, true),
                    Arguments.of("stripe", 100, false, false, true),
                    Arguments.of("vipps", 100, false, false, true),
                    Arguments.of("This service does not exist", 100, false, false, true)
            );
        }
    }
    @Nested
    @DisplayName("Tests the API for the payment solutions")
    public class paymentMethodsAPITest {
        @ParameterizedTest
        @MethodSource("enoughMoney")
        @DisplayName("There is enough money on the account")
        public void testEnoughMoneyOnAccount(int amount, boolean enoughMoney, boolean expected, boolean notExpected) {
            assertEquals(expected, new Payment().paymentMethodsAPI(amount, enoughMoney));
            assertNotEquals(notExpected, new Payment().paymentMethodsAPI(amount, enoughMoney));
        } public static Stream enoughMoney() {
            return Stream.of(
                    Arguments.of(42, true, true, false),
                    Arguments.of(420, true, true, false),
                    Arguments.of(240, true, true, false),
                    Arguments.of(9001, true, true, false)
            );
        }
        @ParameterizedTest
        @MethodSource("notEnoughMoney")
        @DisplayName("There is not enough money on the account")
        public void testNotEnoughMoneyOnAccount(int amount, boolean enoughMoney, boolean expected, boolean notExpected) {
            assertEquals(expected, new Payment().paymentMethodsAPI(amount, enoughMoney));
            assertNotEquals(notExpected, new Payment().paymentMethodsAPI(amount, enoughMoney));
        } public static Stream notEnoughMoney() {
            return Stream.of(
                    Arguments.of(42, false, false, true),
                    Arguments.of(420, false, false, true),
                    Arguments.of(240, false, false, true),
                    Arguments.of(9001, false, false, true)
            );
        }
    }
    @Nested
    @DisplayName("Tests the bank transaction API")
    public class bankTransactionAPITest {
        @ParameterizedTest
        @MethodSource("enoughMoney")
        @DisplayName("There is enough money on the account")
        public void testEnoughMoneyOnAccount(int amount, boolean enoughMoney, boolean expected, boolean notExpected) {
            assertEquals(expected, new Payment().paymentMethodsAPI(amount, enoughMoney));
            assertNotEquals(notExpected, new Payment().paymentMethodsAPI(amount, enoughMoney));
        } public static Stream enoughMoney() {
            return Stream.of(
                    Arguments.of(42, true, true, false),
                    Arguments.of(420, true, true, false),
                    Arguments.of(240, true, true, false),
                    Arguments.of(9001, true, true, false)
            );
        }
        @ParameterizedTest
        @MethodSource("notEnoughMoney")
        @DisplayName("There is not enough money on the account")
        public void testNotEnoughMoneyOnAccount(int amount, boolean enoughMoney, boolean expected, boolean notExpected) {
            assertEquals(expected, new Payment().paymentMethodsAPI(amount, enoughMoney));
            assertNotEquals(notExpected, new Payment().paymentMethodsAPI(amount, enoughMoney));
        } public static Stream notEnoughMoney() {
            return Stream.of(
                    Arguments.of(42, false, false, true),
                    Arguments.of(420, false, false, true),
                    Arguments.of(240, false, false, true),
                    Arguments.of(9001, false, false, true)
            );
        }
    }
}