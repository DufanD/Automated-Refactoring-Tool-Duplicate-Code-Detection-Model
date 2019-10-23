package com.finalproject.automated.refactoring.tool.duplicate.code.detection.model;

import com.finalproject.automated.refactoring.tool.model.MethodModel;
import com.finalproject.automated.refactoring.tool.model.StatementModel;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dufan Quraish
 * @version 1.0.0
 * @since 8 August 2019
 */

@Data
@Builder
public class CloneCandidate {

    @Builder.Default
    private List<StatementModel> statements = new ArrayList<>();

    private MethodModel methodModel;

    private Long loc;

    private String path;
}
