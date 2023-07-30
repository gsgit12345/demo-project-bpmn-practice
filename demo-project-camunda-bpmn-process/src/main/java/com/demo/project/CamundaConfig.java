package com.demo.project;

import org.camunda.bpm.engine.impl.cfg.StandaloneInMemProcessEngineConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CamundaConfig extends StandaloneInMemProcessEngineConfiguration {
}
