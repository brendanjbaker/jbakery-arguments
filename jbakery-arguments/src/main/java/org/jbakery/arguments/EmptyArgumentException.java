package org.jbakery.arguments;

public class EmptyArgumentException
	extends RuntimeException
{
	public EmptyArgumentException(String argumentName)
	{
		super(String.format("Argument \"%s\" may not be empty.", argumentName));
	}
}
