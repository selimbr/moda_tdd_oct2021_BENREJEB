import org.junit.Assert;
import org.junit.Test;


public class DictionaryTest {

    Dictionary dico;

    @Test public void testDictionaryName() {
        dic=new Dictionary("Example");
        assertThat(dict.getName(), equalTo("Example"));
    }
    @Test public void doNthing(){
        Assert.assertFalse(false);
    }
}
