package uz.jl.models.settings;

import uz.jl.models.BaseEntity;
import uz.jl.utils.BaseUtils;

/**
 * @author Elmurodov Javohir, Mon 6:02 PM. 12/6/2021
 */
public class Language implements BaseEntity {
    private String id = BaseUtils.genID();
    private String code;
}
