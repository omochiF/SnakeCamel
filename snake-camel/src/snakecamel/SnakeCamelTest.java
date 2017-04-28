
package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class SnakeCamelTest {

	@Test
	public void SnakeToCamelのテストに成功するか(){
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String actual = sc.snakeToCamelcase("I_have_an_apple");
		String pico = "IHaveAnApple";
		
		assertThat(actual, is(pico));		
	}
	
	@Test
	public void CamelToSnakeのテストに成功するか(){
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String actual = sc.camelToSnakecase("iHaveAnApple");
		String pico = "i_have_an_apple";
		
		assertThat(actual, is(pico));		
		
	}
}
