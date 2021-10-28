import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;


public class DictionaryTest {

    Dictionary dic;

    @Before
    public void initialize() {
        dic = new Dictionary("Example");
        //List<String> traduc = new ArrayList<>();


    }


    @Test
    public void testDictionaryName() {

        assertThat(dic.getName(), (equalTo("Example")));
    }
   /* @Test public void doNthing(){
        Assert.assertFalse(t);
    }*/

    @Test
    public void testIsEmpty() {

        assertThat(dic.isEmpty(), equalTo(true));

    }

    @Test
    public void testOneTranslation() {


        dic.addTranslation("contre", "against");
        dic.addTranslation("x", "y");
        assertThat(dic.getTranslation("contre"), equalTo("against"));
        assertThat(dic.getTranslation("salut"), equalTo("against"));
    }

    @Test
    public void testMultpTranslation() {

        List<String> traduc = new ArrayList<>();
        dic.addTranslation("salut","hello");
        dic.addTranslation("salut","GoodMorning");
        traduc.add("hello");
        traduc.add("GoodMorning");


        assertThat(dic.getMultipleTranslation("salut"), containsInAnyOrder("hello", "GoodMorning"));

    }
    @Test
    public void TestTraductionInverse()
    {
        assertThat( dic.getInverse("against"),equalTo("contre"));
    }




}
