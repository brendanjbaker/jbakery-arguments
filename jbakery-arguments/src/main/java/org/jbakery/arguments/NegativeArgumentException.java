package org.jbakery.arguments;

public class NegativeArgumentException
	extends RuntimeException
{
	public NegativeArgumentException(String argumentName)
	{
		super(String.format("Argument \"%s\" may not be negative.", argumentName));
	}
}
