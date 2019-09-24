package com.finalproject.automated.refactoring.tool.duplicate.code.detection.model;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class ClonePair {

    @Builder.Default
    private List<CloneCandidate> cloneCandidates = new ArrayList<>();
}
