package org.jbakery.arguments;

public class ArgumentException
	extends RuntimeException
{
	private final String argumentName, message;

	public ArgumentException(final String argumentName, final String message)
	{
		this.argumentName = argumentName;
		this.message = message;
	}

	public String getArgumentName()
	{
		return argumentName;
	}

	@Override
	public String getMessage()
	{
		return message;
	}

	@Override
	public String toString()
	{
		return String.format("Argument \"%s\": %s\n\n%s", argumentName, message, super.toString());
	}
}
