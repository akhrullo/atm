package uz.jl.models;

import lombok.*;
import uz.jl.utils.BaseUtils;

import java.time.LocalDateTime;

/**
 * @author Elmurodov Javohir, Mon 4:45 PM. 12/6/2021
 */


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public abstract class Auditable implements BaseEntity {
    private String id = BaseUtils.genID();
    private String createdBy;
    private LocalDateTime createdAt;
    private String updatedBy;
    private LocalDateTime updatedAt;
    private int deleted;
}
