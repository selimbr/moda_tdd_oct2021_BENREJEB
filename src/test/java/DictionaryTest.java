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
    public void initialize () {
        dic = new Dictionary("Example");
        List<String> traduc = new ArrayList<>();


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
    public void testMulpTranslation() {

        List<String> traduc = new ArrayList<>();
        traduc.add("hello");
        traduc.add("GoodMorning");
        assertThat(traduc, containsInAnyOrder("hello","GoodMorning"));

    }







}
