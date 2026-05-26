package com.miragesql.miragesql.filter;

import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import com.miragesql.miragesql.session.Session;
import com.miragesql.miragesql.session.SessionFactory;
import com.miragesql.miragesql.util.ExceptionUtil;

/**
 * This filter implements the  <em>Open Session in View</em> pattern in Mirage-SQL.
 * <p>
 * This filter has to be used with {@link Session} and manages transaction automatically through methods of that.
 *
 * @author Naoki Takezoe
 */
public class OpenSessionInViewFilter implements Filter {

    private static final Logger logger = LoggerFactory.getLogger(OpenSessionInViewFilter.class);

    //	@Override
    /**
     * {@inheritDoc}
     */
    public void destroy() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    /**
     * {@inheritDoc}
     */
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    //	@Override
    /**
     * {@inheritDoc}
     */
    public void init(FilterConfig filterConfig) throws ServletException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
