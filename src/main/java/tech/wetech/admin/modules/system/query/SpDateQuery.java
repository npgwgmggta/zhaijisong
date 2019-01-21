package tech.wetech.admin.modules.system.query;

import tech.wetech.admin.core.utils.BaseQuery;
import tech.wetech.admin.modules.system.po.SpDate;

public class SpDateQuery extends BaseQuery<SpDate> {

    /**
     * 组名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
