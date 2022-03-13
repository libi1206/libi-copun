package org.libi.common.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * description : PageDTO
 *
 * @author : wanghaifeng
 * date : 2021/8/1
 */
@Getter
@Setter
@ToString
public class PageDTO {
    /**
     * 上一个列表的最后的id
     */
    private Long lastId;
    /**
     * 查询分页的大小
     */
    private Integer pageSize;
    /**
     * 查询页数
     */
    private Integer page;

    public PageDTO() {
        this.pageSize = 10;
        this.page = 1;
    }
}
