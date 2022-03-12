package org.libi.common.response;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author cmt
 * @Title:
 * @date 2018/12/29 上午11:48
 */
@Data
@NoArgsConstructor
public class PageResult<T> {
    private long totalSize;
    private List<T> elements;

    public PageResult(List elements, long totalSize) {
        super();
        this.elements = elements;
        this.totalSize = totalSize;
    }
}