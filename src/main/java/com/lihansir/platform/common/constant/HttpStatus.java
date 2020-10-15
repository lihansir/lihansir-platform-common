/*
 * Copyright Li Han Holding.
 */

package com.lihansir.platform.common.constant;

/**
 * <p>
 * http response status
 * </p>
 *
 * @author <a href="https://www.lihansir.com">Li Han</a>
 * @date Created in 2020/10/03 10:36
 */
public class HttpStatus {

    /**
     * <p>
     * success
     * </p>
     *
     * @author <a href="https://www.lihansir.com">Li Han</a>
     * @date Created in 2020/10/03 10:37
     */
    public static final int SUCCESS = 200;

    /**
     * <p>
     * Object created successfully
     * </p>
     *
     * @author <a href="https://www.lihansir.com">Li Han</a>
     * @date Created in 2020/10/03 10:37
     */
    public static final int CREATED = 201;

    /**
     * <p>
     * The request has been accepted
     * </p>
     *
     * @author <a href="https://www.lihansir.com">Li Han</a>
     * @date Created in 2020/10/03 10:37
     */
    public static final int ACCEPTED = 202;

    /**
     * <p>
     * The operation was successful, but no data was returned
     * </p>
     *
     * @author <a href="https://www.lihansir.com">Li Han</a>
     * @date Created in 2020/10/03 10:37
     */
    public static final int NO_CONTENT = 204;

    /**
     * <p>
     * The resource has been removed
     * </p>
     *
     * @author <a href="https://www.lihansir.com">Li Han</a>
     * @date Created in 2020/10/03 10:37
     */
    public static final int MOVED_PERM = 301;

    /**
     * <p>
     * redirect
     * </p>
     *
     * @author <a href="https://www.lihansir.com">Li Han</a>
     * @date Created in 2020/10/03 10:37
     */
    public static final int SEE_OTHER = 303;

    /**
     * <p>
     * The resource was not modified
     * </p>
     *
     * @author <a href="https://www.lihansir.com">Li Han</a>
     * @date Created in 2020/10/03 10:37
     */
    public static final int NOT_MODIFIED = 304;

    /**
     * <p>
     * Parameter list error (missing, format mismatch)
     * </p>
     *
     * @author <a href="https://www.lihansir.com">Li Han</a>
     * @date Created in 2020/10/03 10:37
     */
    public static final int BAD_REQUEST = 400;

    /**
     * <p>
     * Unauthorized
     * </p>
     *
     * @author <a href="https://www.lihansir.com">Li Han</a>
     * @date Created in 2020/10/03 10:37
     */
    public static final int UNAUTHORIZED = 401;

    /**
     * <p>
     * Restricted access, authorization expired
     * </p>
     *
     * @author <a href="https://www.lihansir.com">Li Han</a>
     * @date Created in 2020/10/03 10:37
     */
    public static final int FORBIDDEN = 403;

    /**
     * <p>
     * Resource, service not found
     * </p>
     *
     * @author <a href="https://www.lihansir.com">Li Han</a>
     * @date Created in 2020/10/03 10:37
     */
    public static final int NOT_FOUND = 404;

    /**
     * <p>
     * HTTP method not allowed
     * </p>
     *
     * @author <a href="https://www.lihansir.com">Li Han</a>
     * @date Created in 2020/10/03 10:37
     */
    public static final int BAD_METHOD = 405;

    /**
     * <p>
     * Resource conflict, or the resource is locked
     * </p>
     *
     * @author <a href="https://www.lihansir.com">Li Han</a>
     * @date Created in 2020/10/03 10:37
     */
    public static final int CONFLICT = 409;

    /**
     * <p>
     * Unsupported data, media type
     * </p>
     *
     * @author <a href="https://www.lihansir.com">Li Han</a>
     * @date Created in 2020/10/03 10:37
     */
    public static final int UNSUPPORTED_TYPE = 415;

    /**
     * <p>
     * System internal error
     * </p>
     *
     * @author <a href="https://www.lihansir.com">Li Han</a>
     * @date Created in 2020/10/03 10:37
     */
    public static final int ERROR = 500;

    /**
     * <p>
     * Interface not implemented
     * </p>
     *
     * @author <a href="https://www.lihansir.com">Li Han</a>
     * @date Created in 2020/10/03 10:37
     */
    public static final int NOT_IMPLEMENTED = 501;

}
