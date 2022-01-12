package com.cfgs;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {controller_bean.class,dao_bean.class,service_bean.class})
public class appConfig {

}
