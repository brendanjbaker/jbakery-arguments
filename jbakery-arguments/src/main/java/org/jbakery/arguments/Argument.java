package org.jbakery.arguments;

public class Argument
{
	private Argument() { }

	public static <T> T notNull(T argument, String argumentName)
	{
		if (argument == null)
			throw new NullArgumentException(argumentName);

		return argument;
	}
}
