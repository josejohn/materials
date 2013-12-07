package fact.exceptions;

public class TestA {

	void fn() throws TestRuntimeException {
		throw new TestRuntimeException("Testing");
	}
}
