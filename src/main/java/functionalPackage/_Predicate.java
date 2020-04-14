package functionalPackage;

import java.util.function.Predicate;

public class _Predicate {

    static Predicate<String> isPhoneValidPredicate = phoneNumber -> phoneNumber.startsWith("+91") && phoneNumber.length() == 11;
    static Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");

    public static void main(String[] args) {
        System.out.println(isValidPhoneNumber("+9170203204"));
        System.out.println(isValidPhoneNumber("00970203204"));
        System.out.println(isValidPhoneNumber("+9100000000978797"));

//      functional way
        System.out.println(isPhoneValidPredicate.test("+9170203204"));
        System.out.println(isPhoneValidPredicate.test("00970203204"));
        System.out.println(isPhoneValidPredicate.test("+9100000000978797"));
//      Predicate - AND => both predicates must be true
        System.out.println(isPhoneValidPredicate.and(containsNumber3).test("+9170203204"));
//      Predicate - OR => either predicates must be true
        System.out.println(isPhoneValidPredicate.or(containsNumber3).test("+9170200204"));


    }

    static boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.startsWith("+91") && phoneNumber.length() == 11;
    }
}

