package com.example.forum.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

@Service
public class BrokenJavaDelegate implements JavaDelegate {
    public void execute(final DelegateExecution delegateExecution) {
        throw new RuntimeException("Uh oh");
    }
}
