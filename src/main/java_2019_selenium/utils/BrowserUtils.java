package utils;

public class BrowserUtils {

    //The role of this method is to pause our test execution, so we don't have to
    // keep making a declaration and throwing an exception each time in our code.

    //The formula for milliseconds is written within the parameter of the Thread function,
    //you just have to enter the seconds.

    // when sleep is highlighted make sure you go to context and click to catch generate.
    public static void wait(int seconds){
        try {
            Thread.sleep(1000*seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
