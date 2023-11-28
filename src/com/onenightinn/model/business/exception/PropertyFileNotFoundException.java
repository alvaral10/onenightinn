package com.onenightinn.model.business.exception;

import java.io.Serial;

public class PropertyFileNotFoundException extends Exception
{
    @Serial
    private static final long serialVersionUID = 1L;

	public PropertyFileNotFoundException(final String inMessage, final Throwable inNestedException)
    {
        super(inMessage, inNestedException);
    }
}
