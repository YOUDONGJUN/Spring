import org.junit.jupiter.api.Test;


public class TestMain {

    public static Object testNotNull(String address) {
        if (address.equals("ok")) {
            return new Object();
        }
        return null;
    }
}
