package class04;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationsBeforeClass {

    @BeforeClass
    public void heelo(){
        System.out.println("I am before the class");
    }
    @Test
    public void testb(){
        System.out.println("I am TestB");
    }
}
