import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class ConverterTest {

    @Test
    public void when5EnteredReturnsFive(){
        //arrange

        //act

        //assert
        assertThat(Converter.toText(5), equalTo("five "));
    }

    @Test
    public void when96EnteredReturnsNinetySix(){
        //arrange

        //act

        //assert
        assertThat(Converter.toText(96), equalTo("ninety six "));}
}
