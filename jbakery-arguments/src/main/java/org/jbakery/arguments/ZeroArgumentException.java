package org.jbakery.arguments;

public class ZeroArgumentException
	extends RuntimeException
{
	public ZeroArgumentException(String argumentName)
	{
		super(String.format("Argument \"%s\" may not be zero.", argumentName));
	}
}
