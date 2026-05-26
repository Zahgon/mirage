package com.miragesql.miragesql.util;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import com.miragesql.miragesql.exception.IORuntimeException;

public class IOUtil {

    /**
     * Reads an InputStream into a byte array
     * @param in the InputStream to read from
     *
     * @return a byte array red from the InputStream
     *
     * @throws IORuntimeException if some other I/O error occurs.
     */
    public static byte[] readStream(InputStream in) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Loads ("quietly") a property file to a property object
     *
     * @param path the file path
     *
     * @return a property object with properties from a file, or null if the property file
     * can't be opened/accessed.
     */
    public static Properties loadProperties(String path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception ex) {
                /* ignore */
            }
        }
    }
}
