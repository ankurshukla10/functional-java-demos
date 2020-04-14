package functionalPackage;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());
        //functional way
        System.out.println(supplyDBConnectionUrl.get());
    }

    static String getDBConnectionUrl(){
        return "jdbc://localhost:9876/users";
    }
    static Supplier<String> supplyDBConnectionUrl = () -> "jdbc://localhost:9876/users";
}
