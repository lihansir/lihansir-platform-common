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
    private float total;

    /**
     * Current page number
     */
    private int currentPage;

    /**
     * Current number of items per page
     */
    private int pageSize;

    /**
     * PageCount
     */
    private int totalPage;

    /**
     * data
     */
    private List<T> data;

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
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

        private float total;
        private int currentPage;
        private int pageSize;
        private int totalPage;
        private List<T> data;

        private PageResultBuilder() {}

        public PageResultBuilder<T> total(float total) {
            this.total = total;
            return this;
        }

        public PageResultBuilder<T> currentPage(int currentPage) {
            this.currentPage = currentPage;
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
            pageResult.setTotal(total);
            pageResult.setCurrentPage(currentPage);
            pageResult.setPageSize(pageSize);
            pageResult.setTotalPage(totalPage);
            pageResult.setData(data);
            return pageResult;
        }
    }

}
