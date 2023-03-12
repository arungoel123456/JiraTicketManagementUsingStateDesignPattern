package com.demo.state;

import com.demo.dto.*;

public interface State {
    void startAnalysis();
    void startReview();
    void markDone();
}
