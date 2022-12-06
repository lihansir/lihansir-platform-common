/*
 * Copyright Li Han Holding.
 */

package com.lihansir.platform.common.rest;

import java.io.Serializable;
import java.util.List;

/**
 * Paging results object
 *
 * @author <a href="https://www.lihansir.com">Li Han</a>
 */
public class PageResult<T> implements Serializable {

    private static final long serialVersionUID = -3806254586122133426L;

    /**
     * Total data
     */
    private long total;

    /**
     * Current page number
     */
    private long currentPage;

    /**
     * Current number of items per page
     */
    private long pageSize;

    /**
     * PageCount
     */
    private long totalPage;

    /**
     * data
     */
    private List<T> data;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public long getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(long currentPage) {
        this.currentPage = currentPage;
    }

    public long getPageSize() {
        return pageSize;
    }

    public void setPageSize(long pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(long totalPage) {
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

        private long total;
        private long currentPage;
        private long pageSize;
        private long totalPage;
        private List<T> data;

        private PageResultBuilder() {}

        public PageResultBuilder<T> total(long total) {
            this.total = total;
            return this;
        }

        public PageResultBuilder<T> currentPage(long currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        public PageResultBuilder<T> pageSize(long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        public PageResultBuilder<T> totalPage(long totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public PageResultBuilder<T> data(List<T> data) {
            this.data = data;
            return this;
        }

        public PageResult<T> build() {
            PageResult<T> pageResult = new PageResult<>();
            pageResult.setTotal(this.total);
            pageResult.setCurrentPage(this.currentPage);
            pageResult.setPageSize(this.pageSize);
            pageResult.setTotalPage(this.totalPage);
            pageResult.setData(this.data);
            return pageResult;
        }
    }

}
