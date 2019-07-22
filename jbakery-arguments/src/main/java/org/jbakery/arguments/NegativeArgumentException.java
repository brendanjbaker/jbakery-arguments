package org.jbakery.arguments;

public class NegativeArgumentException
	extends ArgumentException
{
	public NegativeArgumentException(String argumentName)
	{
		super(argumentName, "May not be negative.");
	}
}
