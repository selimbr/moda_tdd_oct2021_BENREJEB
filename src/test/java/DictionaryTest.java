import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class DictionaryTest {

    Dictionary dic;

    @Test public void testDictionaryName() {
        dic=new Dictionary("Example");
        assertThat(dic.getName(), (equalTo("Example")));
    }
   /* @Test public void doNthing(){
        Assert.assertFalse(t);
    }*/

    @Test public void testIsEmpty(){
        dic= new Dictionary("nom");
        assertThat(dic.isEmpty(),equalTo(true));

    }

    @Test public void testOneTranslation() {
        dic=new Dictionary("nom");
        dic.addTranslation("contre", "against");
        assertThat(dic.getTranslation("contre"), equalTo("against"));
    }
}
