package com.onenightinn.model.services.exception;

import java.io.Serial;

public class RegistrationException extends Exception {

    /**
     *
     */
    @Serial
    private static final long serialVersionUID = 1L;

    public RegistrationException(final String inMessage, final Throwable inNestedException)
    {
        super(inMessage, inNestedException);
    }
}