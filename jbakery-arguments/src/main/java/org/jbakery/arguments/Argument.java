package org.jbakery.arguments;

public final class Argument
{
	private Argument() { }

	public static String notEmpty(String argument, String argumentName)
	{
		Argument.notNull(argumentName, "argumentName");
		Argument.notNull(argument, argumentName);

		if (argument.isEmpty())
			throw new EmptyArgumentException(argumentName);

		return argument;
	}

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

	public static byte notNegativeOrZero(byte argument, String argumentName)
	{
		Argument.notNull(argumentName, "argumentName");
		Argument.notNegative(argument, argumentName);
		Argument.notZero(argument, argumentName);

		return argument;
	}

	public static short notNegativeOrZero(short argument, String argumentName)
	{
		Argument.notNull(argumentName, "argumentName");
		Argument.notNegative(argument, argumentName);
		Argument.notZero(argument, argumentName);

		return argument;
	}

	public static int notNegativeOrZero(int argument, String argumentName)
	{
		Argument.notNull(argumentName, "argumentName");
		Argument.notNegative(argument, argumentName);
		Argument.notZero(argument, argumentName);

		return argument;
	}

	public static long notNegativeOrZero(long argument, String argumentName)
	{
		Argument.notNull(argumentName, "argumentName");
		Argument.notNegative(argument, argumentName);
		Argument.notZero(argument, argumentName);

		return argument;
	}

	public static <T> T notNull(T argument, String argumentName)
	{
		if (argumentName == null)
			throw new NullArgumentException("argumentName");

		if (argument == null)
			throw new NullArgumentException(argumentName);

		return argument;
	}

	public static String notNullOrEmpty(String argument, String argumentName)
	{
		Argument.notNull(argumentName, "argumentName");

		Argument.notNull(argument, argumentName);
		Argument.notEmpty(argument, argumentName);

		return argument;
	}

	public static byte notZero(byte argument, String argumentName)
	{
		Argument.notNull(argumentName, "argumentName");

		if (argument == 0)
			throw new ZeroArgumentException(argumentName);

		return argument;
	}

	public static short notZero(short argument, String argumentName)
	{
		Argument.notNull(argumentName, "argumentName");

		if (argument == 0)
			throw new ZeroArgumentException(argumentName);

		return argument;
	}

	public static int notZero(int argument, String argumentName)
	{
		Argument.notNull(argumentName, "argumentName");

		if (argument == 0)
			throw new ZeroArgumentException(argumentName);

		return argument;
	}

	public static long notZero(long argument, String argumentName)
	{
		Argument.notNull(argumentName, "argumentName");

		if (argument == 0)
			throw new ZeroArgumentException(argumentName);

		return argument;
	}
}
