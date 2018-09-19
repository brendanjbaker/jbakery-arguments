package org.jbakery.arguments;

public class NullArgumentException
	extends RuntimeException
{
	public NullArgumentException(String argumentName)
	{
		super(String.format("Argument \"%s\" may not be null.", argumentName));
	}
}
