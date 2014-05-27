package hashtag;

import static org.junit.Assert.*;

import org.junit.Test;

public class HashtagTest {

	@Test
	public void devePossuirTabuleiroVazioNoInicio() {
		Hashtag hashtag = new Hashtag();
		
		assertTrue(hashtag.isEmpty());
	}

}
