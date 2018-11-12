package org.jbakery.arguments;

public class Argument
{
	private Argument() { }

	public static byte notNegative(byte argument, String argumentName)
	{
		Argument.notNull(argumentName, "argumentName");

		if (argument < 0)
			throw new NegativeArgumentException(argumentName);

		return argument;
	}

	public static short notNegative(short argument, String argumentName)
	{
		Argument.notNull(argumentName, "argumentName");

		if (argument < 0)
			throw new NegativeArgumentException(argumentName);

		return argument;
	}

	public static int notNegative(int argument, String argumentName)
	{
		Argument.notNull(argumentName, "argumentName");

		if (argument < 0)
			throw new NegativeArgumentException(argumentName);

		return argument;
	}

	public static long notNegative(long argument, String argumentName)
	{
		Argument.notNull(argumentName, "argumentName");

		if (argument < 0)
			throw new NegativeArgumentException(argumentName);

		return argument;
	}

	public static <T> T notNull(T argument, String argumentName)
	{
		if (argument == null)
			throw new NullArgumentException(argumentName);

		return argument;
	}
}
