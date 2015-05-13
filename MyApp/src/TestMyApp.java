import org.junit.Test;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
 

 
import junit.framework.Assert;
import junit.framework.TestCase;


/**
 *
 * @author Braxis
 */

@RunWith(value = Parameterized.class)
public class TestMyApp {
    private static int tearDownCount = 0;
    private static int setUpCount = 0;
    private int parameter;
 
    public TestMyApp(int parameter) {
        this.parameter = parameter;
    }
 

}