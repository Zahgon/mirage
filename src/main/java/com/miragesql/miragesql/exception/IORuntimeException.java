package com.miragesql.miragesql.exception;

import java.io.IOException;

@SuppressWarnings("serial")
public class IORuntimeException extends RuntimeException {

    public IORuntimeException(String message, IOException cause) {
        super(message, cause);
    }

    public IORuntimeException(IOException cause) {
        super(cause);
    }

    @Override
    public IOException getCause() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
