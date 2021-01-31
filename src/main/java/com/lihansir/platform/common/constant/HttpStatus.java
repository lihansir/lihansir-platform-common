/*
 * Copyright Li Han Holding.
 */

package com.lihansir.platform.common.constant;

/**
 * http response status
 *
 * @author <a href="https://www.lihansir.com">Li Han</a>
 */
public class HttpStatus {

    /**
     * success
     */
    public static final int SUCCESS = 200;

    /**
     * Object created successfully
     */
    public static final int CREATED = 201;

    /**
     * The request has been accepted
     */
    public static final int ACCEPTED = 202;

    /**
     * The operation was successful, but no data was returned
     */
    public static final int NO_CONTENT = 204;

    /**
     * The resource has been removed
     */
    public static final int MOVED_PERM = 301;

    /**
     * redirect
     */
    public static final int SEE_OTHER = 303;

    /**
     * The resource was not modified
     */
    public static final int NOT_MODIFIED = 304;

    /**
     * Parameter list error (missing, format mismatch)
     */
    public static final int BAD_REQUEST = 400;

    /**
     * Unauthorized
     */
    public static final int UNAUTHORIZED = 401;

    /**
     * Restricted access, authorization expired
     */
    public static final int FORBIDDEN = 403;

    /**
     * Resource, service not found
     */
    public static final int NOT_FOUND = 404;

    /**
     * HTTP method not allowed
     */
    public static final int BAD_METHOD = 405;

    /**
     * Resource conflict, or the resource is locked
     */
    public static final int CONFLICT = 409;

    /**
     * Unsupported data, media type
     */
    public static final int UNSUPPORTED_TYPE = 415;

    /**
     * System internal error
     */
    public static final int ERROR = 500;

    /**
     * Interface not implemented
     */
    public static final int NOT_IMPLEMENTED = 501;

}
