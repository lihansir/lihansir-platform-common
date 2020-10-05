/*
 * Copyright Li Han Holding.
 */

package com.lihansir.platform.common.rest;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * Paging results object
 * </p>
 *
 * @author <a href="https://www.lihansir.com">Li Han</a>
 * @date Created in 2020/10/03 10:52
 **/
public class PageResult<T> implements Serializable {

    private static final long serialVersionUID = -3806254586122133426L;

    /**
     * <p>
     * Total data
     * </p>
     *
     * @author <a href="https://www.lihansir.com">Li Han</a>
     * @date Created in 2020/10/03 10:54
     */
    private float count;

    /**
     * <p>
     * Current page number
     * </p>
     *
     * @author <a href="https://www.lihansir.com">Li Han</a>
     * @date Created in 2020/10/03 10:54
     */
    private int pageNo;

    /**
     * <p>
     * Current number of items per page
     * </p>
     *
     * @author <a href="https://www.lihansir.com">Li Han</a>
     * @date Created in 2020/10/03 10:54
     */
    private int pageSize;

    /**
     * <p>
     * PageCount
     * </p>
     *
     * @author <a href="https://www.lihansir.com">Li Han</a>
     * @date Created in 2020/10/03 10:54
     */
    private int totalPage;

    /**
     * <p>
     * data
     * </p>
     *
     * @author <a href="https://www.lihansir.com">Li Han</a>
     * @date Created in 2020/10/03 10:54
     */
    private List<T> data;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public float getCount() {
        return count;
    }

    public void setCount(float count) {
        this.count = count;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public static <T> PageResultBuilder<T> builder() {
        return new PageResultBuilder<>();
    }

    public static final class PageResultBuilder<T> {

        private float count;
        private int pageNo;
        private int pageSize;
        private int totalPage;
        private List<T> data;

        private PageResultBuilder() {}

        public PageResultBuilder<T> count(float count) {
            this.count = count;
            return this;
        }

        public PageResultBuilder<T> pageNo(int pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        public PageResultBuilder<T> pageSize(int pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        public PageResultBuilder<T> totalPage(int totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public PageResultBuilder<T> data(List<T> data) {
            this.data = data;
            return this;
        }

        public PageResult<T> build() {
            PageResult<T> pageResult = new PageResult<>();
            pageResult.setCount(count);
            pageResult.setPageNo(pageNo);
            pageResult.setPageSize(pageSize);
            pageResult.setTotalPage(totalPage);
            pageResult.setData(data);
            return pageResult;
        }
    }

}
