package org.jbakery.arguments;

public class NullArgumentException
	extends ArgumentException
{
	public NullArgumentException(String argumentName)
	{
		super(argumentName, "May not be null.");
	}
}
