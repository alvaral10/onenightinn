package com.onenightinn.model.services.exception;

import java.io.Serial;

public class LoginException extends Exception {

    @Serial
    private static final long serialVersionUID = 6009821813727278428L;

    public LoginException(final String inMessage)
    {
        super(inMessage);
    }


    public LoginException(final String inMessage, final Throwable inNestedException)
    {
        super(inMessage, inNestedException);
    }
}