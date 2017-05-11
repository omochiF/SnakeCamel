
package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class SnakeCamelTest {

	@Test
	public void SnakeToCamelのテストに成功するか(){
		String actual = SnakeCamelUtil.snakeToCamelcase("i_have_an_apple");
		String pico = "IHaveAnApple";
		String actual2 = SnakeCamelUtil.snakeToCamelcase("snake_to_camel");
		String snake = "SnakeToCamel";
		assertThat(actual, is(pico));
		assertThat(actual2, is(snake));
		
	}
	
	@Test
	public void CamelToSnakeのテストに成功するか(){
		String actual = SnakeCamelUtil.camelToSnakecase("IHaveAnApple");
		String pico = "i_have_an_apple";
		String actual2 = SnakeCamelUtil.camelToSnakecase("CamelToSnake");
		String camel = "camel_to_snake";
		
		assertThat(actual, is(pico));		
		assertThat(actual2, is(camel));
		
	}
}
